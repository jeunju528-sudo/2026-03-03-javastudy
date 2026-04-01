package com.sist.anno;

import java.lang.reflect.Method;
import java.util.Scanner;

class Controller {
	@RequestMapping("1")
	public void mainPage() {
		System.out.println("Main Page 이동");
	}
	@RequestMapping("2")
	public void memberJoin() {
		System.out.println("회원가입 이동");
	}
	@RequestMapping("3")
	public void login() {
		System.out.println("로그인 이동");
	}
	@RequestMapping("4")
	public void boardList() {
		System.out.println("게시판 이동");
	}
	@RequestMapping("5")
	public void foodList() {
		System.out.println("맛집목록 이동");
	}
	@RequestMapping("6")
	public void foodDetail() {
		System.out.println("맛집상세보기 이동");
	}
	@RequestMapping("7")
	public void foodJjim() {
		System.out.println("맛집찜하기 이동");
	}
	@RequestMapping("8")
	public void foodLike() {
		System.out.println("맛집 좋아요 이동");
	}
}
public class 어노테이션_1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("==== 메뉴 =====");
		System.out.println("1. Main");
		System.out.println("2. 회원가입");
		System.out.println("3. 로그인");
		System.out.println("4. 게시판");
		System.out.println("5. 맛집 목록");
		System.out.println("6. 맛집 상세보기");
		System.out.print("메뉴 입력 : ");
		int menu = sc.nextInt();
		Controller c = new Controller();
//		if(menu == 1) {
//			c.mainPage();
//		} else if (menu == 2) {
//			c.memberJoin();
//		} else if (menu == 3) {
//			c.login();
//		} else if (menu == 4) {
//			c.boardList();
//		} else if (menu == 5) {
//			c.foodList();
//		} else if (menu == 6) {
//			c.foodDetail();
//		}
		try {
			// 클래스 정보 얻기
			Class clsName = Class.forName("com.sist.anno.Controller");
			// 객체 생성
			Object obj = clsName.getDeclaredConstructor().newInstance();
			// 메소드 정보 얻기
			Method[] methods = clsName.getDeclaredMethods();
			for(Method m : methods) {
				// 메소드 위에 있는 어노테이션 찾기
				RequestMapping rm = m.getAnnotation(RequestMapping.class);
				if(rm.value().equals(String.valueOf(menu))) {
					// 어노테이션에 등록한 메서드 호출
					m.invoke(obj, null); // 메소드 호출
				}
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}
}