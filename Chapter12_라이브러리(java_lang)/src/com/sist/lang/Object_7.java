package com.sist.lang;
import java.lang.*;
import java.lang.reflect.Method;
public class Object_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "hello";
		Class clsName = str.getClass();
		System.out.println(clsName.getName());
		
		Object obj = new String("hello");
		System.out.println(obj.getClass());
		
		clsName = String.class;
		System.out.println(clsName.getName());
//		Method[] methods = new Method;
		
		
	}

}
