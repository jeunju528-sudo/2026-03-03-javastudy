package com.sist.music;

import java.util.Scanner;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

public class GenieMusicSystem {
	// 공유
	public static Music[] music = new Music[50];
	
	//초기화 => Music은 static이어서 생성자를 만들 수 없음, 그래서 static으로 바로 실행시켜줌
	static {	// 상속의 예외 조건
		try {
			Document doc = Jsoup.connect("https://www.genie.co.kr/chart/top200").get();	//html 전체를 가지고 옴
			/*
			 * java에서는 html의 <a> <p> 와 같은 tag를 element라고 부름
			 * */
			Elements title = doc.select("table.list-wrap a.title");
			Elements signer = doc.select("table.list-wrap a.artist");
			Elements album = doc.select("table.list-wrap a.albumtitle");
			Elements etc = doc.select("table.list-wrap span.rank");
			
			for(int i=0; i<title.size(); i++) {
				String temp = etc.get(i).text();
				String state = "";
				String id = "";
				if(temp.equals("유지")) {
					state = "유지";
					id = "0";
				}else {
					state = temp.replaceAll("[^가-힣]", "");
					id = temp.replaceAll("[^0-9]", "");
				}
				
				Music m = new Music();
				m.setNo(i);
				m.setTitle(title.get(i).text());
				m.setSinger(signer.get(i).text());
				m.setAlbum(album.get(i).text());
				m.setState(state);
				m.setIdcrement(Integer.parseInt(id));
				music[i] = m;
				
			}
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	//기능 메서드
	public int menu() {
		System.out.println("=========[메뉴]==========");
		System.out.println("1. 뮤직 목록");
		System.out.println("2. 상세 보기");
		System.out.println("3. 곡명 찾기");
		System.out.println("4. 가수 찾기");
		System.out.println("5. 종료");
		System.out.println("=======================");
		Scanner sc = new Scanner(System.in);
		System.out.print("메뉴 선택 : ");
		int input = sc.nextInt();
		return input;
		
	}
	
	// 1. 목록 출력
	public void musicList() {
		for(Music m : music) {
			System.out.println(m.getNo()+1+"."+m.getTitle());
		}
	}

	// 2. 상세보기
	public void musicDetail(int no) {
		for(Music m : music) {
			if(m.getNo() == no) {
				System.out.println("순위 : " + m.getNo());
				System.out.println("곡명 : " + m.getTitle());
				System.out.println("가수명 : " + m.getSinger());
				System.out.println("앨범 : " + m.getAlbum());
				System.out.println("상태 : " + m.getState());
				String s = m.getState();
				if(s.equals("유지")) {
					System.out.println("등폭 : - ");
				}else if(s.equals("상승")) {
					System.out.println("등폭 : ▲ ");
				}else if(s.equals("하강")) {
					System.out.println("등폭 : ▼ ");
				}
			}
		}
	}

	// 3. 검색 => 가수/곡명
	public void findTitle(String fd) {	// fd = findData
		for(Music m : music) {
			if(m.getTitle().contains(fd)) {
				System.out.println(m.getNo()+"."+m.getTitle());
			}
		}
	}
	
	// 3. 검색 => 가수/곡명
	public void findSinger(String fd) {	// fd = findData
		for(Music m : music) {
			if(m.getSinger().contains(fd)) {
				System.out.println(m.getNo()+"."+m.getSinger()+"("+m.getTitle()+")");
			}
		}
	}

	// 4.
}
