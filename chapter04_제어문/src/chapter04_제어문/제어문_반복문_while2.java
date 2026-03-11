package chapter04_제어문;

import java.util.Scanner;
/*
 * nextInt : 정수 입력
 * nextDouble : 실수 입력
 * 
 * */
public class 제어문_반복문_while2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("원하는 단을 입력하세요 : ");
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		int j = 1;
		while(j <= 9) {
			System.out.printf("%d * %d = %d\n", input, j, input*j++);
		}

	}

}
