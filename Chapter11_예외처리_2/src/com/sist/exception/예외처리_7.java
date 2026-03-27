package com.sist.exception;

import java.util.Scanner;

public class 예외처리_7 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();
		try {
			if(num % 2 != 0) {
				throw new Exception("짝수만 필요합니다");
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
