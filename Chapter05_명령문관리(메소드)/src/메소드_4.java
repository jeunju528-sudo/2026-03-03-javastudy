import java.util.Scanner;

public class 메소드_4 {

	static void gugudan(int dan) {
		for(int i=1;i<=9;i++) {
			System.out.printf("%d * %d = %d\n", dan, i, dan*i);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("단을 입력해주세요 : ");
		int dan = sc.nextInt();
		gugudan(dan);
	}

}
