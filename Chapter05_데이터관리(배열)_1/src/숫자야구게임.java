/*
 * 3개의 숫자를 난수로 입력
 * 사용자 3개 입력
 * 
 * 1. 난수발생
 * -----------------반복문
 * 2. 사용자 입력
 * 3. 비교
 * 4. 힌트
 * 5. 정답
 * -----------------반복문
 * */
import java.util.Scanner;
public class 숫자야구게임 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int[] com = new int[3]; // 컴퓨터가 발생시킨 난수값 저장
		int[] user = new int[3]; // 사용자 입력값 저장
		
		for(int i=0; i<3; i++) {
			com[i] = (int)(Math.random()*9)+1; //1~9사이의 정수
			for(int j=0; j<i; j++) {
				if(com[j] == com[i]) {
					i--;
					break;
				}
			}
		}
		
		while(true) {
			System.out.print("세자리 정수를 입력하세요 : ");
			int input = sc.nextInt();
			//유효성 검사
			if(input < 100 || input > 999) {
				System.out.println("잘못된 입력입니다.");
				continue;
			}
			user[0] = input/100;
			user[1] = (input%100)/10;
			user[2] = input%10;
			
			//유효성 검사
			if(user[0] == user[1] || user[0] == user[1] || user[1] == user[2]) {
				System.out.println("같은 수는 사용할 수 없습니다.");
				continue;
			}
			if(user[0] == 0 || user[1] == 0 || user[2] == 0) {
				System.out.println("0은 사용할 수 없습니다.");
				continue;
			}
			
			int s=0, b=0;
			for(int i=0;i<3;i++) {
				for(int j=0;j<3;j++) {
					if(com[i]==user[j]) {
						if(i==j)	s++;
						else	b++;
					}
				}
			}
			
			System.out.printf("Input Number: %d, Result: %dS-%dB\n",input,s,b);
			if(s==3) {
				System.out.println("Game Over!");
				break;
			}
		}

		

	}

}
