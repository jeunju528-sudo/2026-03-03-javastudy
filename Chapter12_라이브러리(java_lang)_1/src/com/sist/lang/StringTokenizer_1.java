package com.sist.lang;

import java.util.Arrays;
import java.util.StringTokenizer;

public class StringTokenizer_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] reserve = new int[(int)(Math.random()*10)+6]; 
		for(int i=0; i<reserve.length; i++) {
			reserve[i] = (int)(Math.random()*31)+1; //1~31까지
			for(int j=0; j<i; j++) {
				if(reserve[i] == reserve[j]) { // i는 현재값, j는 이전값  현재값과 이전값들을 비교하며 중복된 수가 있는 경우 i위치를 감소시켜 다시 넣도록 함
					i--;
					break;
				}
			}
		}
		
		Arrays.sort(reserve);
		String s = "";
		for(int i : reserve) {
			s += i+",";
		}
		s=s.substring(0,s.lastIndexOf(",")); // 마지막 comma 제거
		System.out.println(s);
		
		System.out.println("예약이 가능한 날");
		StringTokenizer st = new StringTokenizer(s,",");
		System.out.println("예약이 가능한 날은 몇일? " + st.countTokens());
		while(st.hasMoreTokens()) {
			System.err.println(st.nextToken());
		}
	}

}
