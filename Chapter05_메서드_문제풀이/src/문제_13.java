import java.util.Scanner;

public class 문제_13 {
	static int year() {
		Scanner sc = new Scanner(System.in);
		System.out.print("연도를 입력하세요 : ");
		return sc.nextInt();
	}
	static String checkYear(int input) {
		String res = "";
		if((input % 4 == 0 && input % 100 != 0 )|| input % 400 == 0){
			res = input + "년도는 윤년입니다.";
		}
		else {
			res = input + "년도는 윤년이 아닙니다.";
		}
		return res;
	}
	
	static void process() {
		int user = year();
		String val = checkYear(user);
		System.out.println(val);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		process();
		
	}

}
