package com.sist.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class 정규식_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.out.println("211.238.142.1".matches("\\d{1,3}\\.\\d{1,3}\\.\\d{1,3}\\.\\d{1,3}"));
//		String msg = "내 전화번호는 010-1234-5678이고" +
//					"회사전화는 02-333-4566 입니다.";
//		
//		String regex="\\d{2,3}-\\d{3,4}-\\d{4}";
//		Pattern p = Pattern.compile(regex);
//		Matcher m = p.matcher(msg);
//		
//		while(m.find()) {
//			System.out.println("전화번호 : "+m.group());
//		}
		
//		String msg = "비밀번호 : 1234, 또 다른 비밀번호 : 567";
//		String regex="\\d+";
//		Pattern p = Pattern.compile(regex);
//		Matcher m = p.matcher(msg);
//		
//		while(m.find()) {
//			System.out.println("비밀번호 : "+m.group());
//		}
		
		String email = "test@gmail.com";
		String regex = "[a-z0-9]+@[a-z]+\\.[a-z]{2,}$";
		boolean result = Pattern.matches(regex, email);
		if(result) {
			System.out.println("이메일 형식이 맞습니다.");
		}else {
			System.out.println("이메일을 다시 작성하세요");
		}
		
		
	}

}



