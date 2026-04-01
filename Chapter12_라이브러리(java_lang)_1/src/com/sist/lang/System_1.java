package com.sist.lang;

public class System_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 5;
		for(int i=1; i<=10; i++) {
			if(i==a) {
				System.out.println("프로그램 종료");
//				System.exit(0);	// 애플리케이션 종료
				break; // for문만 종료
			}
			System.out.println("i="+i);
		}
		System.out.println("시작");
		System.out.println("GO");
		
	}

}
