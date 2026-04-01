package com.sist.reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

class Sawon{
	String name;
	
	public Sawon() {}
	
	public Sawon(String name) {
		this.name = name;
	}
	
	public void info() {
		System.out.println("sawon");
	}
}
public class 리플렉션_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Class clsName = Class.forName("com.sist.reflect.Sawon");
			Constructor con = clsName.getConstructor();
			Object obj = con.newInstance();
			
			Method m = clsName.getMethod("info"); // 메소드 정보
			m.invoke(obj);
			
		} catch (Exception e) {
			// TODO: handle exception
		}

	}

}
