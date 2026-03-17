import java.util.Arrays;
import java.util.Scanner;

public class 숫자야구게임_메소드 {
	static int[] getRand() {
		int[] com = new int[3];
		for (int i = 0; i < com.length; i++) {
			com[i] = (int) (Math.random() * 8) + 1; // 1~9사이 난수 발생
			for (int j = 0; j < i; j++) {
				if (com[j] == com[i]) {
					i--;
					break;
				}
			}
		}
		// 숫자를 랜덤하게 넣을 때 중복값 발생하지 않도록 로직
		/*
		 * int su = 0; // 랜덤값 boolean bCheck = false; for(int i=0; i<com.length; i++) {
		 * bCheck = true; while(bCheck) { // 루프문 안에서 if-else 주면 안됨 su =
		 * (int)(Math.random()*9)+1; bCheck = false; for(int j=0; j<i; j++) { if(com[j]
		 * == su) { bCheck = true; break; } } } }
		 */
		return com;
	}

	static int[] input() {
		Scanner sc = new Scanner(System.in);

		while (true) {
			int[] userArr = new int[3];

			System.out.print("정수 3자리를 입력하세요(1~9) : ");
			int user = sc.nextInt();
			if(user < 100 || user > 1000) {
				System.err.println("잘못된 입력입니다. 다시 입력해주세요.\n");
				continue;
			}
			String str = String.valueOf(user);
			boolean isValid = true;

			for (int i = 0; i < str.length(); i++) {
				int num = str.charAt(i) - '0';
				if (num < 1 || num > 9) {
					isValid = false;
					break;
				} else {
					userArr[i] = num;
				}
			}

			if (isValid) {
				return userArr;
			} else {
				System.err.println("잘못된 입력입니다. 0을 제외하고 다시 입력해주세요.\n");
			}
			/*
			 * 배열에 저장 user[0] = user / 100; user[1] = (user % 100) / 10; user[2] = user[1] %
			 * 10;
			 */

		}

	}

	static void compare(int[] com, int[] user) {
		int s = 0, b = 0;

		for (int i = 0; i < com.length; i++) {
			for (int j = 0; j < user.length; j++) {
				if (com[i] == user[j]) {
					if (i == j)
						s++;
					else
						b++;
				}
			}
		}
		
		hint(s, b, user);
		if(isEnd(s)) {
			System.out.println("Game Over!!");
			System.exit(0);
		}
		
	}

	static void hint(int s, int b, int[] user) {
		System.out.print("S : ");
		for (int i = 0; i < s; i++) {
			System.out.print("●");
		}
		System.out.print("\nB : ");
		for (int i = 0; i < b; i++) {
			System.out.print("○");
		}
		System.out.println();
	}

	static boolean isEnd(int s) {
		if (s == 3)
			return true;
		else
			return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] com = getRand();
		int[] user = new int[3];
		while(true) {
			user = input();
			compare(com, user);
		}
		
	}

}
