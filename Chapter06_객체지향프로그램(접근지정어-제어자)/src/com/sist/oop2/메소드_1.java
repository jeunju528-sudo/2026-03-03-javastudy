package com.sist.oop2;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

class A {
	public void sum(int... value) {
		// int... -> 들어오는 변수가 가변이다
	}
	public String change(int num) {
		DecimalFormat d = new DecimalFormat("###,###,###");
		return d.format(num);
	}
	public String dataChange(Date date) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		return sdf.format(date);
	}
}
public class 메소드_1 {

	public static void main(String[] args) {
		A a = new A();
		String str = a.change(10000000);
		System.out.println(str);
		
		System.out.println(new Date());
		Date res = new Date(); // 오늘 날짜 날것 그대로 가져오기
        String formattedDate = a.dataChange(res);
        System.out.println(formattedDate);
	}

}
