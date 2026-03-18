class Member{
	
	// static이 선언되지 않은경우 개인 소유임, 새로운 객체를 만들 때마다 새로 저장됨
	int mno;
	String name;
	// Member클래스가 100개가 생겨도 메모리공간은 딱 1개만 되어있음. 전체가 다 바뀌게 만들려면 static으로 해야함, static 자동 저장
	static String compony="Daum"; 
}
public class 클래스변수_설정 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Member m1 = new Member();
		System.out.println("m1 : " + m1);
		m1.mno = 100;
		m1.name = "홍길동";
		Member m2 = new Member();
		System.out.println("m2 : " + m2);
		m2.mno = 200;
		m2.name = "심청이";
		Member m3 = new Member();
		System.out.println("m3 : " + m3);
		m3.mno = 300;
		m3.name = "박문수";
		
		System.out.println("회원 1 회원번호 : " + m1.mno);
		System.out.println("회원 1 회원이름 : " + m1.name);
		System.out.println("회원 2 회원번호 : " + m2.mno);
		System.out.println("회원 2 회원이름 : " + m2.name);
		System.out.println("회원 3 회원번호 : " + m3.mno);
		System.out.println("회원 3 회원이름 : " + m3.name);
		System.out.println("==========================");

		m1.name = "홍길수";
		System.out.println("회원 1 회원이름 : " + m1.name);
		System.out.println("회원 2 회원이름 : " + m2.name);
		System.out.println("회원 3 회원이름 : " + m3.name);
		System.out.println("==========================");

		m1.compony = "KaKao";
		System.out.println("회원 1 회사명 : " + m1.compony);
		System.out.println("회원 2 회사명 : " + m2.compony);
		System.out.println("회원 3 회사명 : " + m3.compony);
		System.out.println("==========================");

		Member.compony = "NAVER";
		System.out.println("회원 1 회사명 : " + m1.compony);
		System.out.println("회원 2 회사명 : " + m2.compony);
		System.out.println("회원 3 회사명 : " + m3.compony);
		System.out.println("==========================");
	}

}
