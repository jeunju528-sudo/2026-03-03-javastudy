package com.sist.collection;

import java.util.*;

class AA{
	public void disp() {
		System.out.println("AA:disp() Call");
	}
}
public class Collection_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, AA> map = new HashMap<>();
		map.put("aa", new AA());
		
		// singleton
//		AA a = map.get("aa");
//		AA b = map.get("aa");
//		AA c = map.get("aa");
		
		
		AA a = new AA();
		AA b = new AA();
		AA c = new AA();
		
		
		
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		System.out.println("c = " + c);
	}

}
