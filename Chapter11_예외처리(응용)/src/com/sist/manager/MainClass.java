package com.sist.manager;

import java.util.Scanner;

import com.sist.vo.FoodVO;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int data = 29;
//		int total = (int)(Math.ceil(data/10.0));
//		System.out.println(total);
		FoodManager fm = new FoodManager();
		Scanner sc = new Scanner(System.in);
		int total = fm.foodTotal();
		System.out.println("페이지를 입력하세요(1~"+total+") : ");
		int input = sc.nextInt();
		FoodVO[] food = fm.foodList(input);
		for(FoodVO vo : food) {
			System.out.println(vo.getMno()+"."+vo.getName());
		}
		System.out.println("상세볼 맛집의 번호를 입력하세요 : ");
		int no = sc.nextInt();
		FoodVO vo = fm.foodDetail(no);
		System.out.println("번호:"+vo.getMno());
		System.out.println("맛집명:"+vo.getName());
		System.out.println("주소:"+vo.getAddress());
		System.out.println("전화:"+vo.getPhone());
		System.out.println("음식종류:"+vo.getType());
		System.out.println("주차:"+vo.getParking());
		System.out.println("영업시간:"+vo.getTime());
		System.out.println("가격대:"+vo.getPrice());
		System.out.println("테마:"+vo.getTheme());
		System.out.println("소개:"+vo.getContent());
		
		FoodVO[] f = fm.foodFilter("한식");
		System.out.println(f.length);
	}

}

