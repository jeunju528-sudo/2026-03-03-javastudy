import java.util.Scanner;

public class q01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("값을 입력하세요 : ");
		int input = sc.nextInt();
		if(input > 0) {
			System.out.println("양수입니다");
		}else {
			System.out.println("음수입니다");			
		}
	}
}
