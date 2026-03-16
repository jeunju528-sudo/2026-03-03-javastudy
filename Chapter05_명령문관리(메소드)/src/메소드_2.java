/*
 * 사칙연산 => 정수만
 * => 한가지 기능만 수행
 * */
import java.util.*;
public class 메소드_2 {

	static int sum(int a, int b) {
		
		int c = a+b;
		return c;
	}
	
	static int minus(int a, int b) {
		int c = a-b;
		return c;
	}
	
	static int mul(int a, int b) {
		int c = a * b ;
		return c;
	}
	
	static String div(int a, int b) {
		String res = "";
		if(b == 0) {
			res = "0으로 나눌 수 없습니다";
		}
		else {
			res = a+"/"+b+"="+(a/(double)b);
		}
		return res;
	}
	static void process() {
		Scanner sc = new Scanner(System.in);
		System.out.print("첫번째 정수 입력 : ");
		int a = sc.nextInt();
		System.out.print("연산자 입력(+, -, *, /) : ");
		char op = sc.next().charAt(0);
		System.out.print("두번째 정수 입력 : ");
		int b = sc.nextInt();
		switch(op) {
		case '+'->{
			int result = sum(a,b);
			System.out.printf("%d+%d=%d\n",a,b,result);
		}
		case '-'->{
			int result = minus(a,b);
			System.out.printf("%d-%d=%d\n",a,b,result);
		}
		case '*'->{
			int result = mul(a,b);
			System.out.printf("%d*%d=%d\n",a,b,result);
		}
		case '/'->{
			String result = div(a,b);
			System.out.printf(result);
		}
		default->System.err.println("없는 연산자 입니다");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		process();
	}

}
