package com.sist.server;
import java.util.*;

import com.sist.commons.Function;

import java.io.*;
/*
 * ServerSocket : 고정 port => 대기소켓, 접속을 기다리다 받는 경우 사용
 * Socket : 클라이언트와 통신을 할 때 사용
 *         ---------
 *         ip / port 클라이언트 소켓은 port 고정이 아니라 유동적임
 *         
 * 1. 서버구동
 * 2. 접속자를 받아서 Vector에 저장
 * 3. 접속을 받으면 통신을 따로따로 할 수 있도록 연결 => Thread
 * 4. 통신이 종료되면 나가기 버튼을 클릭하여 스레드 종료
 * */
import java.net.*;

// 접속자의 정보 저장 => IP / PORT
public class Server implements Runnable{

	/* 네트워크에 필요한 클래스 선언 */
	// 접속자 정보 저장
	private Vector<Client> waitVc = new Vector<Client>(); 
	
	// 서버 구동
	private ServerSocket ss;
	
	// 조별 포트 작성
	private final int PORT=8088;
	
	public Server() {
		try {
			/*
			 * 1. bind : 통신망 개통
			 * 2. listen : 접속자 기다리는 것
			 * */
			
			//bind + listen
			ss = new ServerSocket(PORT);
			
			System.out.println("Server Start");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub 
		Server server = new Server(); // 서버 구동
		new Thread(server).start(); // run()

	}
	// 접속자를 받아서 정보 저장 => 쓰레드 배정 (new Thread()) : 교환소켓
	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
			while(true) {
				// s : 클라이언트
				Socket s = ss.accept(); // 접속시에만 호출이 되는 특수 메소드
				
				System.out.println("접속자의 PORT : " + s.getPort());
				System.out.println("접속자의 IP : " + s.getInetAddress().getHostAddress());
				
				// 통신할 Thread 배정
				Client client = new Client(s);
				// 소켓 주인과 통신할 수 있게 연결
				client.start(); // run() 호출
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
	}
	
	// 통신(사용자 요청 -> 처리 후 결과값 응답) 만 수행
	class Client extends Thread{
		String id, name, sex;
		Socket s; //클라이언트 정보
		
		// 통신 준비 (읽기/쓰기 가능하도록)
		BufferedReader in; // 클라이언트의 요청 받기
		OutputStream out; // 요청에 따른 응답 해주기
		
		public Client (Socket s) { // 각 클라이언트마다 값 다름
			this.s = s;
			try {
				// 위치 확인
				out = s.getOutputStream(); // 클라이언트 socket안에서 저장소에서 값 읽어서 클라이언트에서 보내주기
				in = new BufferedReader(new InputStreamReader(s.getInputStream())); // 클라이언트가 요청보낸 값을 가지고 오는 것
				
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}
		
		// 통신
		public void run() {
			try {
				while(true) {
					// 접속자 요청 받기
					String msg = in.readLine();
					System.out.println("client 요청 : "+msg);
					// msg형태 : 100|id|name|sex\n
					StringTokenizer st = new StringTokenizer(msg, "|");
					int protocol = Integer.parseInt(st.nextToken());
					
					switch(protocol) {
					case Function.LOGIN -> { // 로그인 처리
						// 사용자가 보내준 데이터를 받는다
						id=st.nextToken();
						name=st.nextToken();
						sex=st.nextToken();
						
						//이미 접속한 사용자에 메세지를 보낸다.
						messageAll(Function.CHAT+"|[🚨 알림] "+name+"님 입장하셨습니다."); // textarea에 출력
						messageAll(Function.LOGIN+"|"+id+"|"+name+"|"+sex);	// table 에 출력
						
						// 로그인 된 사람 처리
						// 로그인 창 종료 => 대기실창 보여준다
						messageTo(Function.MYLOG+"|"+name);
						
						// 이미 접속된 사용자의 정보를 한번에 전송
						waitVc.add(this);
						for(Client c : waitVc) {
							messageTo(Function.LOGIN+"|"+c.id+"|"+c.name+"|"+c.sex);	// table 에 출력
						}
					}
					case Function.CHAT -> {
						String data = st.nextToken();
						messageAll(Function.CHAT+"|["+name+"] "+data);
					}
					case Function.EXIT -> {
						messageAll(Function.EXIT+"|"+id);
						for(int i=0; i<waitVc.size();i++) {
							Client c = waitVc.get(i);
							if(c.id.equals(id)) {
								messageTo(Function.MYEXIT+"|");
								waitVc.remove(i);
								try {
									//입출력 모두 닫고 권한 끊기
									in.close();
									out.close();
								}catch (Exception e) {
									// TODO: handle exception
									e.printStackTrace();
								}
							}
						}
					}
					} //switch 끝
					
					
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		// 공통 사용
		/*
		 * 원래 thread는 비동기 프로그램인데 동기화 하고싶을 때 synchronized 를 사용
		 * */
		// 개인적으로 메세지 송신
		public synchronized void messageTo(String msg) {
			try {
				out.write((msg+"\n").getBytes());
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}
		
		// 전체적으로 메세지 송신
		public synchronized void messageAll(String msg) {
			try {
				for(Client c : waitVc) {
					c.messageTo(msg);
				}
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}
	}

}
