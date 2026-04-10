package com.sist.collection;

import java.util.HashSet;
import java.util.Set;

class Student{
	private String name;
	private int age;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Student(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return (name+age).hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		if(obj instanceof Student) {
			Student s = (Student)obj;
			return name.equals(s.name) &&  age == s.age;
		}
		return super.equals(obj);
	}
}
public class Collection_6 {	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1 = new Student("홍길동", 20);
		Student s2 = new Student("홍길동", 20);
		
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		
		Set<Student> set = new HashSet<Student>();
		set.add(s1);
		set.add(s2);
		
		for(Student ss : set) {
			System.out.println(ss.getName()+","+ss.getAge());
		}
		
		
	}

}
