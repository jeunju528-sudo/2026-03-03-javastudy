package com.sist.lang;

import java.util.Calendar;
import java.util.Date;

public class 날짜_시간_형식클래스 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date date = new Date();
		System.out.println(date);
		
		Calendar cal = Calendar.getInstance();
		int week = cal.get(Calendar.DAY_OF_WEEK);	// 1부터 시작
		String[] strWeek = {"일","월","화","수","목","금","토"};
		System.out.println("오늘은 "+strWeek[week]+"요일입니다.");
		
		int last = cal.getActualMaximum(Calendar.DATE);
		System.out.println("이번달 마지막날 : " + last);
		
		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH);	// 0부터 시작
		int day = cal.get(Calendar.DATE);
		
		System.out.println(year+"년도 "+(month+1)+"월 "+day+"일");
	}

}
