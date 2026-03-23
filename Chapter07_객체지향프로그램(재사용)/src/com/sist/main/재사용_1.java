package com.sist.main;
class Super{
	int a;
	int b;
	int c;
	public void display() {
		System.out.println("Super:display() Call");
	}
}
class Sub extends Super {
	int d;
	public void display() {
		System.out.println("Sub:display() Call");
	}
}
public class 재사용_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sub sub = new Sub();
		System.out.println("sub.a = " + sub.a);
		System.out.println("sub.b = " + sub.b);
		System.out.println("sub.c = " + sub.c);
		System.out.println("sub.d = " + sub.d);
		sub.display();
		Super su = new Super();
		su.display();
		Super s = new Sub(); // 변수는 클래스형을 봐야하고 / 메소드는 생성자를 봐야함
		s.display();
		
//		Sub ss = new Super(); -> 오류!!!
		Sub ss = (Sub)s;

	}

}
