package com.sist.lang;

import java.util.Objects;

class Human{
	String id, name;
	public Human(String id , String name) {
		this.id = id;
		this.name = name;
	}
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return Objects.hash(id, name);
	}
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		Human h = (Human)obj;
		return name.equals(h.name) && id.equals(h.id);
	}
	
}
public class Object_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Human h1 = new Human("hong", "홍길동");
		Human h2 = new Human("hong", "홍길동");
		if(h1.equals(h2)) {
			System.out.println("equals : 같은 사람");
		}else {
			System.out.println("equals : 다른 사람");
		}
		
		if(h1.hashCode() == h2.hashCode()) {
			System.out.println("hashCode : 같은 사람");
		}
		else {
			System.out.println("hashCode : 다른 사람");
		}
		
	}

}
