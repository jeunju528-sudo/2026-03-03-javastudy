package chapter04_제어문;

/*
 * 난수 1~100 사이의 수를 임의로 추출
 * => 맞추는 게임
 * => 힌트(UP/DOWN)
 * */
import java.util.*;
public class 제어문_반복문_dowhile2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random r = new Random();
		int com = r.nextInt(100)+1;
		// 100 => random 함수에서는 -1 되어서 나옴, 0~99 => 1~100 을 위해 1을 더함
		Scanner sc = new Scanner(System.in);
		int input = 0;
		
		do {
			System.out.println("1~100 사이의 정수를 입력하세요 : ");
			input = sc.nextInt();
			//사용자가 잘못 입력했을 때 제어
			if(input < 1 || input > 100) {
				System.out.println("잘못된 입력입니다!!");
				continue;
				//break, continue 밑에 코딩하면 에러 남!!
			}
			if(input < com) {
				System.out.println("UP");
			}
			else if(input > com) {
				System.out.println("DOWN");
			}
			else {
				System.out.println("정답");
				break;
			}
		}
		while(true);
		
		
		
	}

}
