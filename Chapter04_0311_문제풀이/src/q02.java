import java.util.Scanner;

public class q02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("정수를 입력하세요 : ");
		int input = sc.nextInt();
		if(input % 3 == 0) {
			System.out.println(input + "는(은) 3의 배수입니다.");
		}else {
			System.out.println(input + "는(은) 3의 배수가 아닙니다.");			
		}
	}
	
}
