package com.sist.exception;

import java.lang.reflect.Method;
import java.util.Scanner;

class MyException{
	public void aaa() {
		System.out.println("MyException: aaa() Call");
	}
	public void bbb() {
		System.out.println("MyException: bbb() Call");
	}
	public void ccc() {
		System.out.println("MyException: ccc() Call");
	}
}
public class 예외처리_1 {
	public static void main(String[] args) {
		try {
			Scanner sc = new Scanner(System.in);
			System.out.print("입력(aaa,bbb,ccc) : ");
			String m = sc.next();
			Class className = Class.forName("com.sist.exception.MyException");
			//new MyException() 과 동일한 것
			Object obj = className.getDeclaredConstructor().newInstance();
						
			Method[] method = className.getDeclaredMethods();
			for(Method mm : method) {
				if(mm.getName().endsWith(m)) {
					mm.invoke(obj, null);
				}
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
