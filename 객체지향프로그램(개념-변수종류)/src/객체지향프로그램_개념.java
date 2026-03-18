/*
 * 클래스의 구성요소
 *  1. 변수 :
 *    - 공통 사용 변수 : 정적변수(static) -> 컴파일시에 자동으로 저장
 *    - 
 *    - 지역변수 : 메소드 안에서 사용하는 변수
 *  2. 생성자 : 변수 초기화 / 메모리에 저장
 *  3. 메소드
 *  
 *  class ClassName {
 *  	--------------------
 *  	멤버변수 => 공통변수 / 인스턴스 변수
 *      --------------------
 *      생성자 => 무조건 필요 
 *      --------------------
 *      메소드{
 *        지역변수
 *      }
 *  }
 * 객체지향 프로그램의 특성
 * 1. 캡슐화
 *  -> 데이터 보호 : 외부에서 직접 접근을 못하게 경계선을 만드는 과정
 *  -> 내부적으로 읽기/쓰기 기능을 사용하기 위하여 getter/setter 활용
 *  -> 변수앞에 private 작성하면 됨
 * 2. 상속
 * 3. 다형성
 * 4. 추상화
 * 클래스안에 변수의 종류
 * class A {
 * 	// 자동으로 초기화 됨
 * 	static int a; -> 0
 * 	String s; -> null
 * 	boolean b -> false
 * }
 * 
 * A aa = new A(); => 인스턴스 저장
 *            --- 생성자(클래스 이름이랑 동일해야함) :  초기값을 저장하는 역할
 *        --- 메모리 생성 => 메모리 주소 전송
 *
 * */

import lombok.Data;
@Data
class Sawon {
	private int sabun;
	private String name;
	private String dept;
	private String job;
	private String loc;
	private long pay;   
	private String hiredate;
	
}
public class 객체지향프로그램_개념 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sawon sa1 = new Sawon();
		Sawon sa2 = new Sawon();
		Sawon sa3 = new Sawon();
		
		System.out.println("sa1 : " + sa1);
		System.out.println("sa2 : " + sa2);
		System.out.println("sa3 : " + sa3);
	}

}
