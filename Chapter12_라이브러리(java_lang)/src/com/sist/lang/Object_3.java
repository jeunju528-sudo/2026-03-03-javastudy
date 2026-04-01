package com.sist.lang;
class Student{
	private String name = "홍길동";
	private String sex = "남자";
	private int age = 20;
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		String info = "이름 : " + name + "\n 성별 : " + sex + "\n 나이 : " + age;
		return info;
	}
	
	
}
public class Object_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s = new Student();	// new 생성 하면 주소값 생김, 생성자는 생성된 메모리에 인스턴스 변수값 주입
		System.out.println(s); // .toString() 이 생략되었음
		System.out.println(s.toString());
	}

}
