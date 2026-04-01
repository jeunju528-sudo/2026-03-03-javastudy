package com.sist.lang;

import java.text.MessageFormat;

public class 형식클래스 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int no = 1;
		String name = "홍길동";
		String sex = "남자";
		String address = "서울";
		String phone = "010-0000-0000";
		int age = 20;
		String content = "홍길동입니다";
		
		String sql = "INSERT INTO member VALUES("+no+",'"+name+"','"+sex+"','"+address+"','"+phone+"',"+age+",'"+content+"');";
		System.out.println(sql);
		
		sql = "INSERT INTO member VALUES("
				+"{0},''{1}'',''{2}'',''{3}'',''{4}'',{5},''{6}'');";
		Object[] obj = {no, name, sex, address, phone, age, content};
		System.out.println(MessageFormat.format(sql, obj));
	}

}
