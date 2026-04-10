package com.sist.collection;

import java.util.ArrayList;
import java.util.*;
import javax.swing.JFrame;

public class Collection_2  extends JFrame {
	public static void print(List<?> list) {	// 어떤 데이터형이든 관계 없음, 읽기만 가능
		for(Object obj : list) {
			System.out.println(obj);
		}
	}
	public static void sum(List<?> list) {
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		print(List.of("A","B","C"));
		print(List.of(1,2,3));
		
		
	}

}
