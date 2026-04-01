package com.sist.regex;

public class 정규식_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("hkkllo".matches("h..llo"));
		System.out.println("h#llo".matches("h.llo")); // . 은 임의의 한글자
		System.out.println("hello".matches(".....")); // . 은 임의의 한글자
		System.out.println("홍길동".matches("홍..")); // . 은 임의의 한글자
		System.out.println("맛있다".matches("맛있.")); // . 은 임의의 한글자
	}

}
