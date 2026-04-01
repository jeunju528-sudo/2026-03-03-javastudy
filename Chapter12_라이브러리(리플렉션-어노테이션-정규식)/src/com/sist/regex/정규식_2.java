package com.sist.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

public class 정규식_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hllo".matches("H*llo"));
		System.out.println("Ho".matches("H.*o")); // * 어떤 문자가 들어올 수도 있다는 뜻 
		System.out.println("hheeeeeeeee".matches("h*e*"));
		
		System.out.println("he".matches("h*.")); //
		System.out.println("he".matches("h+e+")); // + : 한글자 이상이 있다
//		try {
//			Document doc = Jsoup.connect("https://www.youtube.com/results?search_query=%ED%82%A4%ED%82%A4").get(); // .get 전체를 가져오는 것
//			Pattern p = Pattern.compile("/watch\\?v=[^가-힣]+");
//			Matcher m = p.matcher(doc.toString());
//			// /watch?v=zhHB4dZTChw\u0026list=RDEMx7c7aUeA3pXjMUyyYhSJQg\u0026start_radio=1"
//			while(m.find()) {
//				String s = m.group();
//				s.substring(s.indexOf("=")+1,s.indexOf("\""));
//				System.out.println(s);
//			}
//			
//		} catch (Exception e) {
//			// TODO: handle exception
//		}
	}

}
