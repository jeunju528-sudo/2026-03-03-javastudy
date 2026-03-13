import java.util.Scanner;
public class 이진법변경 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int[] binary = new int[16];
		
		int idx = 15; // 뒤에서부터 저장
		System.out.print("0~32767까지 사이의 정수 입력 : ");
		int num = sc.nextInt();
		System.out.println("라이브러리:" + Integer.toBinaryString(num));
		System.out.println("라이브러리:" + Integer.toOctalString(num));
		System.out.println("라이브러리:" + Integer.toHexString(num));
		while(true) {
			binary[idx] = num % 2;
			num /= 2;
			if(num == 0) break;
			idx--;
		}
		
		for(int i=0; i<binary.length; i++) {
			if(i%4 == 0 && i!=0) {
				System.out.print(" ");
			}
			System.out.print(binary[i]);
		}
		
	}

}
