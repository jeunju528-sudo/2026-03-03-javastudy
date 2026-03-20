/*
 * 
 * 생성자 : 자신의 생성자 호출 가능
 * this() : 자신의 생성자, super() :
 * class A {
 * 	int a,b,c,d,e,f,g;
 * 	A(){
		a=1;
		b=2;
		c=3;
		d=4;
		e=5;
		f=6;
 * 	}
 *  A(int n){
 *  	this(); // a~f까지 값 넣어주는거 반복 제거 가능
 *  	g=n;
 *  }
 *  A(int m, int n){
 *  	this();
 *  	a=m;
 *  	b=n;
 *  }
 * 
 * }
 * 
 * */

class Member2 {
	int mno;
	String name;
	String address;
	// 사용이 안되는 곳
	// static {} static 메소드 안에서는 사용 불가
	/*
	 * static {
	 * 	nmo = 2; // 불가
	 * }
	 * */
	// static 변수는 모든 곳에서 사용 가능
	static String phone;
	
	Member2 (){
		mno = 1;
		name = "홍길동";
		address = "서울";
	}
	
	Member2(String n){
		this(); // 생성자 안엔서만 사용이 가능
				// 반드시 첫번째줄에서 사용
		name = n;
	}
	
	Member2(String n, String a){
		this(n);	// 현재 클래스의 생성자를 호출
		name = n;
		address = a;
	}
	
	Member2(String p, int a){
		phone = p;
		mno = 2;
	}
}
public class 생성자_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Member2 m1 = new Member2();
		System.out.println("회원번호 : " + m1.mno); //1
		System.out.println("이름 : " + m1.name);	  //홍길동
		System.out.println("주소 : " + m1.address);// 서울
		Member2 m2 = new Member2("심청이");
		System.out.println("회원번호 : " + m2.mno); //0
		System.out.println("이름 : " + m2.name);   //심청이
		System.out.println("주소 : " + m2.address);//null
		Member2 m3 = new Member2("박문수","부산");
		System.out.println("회원번호 : " + m3.mno); //0
		System.out.println("이름 : " + m3.name);   //박문수
		System.out.println("주소 : " + m3.address);//부산
		

	}

}
