
public class q12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int cnt = 0;
		for(int i=1; i<=30; i++) {
			if(i % 2 == 0) {
//				System.out.print(i + " ");
				System.out.printf("%2d\t", i);
				cnt++;
			}
			if(cnt == 3) {
				System.out.println();
				cnt = 0;
			}
		}
	}

}
