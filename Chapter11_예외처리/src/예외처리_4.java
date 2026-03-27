
public class 예외처리_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 1; i <= 10; i++) {
			try {
				int no = (int) (Math.random() * 3);
				System.out.println(i + "." + (i / no));
			} catch (ArithmeticException e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}

	}

}
