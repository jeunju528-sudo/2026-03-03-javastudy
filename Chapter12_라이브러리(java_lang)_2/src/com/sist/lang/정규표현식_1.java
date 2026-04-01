package com.sist.lang;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class 정규표현식_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String msg = "abc123";
		/*
		 * .
		 * + : 1개 이상
		 * {n} : n개
		 * {n,m} : n부터 m까지 => {1,3} : 1부터 3까지
		 * a | b : a이거나 b인 경우
		 * () :  그룹
		 * * : 0개 이상
		 * d 숫자
		 * 숫자 : [0-9] \d
		 * [] : 한개의 문자 -> [abc] : a,b,c 중에 한개, [^abc] => abc외의 다른 한문자, [a-zA-Z] : 알파벳 중에 한개
		 * \s : 공백
		 * \w : 한개 알파벳
		 * \. : . => 임의의 한글자
		 * ? : 한개거나 없음
		 * 
		 * */
		
		// 숫자가 포함되어있는지
		boolean result = msg.matches(".*\\d+.*");
		System.out.println(result);
		
		String res = "맛있는, 맛있고, 맛있게, 맛있소, 맛있다, 맛없다";
		Pattern p = Pattern.compile("맛있.");
		Matcher m = p.matcher(res);
		while(m.find()) {
			System.out.println(m.group());
		}
		
		String won = "가격 : 30000원";
		String change = won.replaceAll("[^0-9]", "");
		System.out.println(change
				);
	}

}
