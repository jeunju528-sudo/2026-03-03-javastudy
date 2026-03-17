import java.util.Scanner;

public class 문제_6 {
	static int sum(int n) {
		int sum = 0;
		for(int i=1;i<=n;i++) {
			sum += i;
		}
		return sum;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력하세요 : ");
		int input = sc.nextInt();
		int s = sum(input);
		System.out.printf("1 ~ %d까지의 합 : %d", input, s);
		
	}
	
}
