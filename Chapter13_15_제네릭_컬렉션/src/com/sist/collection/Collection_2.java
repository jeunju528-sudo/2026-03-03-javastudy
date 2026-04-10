package com.sist.collection;

import java.util.ArrayList;
import java.util.Collections;

public class Collection_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList list = new ArrayList();
		list.add(3);
		list.add(5);
		list.add(2);
		list.add(1);
		list.add(6);
		list.add(8);
		list.add(9);
		list.add(7);
		list.add(4);
		
		System.out.println("===데이터 출력===");
		for(Object o1 : list) {
			System.out.println(o1);
		}
		
		System.out.println("===일부만 출력===");
		ArrayList list2 = new ArrayList();
		list2.add(10);
		list2.add(11);
		list2.add(12);
		for(Object o2 : list2) {
			System.out.println(o2);
		}
		
		System.out.println("===정렬 출력===");
		Collections.sort(list);
		for(Object o1 : list) {
			System.out.println(o1);
		}
		

	}

}
