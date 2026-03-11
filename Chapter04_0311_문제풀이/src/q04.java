import java.util.Scanner;

public class q04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 4년마다 => year % 4
		// 100년마다 제외 => year % 100 !=0
		// 400년마다 => year % 400
		
		System.out.println("년도를 입력하세요 : ");
		int input = sc.nextInt();
		if((input % 4 == 0 && input % 100 != 0 )|| input % 400 == 0) {
			System.out.println(input + "년도는 윤년입니다.");
		}else {
			System.out.println(input + "년도는 윤년이 아닙니다.");			
		}			
	}
}
