package com.sist.lang;
/*
 * 기본형 : 클래스형
 * byte => Byte
 * short => Short
 * int => Integer
 * long => Long
 * char => Character
 * float => Float
 * double => Double
 * boolean => Boolean
 * char[] => String
 * 
 * */
public class Wrapper_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Integer i = 10;
//		Integer j = 20;
//		System.out.println(i+j);
//		
//		int k = 10;
//		int m = 20;
//		System.out.println(k+m);
		
		int a = 10;
		System.out.println(Integer.toBinaryString(a));
		System.out.println(Integer.toHexString(a));
		System.out.println(Integer.toOctalString(a));
	}

}
