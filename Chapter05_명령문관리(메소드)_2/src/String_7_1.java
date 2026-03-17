import java.util.Scanner;

public class String_7_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String msg = "Hello Java  ";
		System.out.println("문자의 갯수 : " + msg.length());
		System.out.println("문자의 갯수(공백제거) : " + msg.trim().length());
		
		String id = "admin";
		Scanner sc = new Scanner(System.in);
		System.out.println("아이디 입력 : ");
		String mid = sc.next().trim();
		
		if(id.equals(mid)) {
			System.out.println("로그인 성공");
		}
		else {
			System.out.println("로그인 실패");
		}
	}

}
