package com.sist.inter;
import java.util.*;
interface 도형{
	//public static final 생략됨
	String COLOR = "black";
	public void draw() ;
}
class 선 implements 도형{

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println(COLOR + "를 이용해서 선을 그린다.");
		
	}
	
}

class 사각형 implements 도형{

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println(COLOR + "를 이용해서 사각형을 그린다.");
		
	}
	
}
class 삼각형 implements 도형{
	
	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println(COLOR + "를 이용해서 삼각형을 그린다.");
		
	}
	
}
public class 인터페이스_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		도형 a = new 선();
		a.draw();
		
		a = new 사각형();
		a.draw();
		
		a = new 삼각형();
		a.draw();

	}

}
