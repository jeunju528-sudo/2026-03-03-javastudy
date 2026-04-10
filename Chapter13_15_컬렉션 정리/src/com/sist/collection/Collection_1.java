package com.sist.collection;

import java.util.*;

class A {
	public void display() {
		System.out.println("A");
	}
}

class B {
	public void display() {
		System.out.println("B");
	}
}

class C {
	public void display() {
		System.out.println("C");
	}
}

public class Collection_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] n = { "홍길동", "심청이", "박문수", "이순신", "강감찬" };
		List<String> names = new ArrayList<String>(Arrays.asList(n));


//		names.add("홍길동");
//		names.add("심청이");
//		names.add("박문수");
//		names.add("이순신");
//		names.add("강감찬");
		
		System.out.println(names.size());
		System.out.println(names.isEmpty());

		for (String str : names) {
			System.out.println(str);
		}
		
		names.clear();
		System.out.println(names.size());
		System.out.println(names.isEmpty());
		

//		names.add(new A());
//		names.add(new B());
//		names.add(new C());
//		names.add(new A());
//		names.add(new B());
//		names.add(new C());
//		A a = null;
//		B b = null;
//		C c = null;
//		for(Object o : names) {
//			if(o instanceof A) {
//				a = (A)o;
//				a.display();
//			}
//			else if(o instanceof B) {
//				b = (B)o;
//				b.display();
//			}
//			else if(o instanceof C) {
//				c = (C)o;
//				c.display();
//			}
//		}

	}

}
