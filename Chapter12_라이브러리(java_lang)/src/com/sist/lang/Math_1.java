package com.sist.lang;

import java.math.*;
public class Math_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] names = {"aaa","bbb","ccc","ddd",
						"eee","fff","ggg","hhh",
						"iii","jjj","kkk","lll",
						"mmm","nnn","ooo"};
		System.out.println((int)Math.ceil(names.length/5.0));
		
		int rand = (int)(Math.random()*100);
		System.out.println(rand);
		
		double d = Math.round(10.5);
		System.out.println(d);
	}

}
