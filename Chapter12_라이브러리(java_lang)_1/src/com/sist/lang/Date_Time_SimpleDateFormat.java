package com.sist.lang;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Date_Time_SimpleDateFormat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date date = new Date();
		System.out.println(date);
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		System.out.println(sdf.format(date));
	}

}
