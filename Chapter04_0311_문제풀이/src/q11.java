import java.util.Scanner;

public class q11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수를 입력하세요 : ");
		int input = sc.nextInt();
		int answer = 0;
		for(int i=1; i<=input; i++) {
			answer += i;
		}
		System.out.println("1~"+input+"까지의 합: "+answer);
	}

}
