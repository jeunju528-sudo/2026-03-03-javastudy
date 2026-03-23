package com.sist.main;
class Animal{
	String name = "동물";
	public void run() {
		System.out.println("걷는다");
	}
	public void eat() {
		System.out.println("먹는다");
	}
}
class Dog extends Animal{
	int age = 3;
	public void eat(){
		System.out.println("멍멍");
	};
}
class Cat extends Animal{
	int age = 3;
	public void eat(){ 
		System.out.println("냥냥");
	};
}
class Pig extends Animal{
	public void eat(){
		System.out.println("꿀꿀");
	};
}
public class 재사용_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog doc = new Dog();
		Cat cat = new Cat();
		Pig pig = new Pig();
		
		doc.eat();
		cat.eat();
		pig.eat();
		System.out.println("===========================");
		Animal a = new Dog();
		a.eat();
		a = new Cat();
		a.eat();
		a = new Pig();
		a.eat();

	}

}
