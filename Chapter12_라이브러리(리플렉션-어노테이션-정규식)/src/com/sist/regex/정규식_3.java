package com.sist.regex;

public class 정규식_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("color".matches("color?r"));
		System.out.println("color".matches("color?r"));
		System.out.println("colouur".matches("color?r"));
		System.out.println("cat".matches("c?a?t?"));
		System.out.println("".matches("c?a?t?")); // ? : 앞에나오는 글자가 있냐없냐 물어보는 것, 있어도 되고 없어도 됨

	}

}
