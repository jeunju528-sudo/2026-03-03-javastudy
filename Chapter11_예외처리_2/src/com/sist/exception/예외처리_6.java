package com.sist.exception;

import java.io.FileReader;

public class 예외처리_6 {
	public static void main(String[] args) throws Exception
	
	{
		// TODO Auto-generated method stub
//		String image = null;
//		try {
//			System.out.println(image.length());
//			System.out.println("Image를 브라우저에 출력");
//		}catch (NullPointerException e) {
//			// TODO: handle exception
//			System.out.println("이미지 없음을 보내라");
//		}
		System.out.println("aaa");
		System.out.println("aaa");
		FileReader in = null;
		try {
			in = new FileReader("");
		} catch (Exception e) {
			// TODO: handle exception
		}
		System.out.println();
		System.out.println("aaa");
		System.out.println("aaa");
		in.close();
	}
}
