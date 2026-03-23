package com.sist.main;

class Parent {
	int a = 10;

	public void display() {
		System.out.println("Parent:display()...");
	}
}

class Child extends Parent {
	int a = 100;

	public void display() {
		System.out.println("Child:display()...");
	}
}

public class 오버라이딩_1 {
	public static void main(String[] args) {
		Parent p = new Parent();
		System.out.println("p=" + p.a);
		p.display();

		Child c = new Child();
		System.out.println("c=" + c.a);
		c.display();
		
		Parent pp = new Child();
		System.out.println("pp=" + pp.a);
		pp.display();

	}
}
