package com.sist.collection;
/*
 * T : Type(클래스형)
 * E : Element
 * K : key
 * V : value
 * Map<String, Integer> map = new HashMap<>();
 * */
class Box<T>{ // T는 임시 데이터, Object
	T t;
	public void setT(T t) {
		this.t = t;
	}
	public T getT() {
		return t;
	}
	
	
}
public class Collection_4 {
	public static void main(String[] args) {
		
		Box box = new Box();
		Box<String> box2 = new Box<>();
		
	}
}
