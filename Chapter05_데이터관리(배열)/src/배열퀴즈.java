import java.util.Arrays;
import java.util.Scanner;
/*
 * 자바에서 메모리 주소 이용하는 것 => 배열, 클래스
 * 
 * */

public class 배열퀴즈 {
	public static void main(String[] args) {
		/*
		 * 양의 정수 10개 입력받아 배열에 저장하고, 배열에 있는 정수 중에서 3의 배수만 출력하는 프로그램을 작성하라
		 * */
		/*
		int[] arr = new int[10];
		Scanner sc = new Scanner(System.in);
		for(int i=0; i<arr.length; i++) {
			System.out.print("값을 입력하세요 : ");
			arr[i] = sc.nextInt();
		}
		for(int a : arr) {
			if(a % 3 == 0) {
				System.out.print(a + " ");
			}
		}
		*/
		/*
		 * 정수를 10개 저장하는 배열을 만들고 1에서 10까지 범위의 정수를 랜덤하게 생성하여 배열에 저장하라. 그리고 배열에 든 숫자들과 평균을 출력하라. 
		 * */
		/*
		int[] arr2 = new int[10];
		int total = 0;
		for(int i=0; i<arr2.length;i++) {
			arr2[i] = (int)(Math.random()*10)+1;
		}
		for(int i=0; i<arr2.length;i++) {
			System.out.print(arr2[i] + " ");
			total += arr2[i];
		}
		System.out.println("평균 : " + total/arr2.length);
		*/
		
		/*
		 * 5개 정수를 입력받은 후 차례로 출력하는 프로그램 
		 * 입력예) 5 10 9 3 2출력예) 5 10 9 3 2
		 */
		/*
		int[] arr = new int[5];
		Scanner sc = new Scanner(System.in);
		for(int i=0; i<arr.length; i++) {
			System.out.print("값을 입력하세요 : ");
			arr[i] = sc.nextInt();
		}
		for(int a : arr) {
			System.out.print(a + " ");
		}
		*/
		/*
			문자 10개를 저장할 수 있는 배열을 선언하고 10개의 문자를 입력받아 입력받은 문자를 이어서 출력하는 프로그램 
			입력예) A B C D E F G H I J출력예) ABCDEFGHIJ
		*/
//		char[] arr = new char[10];
//		Scanner sc = new Scanner(System.in);
//		for(int i=0; i<arr.length; i++) {
//			arr[i] = sc.next().charAt(0);
//		}
//		int i = 0;
//		while(true) {
//			arr[i] = sc.next().charAt(0);
//			i++;
//			if(i == 10) break;			
//		}
//		for(char a : arr) {
//			System.out.print(a);
//		}
		/*
			정수 10개를 입력받은 후 세번째, 다섯번쨰와 마지막으로 입력받은 정수를 차례로 출력하는 프로그램 
			입력예) 5 3 9 6 8 4 2 8 10 1출력예) 9 8 1
		*/
//		int[] arr = new int[10];
//		Scanner sc = new Scanner(System.in);
//		for(int i=0; i<arr.length; i++) {
//			arr[i] = sc.nextInt();
//		}
//		System.out.println(arr[2] + " " + arr[4] + " "+ arr[9]);
		/* 
			10개의 정수를 입력받아 그 중 가장 큰 수를 출력하는 프로그램
			입력예) 5 10 8 55 6 31 12 24 61 2출력예) 61
		*/
		int[] arr = new int[10];
		Scanner sc = new Scanner(System.in);
		for(int i=0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		Arrays.sort(arr);
		System.out.println(arr[arr.length-1]);
		/*
			10명의 컴퓨터 정수를 입력받아 배열에 저장하고 총점과 평균을 구하여 출력하는 프로그램을 작성 5개의 정수를 {95, 75, 85, 100, 50}로 초기화하고 오름차순으로 정렬하는 프로그램 
			출력예) 50 75 85 95 100
		 */
	}
}
