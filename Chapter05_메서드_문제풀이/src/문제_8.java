/*
 * 문자열의 소문자를 대문자로 바꿔주는 메소드 구현
 * */
public class 문제_8 {
	static String toUpperCase(String str) {
		String answer = "";
//		answer = str.toUpperCase();
		for(int i=0; i<str.length();i++) {
			char c = str.charAt(i);
			if(c >= 'a' && c <= 'z') {
				answer += (char)(c - 32);
			}
			else {
				answer += c;
			}
		}
		return answer;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String val = toUpperCase("Hello Java!");
		System.out.println("val : " + val);
	}

}
