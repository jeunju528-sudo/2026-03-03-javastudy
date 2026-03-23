package com.sist.main;
class Human{
	String name;
	String sex;
	public Human(){	// 상속에서 예외처리 된다는 것의 의미 : 자기 것처럼 마음대로 부르거나 사용하는 것이 안됨
		name = "심청이";
		sex = "성별";
		System.out.println("Humam() call...");
	}
}
//class Student extends Human{
//	public Student(String name, String sex){
//		this.name = name;
//		this.sex = sex;
//	}
//	public void display() {
//		System.out.println("이름 : " + name);
//		System.out.println("성별 : " + sex);
//	}
//}

// 상속내린 클래스 메모리 할당 우선 (생성자 호출)
// 상속받은 클래스가 그다음 메모리 할당 
class Sawon extends Human{
	// Human의 name하고 sex 상속
	// super(); 상속을 받으면 자동으로 super(); 함수를 불러 부모를 부르게 됨
	
	String name, sex; // 변수의 오버라이딩
	public Sawon()	{
		System.out.println("Sawon() call...");
		this.name = "박문수";
		this.sex = "남자";
	}
	public void display() {
		System.out.println("이름 : " + super.name);
		System.out.println("성별 : " + super.sex);
		System.out.println("이름 : " + this.name);
		System.out.println("성별 : " + this.sex);
	}
	
}
public class 재사용_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Student std = new Student("홍길동", "여자");
//		std.display();
		
		Sawon s = new Sawon();
		s.display();
	}

}
