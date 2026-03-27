package com.sist.exception;
import java.io.*;

public class 예외처리_1 {
	public static void main(String[] args) {
//		FileReader in = null;
//		try {
//			in = new FileReader("C:\\javadev\\javastudy\\Chapter11_예외처리_1\\src\\com\\sist\\exception\\예외처리_1.java");
//			int i = 0;
//			while((i=in.read())!= -1) {
//				System.out.print((char)i);
//			}
//		} catch (Exception e) {
//			// TODO: handle exception
//		} finally {
//			try {
//				in.close();
//			} catch (Exception e2) {
//				// TODO: handle exception
//			}
//		}
		
		
		// try 안에서 FileReader를 하면 자동으로 파일이 닫김 그래서 in.close() 를 안해줘도 됨 => Auto Close
		try(FileReader in = new FileReader("C:\\javadev\\javastudy\\Chapter11_예외처리_1\\src\\com\\sist\\exception\\예외처리_1.java")){
			int i = 0;
			while((i = in.read())!= -1) {
				System.out.print((char)i);
			}
		}
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
				
	}
}
