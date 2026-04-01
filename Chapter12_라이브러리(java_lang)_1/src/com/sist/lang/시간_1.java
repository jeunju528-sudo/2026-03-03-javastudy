package com.sist.lang;

import java.time.*;
public class 시간_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDateTime now = LocalDateTime.now();
		System.out.println(now);
		LocalDateTime dateTime = LocalDateTime.of(2026, 3,30,14,30,30);
		System.out.println(dateTime);
	}

}
