
public class 문제_5 {
	static int sum() {
		int sum = 0;
		for(int i=1; i<=10; i++) {
			sum += i;
		}
		return sum;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int s = sum();
		System.out.println("총합 : " + s);
	}

}
