/*
 * String은 변경할 수 없다 / 있는 그대로 사용
 * String 단점 : final
 * 
 * startsWith : 첫글자가 동일한 것 
 * endsWith : 끝문자가 동일한 것
 * contains : 문자가 포함된 것
 * 
 * indexOf : 앞에서 찾아서 인덱스 번호 반환
 *  -> int indexOf(char c), int indexOf(String s)
 * lastIndexOf : 뒤에서부터 찾아서 인덱스 번호 반환
 * =========> -1 : 반환할 인덱스 번호 없음
 * */
import java.util.Scanner;
public class String_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] subject = {"혼자 배우는 자바", "자바 AND Spring", "기본 자바", "이것이 자바다", "Java AND JSP", "Oracle AND Java", "자바로 시작한 JSP", "JSP AND 자바"};
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("검색어 입력 : ");
		String fd = sc.next();
		
		System.out.println("[시작하는 문자열 찾기]");
		for(String str : subject) {
			if(str.startsWith(fd)) {
				System.out.println(str);
			}
		}
		System.out.println("\n[끝나는 문자열 찾기]");
		for(String str : subject) {
			if(str.endsWith(fd)) {
				System.out.println(str);
			}
		}
		System.out.println("\n[포함하는 문자열 찾기]");
		for(String str : subject) {
			if(str.contains(fd)) {
				System.out.println(str);
			}
		}
		

	}

}
