package com.sist.collection;

import java.util.*;

public class Collection_12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text = "java and java jsp html java jsp oracle java jsp";
		Map<String,Integer> map = new HashMap<String, Integer>();
		String[] strArr = text.split(" ");
//		for(int i=0; i<strArr.length; i++) {
//			map.put(strArr[i], map.getOrDefault(strArr[i], 0)+1);
//		}
		for(String str : strArr) {
			if(map.containsKey(str)) {
				map.put(str, map.get(str)+1);
			}
			else {
				map.put(str, 1);
			}
		}
		System.out.println(map.entrySet());
	}

}
