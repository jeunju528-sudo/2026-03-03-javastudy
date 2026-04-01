package com.sist.regex;
/*
 * ^ : 시작
 * $ : 끝
 * */
public class 정규식_5 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("hello".matches("^h.*o$")); // h로 시작하고 o로 끝나는데 중간에 여러글자가 있을 수도 있음
		System.out.println("hello".matches("^h.*"));
		System.out.println("hello".matches(".*o$"));
	}
}
