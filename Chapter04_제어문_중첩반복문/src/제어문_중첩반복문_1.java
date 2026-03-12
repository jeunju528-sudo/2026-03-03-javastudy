
public class 제어문_중첩반복문_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i = 2; i <= 9; i++) {
			for(int j = 1; j <= 9; j++) {
				// \t tab(일정 간격)
				// %2d 를 줘야 균형이 잡힘
				System.out.printf("%d * %d = %2d\t",i, j, i*j);
			}
			System.out.println();
		}

	}

}
