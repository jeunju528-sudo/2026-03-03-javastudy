package com.sist.lang;

import java.io.IOException;
import java.util.Scanner;

public class System_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			System.out.print("1. 정수 입력 : ");
			int num1 = System.in.read();	// in.read() 는 key번호를 읽음 '1' -> 49
			System.in.read(); //숫자를 입력하고 엔터를 쳐야하기 때문에 작성해줘야함
			System.out.print("2. 정수 입력 : ");
			int num2 = System.in.read();	// in.read() 는 key번호를 읽음 '1' -> 49
			System.in.read();
			
			System.out.println("연산자입력(+,-,*,/) : ");
			int op = System.in.read();	// in.read() 는 key번호를 읽음 '1' -> 49
			System.in.read();
			System.out.println(op);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//		Scanner sc = new Scanner(System.in);
	}

}
