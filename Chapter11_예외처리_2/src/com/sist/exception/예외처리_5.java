package com.sist.exception;
/*
1) 
InterruptedException
		|         \
	Exception	Error
		|
	ClassNotFound.. 등
*/
public class 예외처리_5 {
	public static void div(int a, int b) throws ClassNotFoundException, InterruptedException{ // 나를 부른 쪽으로 폭탄을 던질거야
		int c = a/b;
		System.out.println(c);
	}
	public static void main(String[] args) throws Exception {	// 나도 던질거야.. 나한테 폭탄 던지는 것들 중에 가장 큰 값으로 받을거야
		// TODO Auto-generated method stub
		div(10,3);
		// 직접처리 => try ~ catch
		// 다음에 호출시 처리 => throws
	}

}
