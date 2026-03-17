/*
 * 자바 : 데이터 관리
 * Vue, React : 화면 UI
 * => 수정 시에 바로 갱신이 안된다
 * -------------------------> 해결 : CI/CD
 * 
 * 제어어 : static | abstract | final
 *                            더 이상 수정이 안되는 메서드
 *                 선언만 된 메소드 => 인터페이스, 추상 클래스
 *        자동 메모리 할당 -> 메모리 공간에 한 개 생성 => 공유 변수/공유 메소드
 * 
 * 클래스 / 인터페이스 : 대문자 시작
 * 변수 / 메소드 : 소문자 시작
 * 상수 : 모두 대문자
 * 
 * */      
public class 메소드_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 문자열은 자체가 주소로 읽힌다.
		// s1 = s2 주소값, 내용이 같으면 주소값이 같다
		String s1 = "Hello";
		String s2 = "Hello";
		
		System.out.println("s1이 가지고 있는 문자 갯수 : "+ s1.length());
		System.out.println("hello 문자 갯수 : "+ "Hello".length());
		
		String msg = "Hello JAVA!";
		System.out.println(msg.charAt(2)); 
		System.out.println(msg.charAt(7)); 
		
		// s1 = s2 != s3 주소값, new 를 쓰면 새로운 주소를 할당하라고 함
		String s3 = new String("Hello");
	}

}
