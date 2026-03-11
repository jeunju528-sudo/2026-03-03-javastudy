import java.util.Scanner;

public class q06 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("점수를 입력하세요 : ");
		int input = sc.nextInt();
		// 90~100이면 A,80~89이면 B,70~79이면 C, 60~69이면 D, 60점 이하면 F를 출력하라 (다중 if 사용)

		switch(input/10) {
		case 10:
		case 9:
			System.out.println("A학점입니다.");
			break;
		case 8:
			System.out.println("B학점입니다.");				
			break;
		case 7:
			System.out.println("C학점입니다.");					
			break;
		case 6:
			System.out.println("D학점입니다.");				
			break;
		default:
			System.out.println("F학점입니다.");				
			break;
		}
	}
}
