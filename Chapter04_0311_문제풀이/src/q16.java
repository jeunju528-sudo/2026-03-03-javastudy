import java.util.Scanner;

public class q16 {
	public static void main(String[] args) {

		//숫자를 입력받아 3~5는 봄, 6~8은 여름, 9~11은 가을, 12,1,2는 겨울, 그 외의 숫자를 입력한 경우 잘못입력
		Scanner sc = new Scanner(System.in);
		
		System.out.println("달을 입력하세요 : ");
		int mon = sc.nextInt();
		System.out.print("switch문 사용 >> ");
		switch(mon) {
		case 3 :
		case 4 :
		case 5 :
			System.out.println("봄");
			break;
		case 6 :
		case 7 :
		case 8 :
			System.out.println("여름");
			break;
		case 9 :
		case 10 :
		case 11:
			System.out.println("가을");
			break;
		case 12 :
		case 1 :
		case 2 :
			System.out.println("겨울");
			break;
		default:
			System.out.println("월을 잘못입력하였습니다.");
		}
		System.out.print("if문 사용 >> ");
		if(mon == 3 || mon == 4 || mon == 5) {
			System.out.println("봄");
		}
		else if(mon == 6 || mon == 7 || mon == 8) {
			System.out.println("여름");
		}
		else if(mon == 9 || mon == 10 || mon == 11) {
			System.out.println("가을");
		}
		else if(mon == 12 || mon == 1 || mon == 2) {
			System.out.println("겨울");
		}
		else {
			System.out.println("월을 잘못입력하였습니다.");			
		}
	}
}
