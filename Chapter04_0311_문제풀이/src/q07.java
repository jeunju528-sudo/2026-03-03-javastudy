import java.util.Scanner;

public class q07 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("점수를 입력하세요 : ");
		int input1 = sc.nextInt();
		
		System.out.println("+,-,*,/ 를 입력하세요 : ");
		String op = sc.next();
		
		System.out.println("점수를 입력하세요 : ");
		int input2 = sc.nextInt();
		
		int answer = 0;
		switch(op){
		case "+":
			answer = input1 + input2;
			break;
		case "-":
			answer = input1 - input2;
			break;
		case "*":
			answer = input1 * input2;
			break;
		case "/":
			if(input2 == 0)
				System.out.println("0으로 나눌 수 없습니다");
			else
				answer = input1 / input2;
			break;
		default:
			System.out.println("연산가자 존재하지 않습니다.");
		}
		System.out.println(input1 + op + input2 + " = " + answer);
		
	}

}
