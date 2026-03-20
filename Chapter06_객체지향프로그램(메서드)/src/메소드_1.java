class Methods
{
	int a = 10;
	String name = "홍길동";
	static int b = 20;
	static void display() {
		System.out.println("Commons Methods");
	}
	void ditplay(int a) {
		System.out.println("Instance Methods");
	}
}
public class 메소드_1 {
	public static void main(String[] args) {
		System.out.println("b="+Methods.b);
		Methods.display();
	}
}
 