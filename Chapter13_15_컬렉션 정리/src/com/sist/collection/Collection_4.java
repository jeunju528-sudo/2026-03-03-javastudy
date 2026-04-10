package com.sist.collection;

import java.util.HashSet;
import java.util.Set;

public class Collection_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> set = new HashSet<>();
		set.add("수박");
		set.add("참외");
		set.add("딸기");
		set.add("수박");
		
		System.out.println("===과일종류===");
		for(String s : set) {
			System.out.println(s);
		}
		System.out.println("===remove===");
		set.remove("참외");
		for(String s : set) {
			System.out.println(s);
		}
	}

}
