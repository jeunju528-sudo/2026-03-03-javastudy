import java.util.Scanner;

public class q15 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
			
		int num = sc.nextInt();
		int a = num / 10; // 10의 자리 수
		int b = num % 10; // 1의 자리 수
		
		if(a == b) {
			System.out.println("10의자리와 1의자리가 같습니다.");
		}else {
			System.out.println("10의자리와 1의자리가 다릅니다.");						
		}
		
		/*
		
		while(true) {

			System.out.println("정수를 입력하세요(10~99) : ");
			int input = sc.nextInt();
			
			if(input < 10 || input > 99)
				continue;
			
			if(input % 11 == 0) {
				System.out.println("10의자리와 1의자리가 같습니다.");
			}
			else {
				System.out.println("10의자리와 1의자리가 다릅니다.");			
			}
		}
		*/
		
		/*
		if(input < 10 || input > 99)
			System.out.println("다시 입력하세요.");
		
		String s = input+"";
		char c1 = s.charAt(0);
		char c2 = s.charAt(1);
		if(c1 == c2) {
			System.out.println("10의자리와 1의자리가 같습니다.");
		}else {
			System.out.println("10의자리와 1의자리가 다릅니다.");			
		}
		*/
	}
}