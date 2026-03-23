package com.sist.oop;
/*
 * class A {
 * 	// 명시적인 초기화
 * 	int age = 23;
 * 	String name = "홍길동";
 *  String compony;
 *  long pay;
 *  
 *	// 생성자를 이용하여 초기화
 *  A () {
 *  	age = 27;
 *  	name = "심청이";
 *  	company = "SIST";
 *  	pay = 3000;
 *  }
 *  
 *  // 초기값을 매번 다르게 저장시에 사용
 *  A(int age, String name){
 *  	this(); // company랑 pay는 기본값으로 다 동일하게 들어갈 때 기본생성자를 불러 변수 초기화에대한 중복제거를 함
 *  	this.age = age;
 *  	this.name = name;
 *  }
 * }
 * */

class Sawon {
	private int sabun;
	private String name;
	String dept;	//default
	protected String job;
	public String loc;
	private long pay;
	
	public int getSabun() {
		return sabun;
	}
	public void setSabun(int sabun) {
		this.sabun = sabun;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getPay() {
		return pay;
	}
	public void setPay(long pay) {
		this.pay = pay;
	}
	
	
	
}
public class 접근지정어_1 {
	int a = 10;
	void display(int a) {
		this.a = a;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sawon hong = new Sawon();
		hong.dept = "개발부";
		hong.job = "사원";
		hong.loc = "제주";
		hong.setSabun(1);
		hong.setName("홍길동");
		hong.setPay(3000);
		// 변수에서 값 가져올때는 getXXX 함수 사용
		System.out.println("이름 : " + hong.getName());
		System.out.println("사번 : " + hong.getSabun());
		System.out.println("연봉 : " + hong.getPay());
		System.out.println("부서 : " + hong.dept);
		System.out.println("직위 : " + hong.job);
		System.out.println("근무지 : " + hong.loc);

	}

	
	
	
}
