/*
 * "문자열".replace(a, b) : 문자열에서 a를 찾아서 b로 바꿔라
 * replaceAll : 정규식을 할용함
 * "문자열".replaceAll(regex, "변경할 문자")
 *                   [A-Z] : 대문자 전체
 *                   [a-z] : 소문자 전체
 *                   [0-9] : 숫자 전체
 *                   ^[A-Z] : 대문자 시작
 *                   [^A-Z] : 대문자 제외
 *                   [가-힣] : 한글 전체
 *                   . : 임의의 한글자
 * */
public class String_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String msg = "Hello Java Javb Javc Javn";
		String s = msg.replace('l', 'k');
		System.out.println(s);
		
		s = msg.replace("Java", "Spring");
		System.out.println(s);
		
		s = msg.replaceAll("Jav", "Orar");
		System.out.println(s);
	}

}


