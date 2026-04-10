package com.sist.collection;
import java.io.FileReader;
import java.util.*;

public class Collection_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("사과", 100);
		map.put("바나나",200);
		map.put("포도", 300);
		
		System.out.println(map.get("사과"));
		System.out.println(map.get("바나나"));
		System.out.println(map.get("포도"));
		
		System.out.println(map);
		
		if(map.containsKey("사과")) {
			System.out.println("사과가 있어요");
		}else {
			System.out.println("사과가 없어요");
		}
		
		if(map.containsValue(100)) {
			System.out.println("100개 있어요");
		}
		else {
			System.out.println("100개 없어요");			
		}
		
		map.put("사과", 1000); // 기존에 키가 있으면 값 update
		map.remove("포도");
		
		System.out.println("=== key를 가져다가 값을 읽기 ===");
		for(String key : map.keySet()) { // keySet 을 가지고와야지 반복문으로 value 가져올 수 있음
			System.out.println(key+":"+map.get(key));
		}
		
		System.out.println("=== 값만 읽어오기 ===");
		for(int i : map.values()) {
			System.out.println(i);
		}
		
		System.out.println("=== 값하고 key 같이 읽기===");
		System.out.println(map.entrySet());
		for(Map.Entry<String, Integer> e : map.entrySet()) {
			System.out.println(e.getKey()+":"+e.getValue());
		}
		
	
	}

}
