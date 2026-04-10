package com.sist.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Collection_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] names = {"홍길동","심청이","춘향이","박문수","감감찬","을지문덕","이순신","김두한","홍길동","박문수"};
		
		System.out.println("====전체 사원 목록====");
		List<String> list = Arrays.asList(names);
		for(String name : names) {
			System.out.println(name);
		}
		System.out.println("====중복제거====");
		Set<String> set = new HashSet<String>();
		set.addAll(list);
		for(String s : set) {
			System.out.println(s);
		}
		
		System.out.println("====중복제거 후 리스트로 이동====");
		List<String> list2 = new ArrayList<String>();
		list2.addAll(set);
		for(String l : list2) {
			System.out.println(l);
		}
		
	}

}
