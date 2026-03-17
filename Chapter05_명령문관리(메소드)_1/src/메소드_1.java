import java.util.Scanner;

public class 메소드_1 {
	
	static int rand() {
		int com = (int)(Math.random()*100)+1;
		return com;
	}
	
	static int input() {
		Scanner sc = new Scanner(System.in);
		int user = 0;
		while(true) {
			System.out.print("1~100 사이 정수 입력 : ");
			user = sc.nextInt();
			
			if(user < 1 || user > 100) {
				System.out.println("잘못된 입력입니다.");
				continue;
			}
			break;
		}
		return user;
	}
	
	static void compare(int com, int user) {
		
		Scanner sc = new Scanner(System.in);
		
		if(com > user) {
			System.err.println("입력값보다 높은 수를 입력하세요");
		}
		else if(com < user){
			System.err.println("입력값보다 작은 수를 입력하세요");
		}
		else {
			System.out.println("Game Over");
			System.out.println("게임을 다시 할까요?(y/n)");
			char c = sc.next().charAt(0);
			if(c == 'y' || c == 'Y') {
				System.out.println("새로운 게임을 시작합니다.");
				process();
			}
			else {
				System.out.println("게임을 종료합니다.");
				System.exit(0);				
			}
		}
	}
	
	static void process() {
		int com = rand();
		while(true) {
			int user = input();
			compare(com, user);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		process();
		
	}

}
