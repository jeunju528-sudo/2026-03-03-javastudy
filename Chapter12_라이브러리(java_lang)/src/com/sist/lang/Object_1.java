package com.sist.lang;

class Sawon {
	String name;
	String dept;
	
	public Sawon(String name, String dept) {
		this.name = name;
		this.dept = dept;
	}
	public void print() {
		System.out.println();
		System.out.println();
	}
	
	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		System.out.println("객체 메모리 해제");
	}
}
public class Object_1 {
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sawon sa = new Sawon("홍길동","개발부");
		sa.print();
		sa=null; // 가비지 컬렉션 호출
		
		// 바로 해제할 수 있도록 직접 호출해줌
		System.gc();
		
	}

}
