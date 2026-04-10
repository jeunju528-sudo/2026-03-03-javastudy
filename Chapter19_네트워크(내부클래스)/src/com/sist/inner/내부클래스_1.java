package com.sist.inner;
/*
 * 1. 멤버클래스 : 공동으로 사용되는 변수, 메소드가 있는 경우
 *  => 네크워크(서버), Thread(자원, 윈도우에 있는 기능 사용)
 * class A{
 *   A, B, C
 *   class B{
 *     A, B, C
 *   }
 * }
 * 
 * 2. 익명 클래스 : extends를 사용하지않고 오버라이딩을 하는 경우
 * 3. 지역 클래스 : 메소드 안에 클래스 정의
 * 
 * 멤버클래스 / 익명 클래스 : 윈도우 개발, AI 등에 활용
 * => AI : 데이터 수집 / 데이터분석 / 예측 / 학습 이 순차적으로 이루어지며 여러 클래스가 동시에 수행되어야할 때 사용
 * 
 * */

class Outer{
	private String name = "홍길동"; // 이 내용을 공유해야할 때 주로 이너클래스 사용
	
	class Inner{
		int a = 10;
		public void print() {
			System.out.println("Inner:Call.. : name="+name);
		}

	}
	
	public void display() {
		Inner in = new Inner();
		in.print();
	}

//  타 클래스에 있는 private 변수 활용 시 사용
//	public String getName() {
//		return name;
//	}
//
//	public void setName(String name) {
//		this.name = name;
//	}
	
}

//타 클래스에 있는 private 변수 활용 시 사용
// class Inner {
//	int a = 10;
//	public void print() {
//		Outer out = new Outer();
//		System.out.println("Inner:Call.. : name="+out.getName());
//	}
// }

class Outer2{
	static class Inner{ //inner 클래스 만드로는 객체생성 불가
		public void print() {
			System.out.println("Inner:Call.. : static 클래스");
		}
	}
}
// 익명의 클래스
class Outer3{
	Inner in = new Inner() {
		public void print() {
			System.out.println("Outer3에서 Inner클래스의 print()를 오버라이딩");
		}
	};
}
class Inner{
	public void print() {
		System.out.println("익명 클래스에서 호출");
	}
}
// 지역 클래스
class Outer4{
	public void print() {
		class Inner{
			public void print() {
				System.out.println("지역 클래스 : Inner.print()");
			}
		}
		
		Inner i = new Inner();
		i.print();
	}
}
public class 내부클래스_1 {

	public static void main(String[] args) {
		
		
		System.out.println("===== 멤버 클래스 =====");
		Outer out = new Outer();
		out.display();
		
		// TODO Auto-generated method stub
//		Inner in = new Inner();
//		in.print();
		
//		Outer.Inner c = out.new Inner();
//		c.print();
		
		System.out.println("===== static 클래스 =====");
		Outer2.Inner c1 = new Outer2.Inner(); 
		c1.print();
		
		
		
	}

}
