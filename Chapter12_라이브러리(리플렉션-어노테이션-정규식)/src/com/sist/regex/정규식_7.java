package com.sist.regex;

public class 정규식_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("dog".matches("dog|cat|pig"));
		System.out.println("png".matches("png|gif|jpg"));
		System.out.println("yes".matches("y(es)?")); // (es)? : es가 있을 수도 있고 없을 수도 있고
	}

}
