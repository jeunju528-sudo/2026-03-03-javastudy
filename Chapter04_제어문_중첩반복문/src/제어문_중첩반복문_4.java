/*
 * ★★☆★★
 * ★★☆★★
 * ★★☆★★
 * ★★☆★★
 * ★★☆★★
 * 
 * ☆★★★★
 * ★☆★★★
 * ★★☆★★
 * ★★★☆★
 * ★★★★☆

 * ☆★★★☆
 * ★☆★☆★
 * ★★☆★★
 * ★☆★☆★
 * ☆★★★☆
 * 
 * i   j
 * 1   1 => i == j
 * 1   5 => i+j = 6 => j = 6-i
 * 2   2 => i == j
 * 2   4 => i+j = 6 => j = 6-i
 * 3   3 => i == j
 * 4   2
 * 4   4 => i == j
 * 5   1
 * 5   5 => i == j
 * */
public class 제어문_중첩반복문_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		for(int i=1; i<=5; i++) {
//			for(int j=1; j<=5; j++) {
//				if(j==3) System.out.print("☆");
//				else System.out.print("★");
//			}
//			System.out.println();
//		}
//		for(int i=1; i<=5; i++) {
//			for(int j=1; j<=5; j++) {
//				if(j==i) System.out.print("☆");
//				else System.out.print("★");
//			}
//			System.out.println();
//		}
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=5; j++) {
				if(i==j || j==6-i) { // i와 j의 관계를 파악해보는 것이 중요					
					System.out.print("☆");
				}
				else {
					System.out.print("★");
				}
			}
			System.out.println();
		}

	}

}
