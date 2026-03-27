package com.sist.exception;

public class 예외처리_4 {

	public static int test() {
		try {
			int a=10/0;
			return 1;
		} catch (Exception e) {
			// TODO: handle exception
			return 2;
		} finally {
			return 3;	//finally에서는 return값 등을 설정하지 않음, 무조건 수행되는 부분이기 때문이다.
			//'0' = 48
			//'A' = 65
			//'a' = 97
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}

}
