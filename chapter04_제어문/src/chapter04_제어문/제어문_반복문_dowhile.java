package chapter04_제어문;

import javax.swing.JOptionPane;

/*
 * 초기값 --------------- 1
 * do
 * {
 * 		실행문장 --------- 2
 * 		증가식 ---------- 3
 * }
 * while(조건식); ------- 4
 * */
public class 제어문_반복문_dowhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int i = 1;
//		while(i <= 10) {
//			if(i==2)
//				continue; // while문에서 특별한 경우가 아니면 continue를 사용하지 말자! 잘못쓰면 무한루프에 걸릴 수 있다
//			System.out.println(i);
//			i++;
//		}
		int i = 1;
		// 1부터 10까지 출력
		do {
			System.out.print(i+" ");
			i++;
		}
		while(i<=10);
		System.out.println("");
		
		char c = 'A';
		do {
			System.out.print(c + " ");
		    c++;
		}
		while(c <= 'Z');
		System.out.println("");
		
		c = '0';
		do {
			System.out.print(c+ " ");
			c++;
		}while(c<='9');
		System.out.println("");
		
		String s = JOptionPane.showInputDialog("문자열 입력 : ");
		System.out.println("입력한 문자열 : " + s);
		System.out.println("글자수 : "+s.length());
		
		// A, a 가 몇개인지 확인
		int cnt = 0;
		i = 0;
		do {
			char d = s.charAt(i);
			if(d == 'A' || d == 'a') {
				cnt++;
			}
			i++;
		}
		while(i < s.length());
		
		System.out.println("총 개수 : " + cnt);
		
	}

}
