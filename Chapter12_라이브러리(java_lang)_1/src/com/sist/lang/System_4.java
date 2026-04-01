package com.sist.lang;

public class System_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long start = System.currentTimeMillis();
		for(int i=1; i<=100000; i++) {
			System.out.println(i);
		}
		long end = System.currentTimeMillis();
		System.out.println("걸린 시간 : "+(end-start));
	}

}
