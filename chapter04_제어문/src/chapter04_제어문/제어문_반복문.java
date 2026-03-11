package chapter04_제어문;

public class 제어문_반복문 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("\n ===== while ===== ");
		char c = 'A';
		while(c < 'Z') {
			System.out.print(c + " ");
			c++;
		}
		
		System.out.println("\n ===== do-while ===== ");
		c = 'A';
		do {
			System.out.print(c + " ");
			c++;
		}while(c < 'Z');

	}

}
