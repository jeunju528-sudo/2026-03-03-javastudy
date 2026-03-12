/*
 * *
 * **
 * ***
 * ****
 * 
 * ****
 * ***
 * **
 * *
 * 줄수  별표
 * 1     4 => i+j=5 => j = 5-i
 * 2     3
 * 3     2
 * 4     1
 * */
public class 제어문_중첩반복분_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1; i<=4; i++) {
			for(int j=1; j<=i; j++ ) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		for(int i=1; i<=4; i++) {
			for(int j=0; j<=4-i; j++ ) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
