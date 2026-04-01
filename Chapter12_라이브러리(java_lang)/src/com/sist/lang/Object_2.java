package com.sist.lang;
class Member implements Cloneable{
	String name = "홍길동";
	public void display() {
		System.out.println("이름 : "+name);
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
	
	
}

class CallByReference{
	public void change(Member m) {
		m.name = "박문수";
		
	}
}
public class Object_2 {

	public static void main(String[] args) throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		/* 얕은 복사 */
//		Member m1 = new Member();
//		m1.display();
//		// 객체 주소 복사 > 주소가 같은 경우에는 같은 메모리 주소 제어
//		Member m2 = m1;
//		m2.name = "심청이";
//		m1.display();
//		System.out.println(m1);
//		System.out.println(m2);
//		
//		CallByReference c = new CallByReference();
//		c.change(m1);
//		m1.display();
		
		/* 깊은 복사 */
		Member m1 = new Member();
		m1.name = "심청이";
		Member m2 = (Member)m1.clone();
		System.out.println(m1);
		System.out.println(m2);
//		m2.name = "심청이";
		System.out.println("m1.name = " + m1.name);
		System.out.println("m2.name = " + m2.name);
		
		//git clone
//		기존에 있는 모든 데이터를 복사해서 새로운 메모리에 저장해주는 것
		
	}

}
