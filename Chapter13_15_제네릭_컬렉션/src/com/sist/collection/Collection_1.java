package com.sist.collection;

import java.util.ArrayList;

/*
 * 컬렉션
 *  데이터(값)을 담아두는 상자(메모리)들 모음
 *  
 * List : 순서가 있다 추가시 마다 자동으로 인덱스 번호 부여
 *        데이터 중복을 허용
 *        대표적 : ArrayList
 * Set : 순서는 없고 데이터 중복이 없다
 *       대표적 : HashSet
 *       => Distinct 영화등록 => 장르
 * Map : 키,값 동시에 저장
 *       대표적 : HashMap
 * 
 * ArrayList : 데이터비이스(웹 핵심) => 비동기
 * Vector : 네트워크 => 접속자 관리 => 동기
 * LinkedList : 파일 관리
 * */
public class Collection_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list = new ArrayList<>();
		list.add("홍길동"); // index 0
		list.add("심청이"); // index 1
		list.add("박문수"); // index 2
		list.add("춘향이"); // index 3
		list.add("이순신"); // index 4
		
		for(int i = 0; i<list.size(); i++) {
			System.out.println(i+"."+list.get(i));
		}
		
		System.out.println("====지정된 위치에 저장====");
		list.add(2,"김두한");
		for(int i = 0; i<list.size(); i++) {
			System.out.println(i+"."+list.get(i));
		}
		
		//삭제
		System.out.println("====삭제====");
		list.remove(3);
		for(int i = 0; i<list.size(); i++) {
			System.out.println(i+"."+list.get(i));
		}
		
		System.out.println("====업데이트====");
		list.set(1, "강감찬");
		for(int i = 0; i<list.size(); i++) {
			System.out.println(i+"."+list.get(i));
		}
		
		System.out.println("현재 인원 : " + list.size());
		
		list.clear();
		System.out.println("현재 인원 : " + list.size());
		
		if(list.isEmpty()) {
			System.out.println("저장된 데이터가 없습니다.");
		}
		else {
			System.out.println("저장된 데이터가 있습니다.");
			
		}
	}

}
