package com.sist.lang;

import java.util.StringTokenizer;

public class StringBuffer_StringBuilder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String info = "32000원 | 2026년 4월 2일 발행 | 404쪽";
		long start = System.currentTimeMillis();
		String[] data = info.split("\\| ");
		for(String str: data) {
			System.out.println(str);
		}
		long end = System.currentTimeMillis();
		System.out.println("데이터 갯수 : " + data.length);
		System.out.println("split 걸린 시간 : " + (end-start));
		
		System.out.println("===== StringTokenizer =====");
		start = System.currentTimeMillis();
		StringTokenizer st = new StringTokenizer(info,"|");
		System.out.println("데이터 갯수 : " + st.countTokens());
		while(st.hasMoreTokens()) { // 데이터가 있는지 확인하는 것 
			System.out.println(st.nextToken());	// 데이터를 하나씩 가져오는 것
		}
		end = System.currentTimeMillis();
		System.out.println("StringTokenizer 걸린 시간 : " + (end-start));
	}

}
