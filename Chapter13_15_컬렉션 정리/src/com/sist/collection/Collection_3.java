package com.sist.collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;
/*
 * 
 * retainAll : 교집합
 * addAll : 전체집합
 * removeAll : 차집합
 * */
public class Collection_3 {
	public List<String> genieData(){
		List<String> list = new ArrayList<String>();
		try {
			Document doc = Jsoup.connect("https://www.genie.co.kr/chart/top200").get();
			Elements title = doc.select("table.list-wrap a.title");
			for(int i=0; i<title.size(); i++) {
				list.add(title.get(i).text());
				
			}
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		return list;
	}
	public List<String> melonData(){
		List<String> list = new ArrayList<String>();
		try {
			Document doc = Jsoup.connect("https://www.melon.com/chart/top100/index.htm").get();
			Elements title = doc.select("div.wrap_song_info div.rank01 a");
			for(int i=0; i<title.size(); i++) {
				list.add(title.get(i).text());
				
			}
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		return list;
	}
	public static void main(String[] args) {
		Collection_3 co = new Collection_3();
		System.out.println("======= genie music =======");
		List<String> geine = co.genieData();
		for(int i=0; i<geine.size(); i++) {
			System.out.println((i+1)+"."+geine.get(i));
		}
		System.out.println("======= melon music =======");
		List<String> melon = co.melonData();
		for(int i=0; i<melon.size(); i++) {
			System.out.println((i+1)+"."+melon.get(i));
		}
//		System.out.println("======= 지니뮤직에만 있는 곡명 출력 =======");
//		geine.removeAll(melon);
//		for(int i=0; i<geine.size();i++) {
//			System.out.println((i+1)+"."+geine.get(i));
//		}

//		System.out.println("======= 멜론뮤직에만 있는 곡명 출력 =======");
//		melon.removeAll(geine);
//		for(int i=0; i<geine.size(); i++) {
//			System.out.println((i+1)+"."+geine.get(i));
//		}
		
//		geine.retainAll(melon); // 지니에 저장된 데이터 변경
//		System.out.println("공통 곡 갯수 : " + geine.size());
		
		
		List<String> list = new ArrayList<String>();
		list.addAll(geine);
		list.addAll(melon);
		for(int i=0; i<list.size(); i++) {
			System.out.println((i+1)+"."+list.get(i));
		}
		
		
		System.out.println("=== 멜론 + 지니 - 중복제거 ===");
		Set<String> set = new HashSet<String>();
		
		set.addAll(geine);
		set.addAll(melon);
		int k = 1;
		for(String str : set) {
			System.out.println(k++ + "."+str);
		}
		
	}

}
