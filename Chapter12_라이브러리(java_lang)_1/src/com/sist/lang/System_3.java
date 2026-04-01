package com.sist.lang;

class Sawon{
	public Sawon() {
		System.out.println("객체 생성");
	}
	public void print() {
		System.out.println("사원 정보 출력!!(객체 활용)");
	}
	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		System.out.println("객체 소멸");
	}
	
}
public class System_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sawon sa = new Sawon();
		sa.print();
		sa = null;
		System.gc();
	}

}
