package com.sist.exception;
// 사용자 정의 예외처리
class MyException extends Exception{
	private String msg;
	public MyException(String msg) {
		super(msg);
	}
}
public class 예외처리_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char c = 'A';
		try {
			if(c >= 'A' && c <= 'Z') {
				throw new MyException("소문자만 입력하세요");
			}
		}catch (MyException e) {
			// TODO: handle exception
			System.out.println(e.getMessage() );
		}

	}

}
