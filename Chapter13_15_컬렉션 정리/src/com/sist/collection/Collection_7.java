package com.sist.collection;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

/*
 * TreeSet 자동 정렬
 * */



public class Collection_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Integer> set = new HashSet<Integer>();
		Random r = new Random();
		for(int i = 0; i<10; i++) {
			int k = r.nextInt(100)+1;
			set.add(k);
		}
		
		System.out.println(set.size());
		for(Integer i : set) {
			System.out.print(i+" ");
		}
		System.out.println();
		
		TreeSet<Integer> set2 = new TreeSet<Integer>();
		set2.addAll(set);
		
		for(Integer i : set2) {
			System.out.print(i + " ");
		}
		
		System.out.println("\n ===== 50 이상 ======");
//		for(Integer i : set2) {
//			if(i >= 50) {
//				System.out.print(i+ " ");
//			}
//		}
		System.out.println(set2.tailSet(50)); // 50 이상
		System.out.println(set2.headSet(50)); // 50 이하
		
		//바로 위의 값
		System.out.println(set2.higher(30));
		
		// 같거나 큰 값
		System.out.println(set2.ceiling(50));
		
		//바로 아래의 값
		System.out.println(set2.lower(30));
		
		//같거나 작은 값
		System.out.println(set2.floor(50));
		
		System.out.println(set2.first()); //첫번째 값
		System.out.println(set2.last()); //마지막 값
		
	}

}
