package com.sist.regex;

public class 정규식_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("abcabc".matches("(abc)+"));
		System.out.println("abc".matches("(abc)*"));
		System.out.println("hahahe".matches("(ha)+.*"));
		System.out.println("aabb".matches(".(ab)*."));
		System.out.println("aabb".matches("(a)+(b)+"));
		System.out.println("aabb".matches("(a+b+)+"));
		System.out.println("123123".matches("(\\d+)+"));
		System.out.println("a1b2c3".matches("(\\w\\d+)+")); // w: 영어 d : 숫자 

	}

}
