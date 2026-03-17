
public class 메소드_3 {
	
	static void display() {
		System.out.println("display 진입...");
		System.out.println("기능 처리");
		System.out.println("display 종료...");
	}
	
	static void increment() {
		int a = 10;
		System.out.println("a="+a);
		a++;
	}
	public static void main(String[] args) {
		display();
		display();
		display();
		display();
		display();
		
	}
}
