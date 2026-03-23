package com.sist.main;
class Animal{
	public void run() {
		System.out.println("두발");
	}
	public void eat() {
		System.out.println("수저");
	}
}
class Dog extends Animal{
	@Override
	public void run() {
		System.out.println("네발");
	}
	public void eat() {
		System.out.println("사료");
	}
}
class Pig extends Animal{
	public void run() {
		System.out.println("네발");
	}
	public void eat() {
		System.out.println("고기");
	}
}

class Super{
	int a,b;
	public void display() {
		System.out.println("super a="+this.a);
		System.out.println("super b="+this.b);
	}
}
class Sub extends Super{
	int c;
	public Sub() {
		super.a = 100;
		super.b = 200;
	}
	public void print() {
		System.out.println("a="+this.a);
		System.out.println("b="+this.b);
	}
}
public class 상속_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog dog = new Dog();
		dog.run();
		dog.eat();
		Pig pig = new Pig();
		pig.run();
		pig.eat();
		
		Sub sub = new Sub();
		sub.print();
	}

}
