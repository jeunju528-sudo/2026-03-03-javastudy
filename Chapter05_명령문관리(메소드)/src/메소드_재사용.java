
public class 메소드_재사용 {
	public static void main(String[] args) {
		메소드_1.sum2();
		
		String s = "Hello Java!!";
		char c = s.charAt(0);
		
		double d = Math.random();
		
//		메소드_2.process();
		
		메소드_2 proc = new 메소드_2();
		
		proc.process();
		
	}
}
