package com.sist.lang;

/*
 * FileReader : 문자 스트림 => 한글이 포함된 파일 읽기
 * FileInputStream : 바이트 스트림 => 파일 업/다운로드
 * */
import java.io.*;

public class StringBuffer_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			String foodData = "";
			FileReader fr = new FileReader("C:\\javadev\\food.txt");
//			StringBuffer sb = new StringBuffer();
			StringBuilder sb = new StringBuilder();
			int i = 0;
			long start = System.currentTimeMillis();
			while((i=fr.read())!= -1) {
//				foodData += (char)i;
				sb.append((char)i);
			}
			fr.close();	
			long end = System.currentTimeMillis();
//			System.out.println(foodData);
			System.out.println(sb.toString());
			System.out.println("걸린 시간 : " + (end-start)+"ms");
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}
