package com.sist.lang;

record Percon(String name, int age) {
	
}
public class Object_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Percon p = new Percon("홍길동", 20);
		//getter 자동 지원
		System.out.println("이름 : " + p.name());
		System.out.println("나이 : " + p.age());
	}

}
