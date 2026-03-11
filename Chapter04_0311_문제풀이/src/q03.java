import java.util.Scanner;

public class q03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("정수를 입력하세요 : ");
		int input = sc.nextInt();
//		if(input < 0) {
//			input = input * -1;
//		}
//		System.out.println(input);
		
		System.out.println(Math.abs(input));
			
	}
}
