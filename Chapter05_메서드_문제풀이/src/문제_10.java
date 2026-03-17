/*
 * 정수를 입력 받아서 이진법을 출력하는 메소드 작성(3개의 메소드)
 * */
import java.util.Scanner;
public class 문제_10 {
	static int input() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력하세요 : ");
		int input = sc.nextInt();
		return input;
	}
	
	static String changeBinary(int input) {
		String val = "";
	
		if(input == 0) {
			System.out.println("잘못 입력하였습니다.");
			return "0";
		}
		while(input > 0) {
			int a = input % 2;
			val = a + val;
			input = input / 2;
		}
		
		return val;
	}
	
	static void process() {
		int user = input();
		String val = changeBinary(user);
		System.out.println("2진수 : " + val);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		process();
	}

}
