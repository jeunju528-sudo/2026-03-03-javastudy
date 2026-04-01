package com.sist.lang;
import java.util.*;

public class 날짜_시간_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("년도 입력 : ");
		int year = sc.nextInt();
		System.out.print("월 입력 : ");
		int month = sc.nextInt();
		System.out.print("일 입력 : ");
		int day = sc.nextInt();
		
		Calendar cal = Calendar.getInstance();
		cal.set(Calendar.YEAR, year);
		cal.set(Calendar.MONTH, month-1); // month가 0부터 시작하기 때문에 
		cal.set(Calendar.DATE, day);
		
		String[] strWeek = {"","일","월","화","수","목","금","토"};
		int week = cal.get(Calendar.DAY_OF_WEEK);
		System.out.println(strWeek[week]+"요일");
	}

}
