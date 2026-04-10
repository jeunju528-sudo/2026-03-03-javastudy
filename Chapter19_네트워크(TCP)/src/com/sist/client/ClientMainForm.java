package com.sist.client;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.Socket;
import java.util.StringTokenizer;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableModel;

import com.sist.commons.Function;

/*
 * 데이터를 클라이언트에서 서버로 보내주는 것이 아니라
 * 클라이언트 메모리에 저장을 해두고 서버가 해당 메모리를 읽어서 데이터를 가져오는 방식을 사용하는 것
 * 클라이언트 메모리에 데이터를 저장해두었기 때문에 데이터가 손실되는 문제가 없음 => 안정성
 * 
 * */

// 채팅 클라이언트 화면
// 클라이언트에서 사용하는 thread는 server값을 읽어서 출력하는 역할을 수행함
public class ClientMainForm extends JFrame implements ActionListener, Runnable{
	
	JTextArea ta;
	JTextField tf;
	JTable table;
	DefaultTableModel model;
	JButton b1, b2, b3;
	LoginForm login = new LoginForm(); // 로그인 폼 호출
	
	// 서버와 연결
	Socket s;
	// 서버 정보 new Socket("서버ip", port)
	/*
	 * 서버는 클라이언트의 ip/port를 가지고 있어야함
	 *  |OutputStream           |BufferedReader
	 * 클라이언트는 서버의 ip/port를 가지고 있어야함
	 *  |BufferedReader         |OutputStream
	 * */
	OutputStream out; // 서버로 요청 (로그인 할게요~)
	BufferedReader in; // 서버에서 응답한 값을 수신 (로그인 됐어요~)
	
	public ClientMainForm() {
		ta = new JTextArea();
		JScrollPane js1 = new JScrollPane(ta);
		ta.setEnabled(false);
		
		tf = new JTextField();
		b1 = new JButton("쪽지보내기");
		b2 = new JButton("정보보기");
		b3 = new JButton("나가기");
		
		String[] col = {"ID", "이름", "성별"};
		String[][] row = new String[0][3];
		// 한번만 사용 (재사용 불가)
		model = new DefaultTableModel(row, col) {

			@Override
			public boolean isCellEditable(int row, int column) {
				// TODO Auto-generated method stub
				return false;	// 편집 불가능 하도록 변경
			} // 익명의 클래스 : 윈도우/빅데이터 등 에서 클래스 내 오버라이딩을 하기 위해 사용
			
		};
		
		table = new JTable(model);
		JScrollPane js2 = new JScrollPane(table);
		
		setLayout(null);
		js1.setBounds(10, 15, 500, 450);
		tf.setBounds(10, 470, 500, 30);
		
		js2.setBounds(515, 15, 250, 300);
		
		JPanel p = new JPanel();	// 하나로 모으는 것
		p.setLayout(new GridLayout(3,1,5,5));
		p.add(b1); p.add(b2); p.add(b3);
		p.setBounds(515, 320, 250, 130);
		
		// 화면에 추가
		add(js1);
		add(tf);
		add(js2);
		add(p);
		
		setSize(790, 550);
		//setVisible(true);
		
		// 이벤트 발생 => 서버로 값을 전송하는 위치
		// 로그인 폼의 버튼 조절
		login.b1.addActionListener(this); //로그인
		login.b2.addActionListener(this); //취소
		
		tf.addActionListener(this); // 채팅
		b3.addActionListener(this); // 나가기
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			UIManager.setLookAndFeel("com.jtattoo.plaf.mcwin.McWinLookAndFeel");
		}catch(Exception ex) {}
		new ClientMainForm();
		
	}
	
	public void connect(String id, String name, String sex) {
		try {
			// 서버정보
			s = new Socket("localhost", 8088);
			out = s.getOutputStream(); // 서버에서 읽어가는 곳
			in = new BufferedReader(new InputStreamReader(s.getInputStream())); // 서버가 보낸 정보를 읽는 것
			out.write((Function.LOGIN+"|"+id+"|"+name+"|"+sex+"\n").getBytes());
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		// 서버로부터 값을 읽어옴
		new Thread(this).start();
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==login.b2) { // 나가기
			dispose(); //윈도우 메모리 해제
			System.exit(0);
		}
		else if(e.getSource()==login.b1) { // 로그인
			String id = login.tf1.getText();
			if(id.trim().length() < 1) { // 입력이 안됐을 때
				login.tf1.requestFocus();
				return;
			}
			String name = login.tf2.getText();
			if(name.trim().length() < 1) { // 입력이 안됐을 때
				login.tf2.requestFocus();
				return;
			}
			String sex = "";
			if(login.rb1.isSelected()) {
				sex = "남자";
			}else {
				sex = "여자";
			}
			connect(id, name, sex);
		}
		else if(e.getSource()==tf) {
			String msg = tf.getText();
			if(msg.trim().length() < 1) {
				tf.requestFocus();
				return;
			}
			try {
				out.write((Function.CHAT+"|"+msg+"\n").getBytes());
			}catch (Exception ex) {
				// TODO: handle exception
				ex.printStackTrace();
			}
			tf.setText("");
		}
		else if(e.getSource() == b3) {
			try {
				out.write((Function.EXIT+"|\n").getBytes());
				
			} catch (Exception e2) {
				// TODO: handle exception
				e2.printStackTrace();
			}
		}
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
			while(true) {
				// 서버(in)로부터 값을 읽어옴
				String msg = in.readLine();
				StringTokenizer st = new StringTokenizer(msg,"|");
				int protocol = Integer.parseInt(st.nextToken());
				
				switch(protocol) {
				case Function.LOGIN -> {
					String[] data = {
							st.nextToken(), st.nextToken(), st.nextToken()
					};
					model.addRow(data);
				}
				case Function.MYLOG -> {
					String name = st.nextToken();
					login.setVisible(false);
					setVisible(true);
					setTitle(name);
				}
				case Function.CHAT -> {
					ta.append(st.nextToken()+"\n");
				}
				case Function.MYEXIT -> {
					dispose();
					System.exit(0);
				}
				case Function.EXIT -> {
					// 남아있는 사람
					String mid = st.nextToken();
					for(int i=0; i<model.getRowCount();i++) {
						String id = model.getValueAt(i, 0).toString();
						if(mid.equals(id)) {
							model.removeRow(i);
							break;
						}
					}
				}
				}
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
	}

}
