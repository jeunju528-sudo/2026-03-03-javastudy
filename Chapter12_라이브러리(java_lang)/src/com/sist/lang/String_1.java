package com.sist.lang;

class A{
	int aa = 100;
	
}
class B{
	public void setAA(A a) {
		a.aa = 1000;
	}
	public void setStr(String s) {
		s = "홍길동";
	}
}
public class String_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a = new A();
		System.out.println(a.aa);
		B b = new B();
		b.setAA(a);
		System.out.println(a.aa);
		
		String name = "심청이";
		b.setStr(name);
		System.out.println(name);
	}

}
