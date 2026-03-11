/*
 * 지역변수 : {} 안에서만 사용이 가능 ===> 자동 메모리 해제 됨
 * 전역변수 : 다른 클래스에서 사용이 가능
 * ------------------------------멤버변수 ===> 사용자가 직접 삭제, 가비지컬렉션을 통해 삭제
 * */
public class 지역변수 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char c = 'A';
		for(int i=0; i<5; i++) {
			System.out.print(c++);
		}
		System.out.println();
		for(int i=0; i<5; i++) {
			char d = 'A'; // 메모리가 계속 변경되고 있음
			System.out.print(d++);
		}
		System.out.println();
		final double PIE = 3.14;
	}

}
