package com.sist.main;
//같은 파일에서 클래스 여러개 만드는 경우 public class는 한 번만 사용 가능
class Saram{
	String name;
	String sex;
	static int age;
	public Saram(String name, String sex) {
		this.name = name;
		this.sex = sex;
		System.out.println("super 성별 : " + sex);
		System.out.println("super 이름 : " + name);
		age = 20; // 인스턴스, static 초기화 가능
	}
}
class Member extends Saram{
	/*
	 * 상속 시 default 생성자는 자동으로 호출(매개변수가 없는 기본 생성자)
	 * 부모 class에 매개변수가 있는 생성자가 있는 경우 자식 class에서는 부모 생성자를 반드시 호출
	 * */
	
	String name, sex; // super 와 다른 변수를 사용하려면 이렇게 변수 오버라이딩 해줘야함
	public Member(String name, String sex) {
		super(name, sex);
		this.name = name;
		this.sex = sex;
	}
	public void display() {
		System.out.println("이름 : " + name);
		System.out.println("성별 : " + sex);
		Member.age = 25;
		
		System.out.println("나이 : " + Member.age);
	}
	
}

public class 재사용_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Member m = new Member("홍길동", "남자");
		m.display();
		
	}

}
