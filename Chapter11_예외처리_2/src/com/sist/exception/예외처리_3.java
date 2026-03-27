package com.sist.exception;

public class 예외처리_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int a = 10;
			int b= 0;
			if(b == 0) {
				throw new ArithmeticException("0으로 나눌 수 없습니다");
			}
			else {
				System.out.println(a);
			}
		}
		catch (ArithmeticException e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
			System.out.println("타입 : "+e.getClass());
			e.printStackTrace();
		}
	}

}
