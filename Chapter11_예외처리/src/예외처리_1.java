class A{
	
}
class B extends A{
	
}
public class 예외처리_1 {
	String msg = "";
	public static void main(String[] args) {
		try {
			A a = new A();
			B b = (B)a;
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
//		예외처리_1 a = new 예외처리_1();
//		a.msg.substring(3);
//		int[] arr = new int[2];
//		try {
//			arr[0] = 10;
//			arr[2] = 20;
//			
//		} catch (Exception e) {
//			System.out.println(e.getMessage());
//		}
//		System.out.println(arr[0]);
	}
}
