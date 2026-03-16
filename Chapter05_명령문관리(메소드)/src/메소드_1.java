
public class 메소드_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		메소드_1 s = new 메소드_1();
		int total = s.sum(10);
		System.out.println("메소드를 통한 호출 : " + total);
		
		sum2();
		
		int total3 = sum3(10);
		System.out.println("static 메소드를 통한 호출 : " + total3);
	}
	
	int sum(int x) {
		int answer = 0;
		for(int i=1; i<=x; i++) {
			answer += i;
		}
		return answer;
	}
	
	static void sum2() {
		int s = 0;
		for(int i=1;i<=10;i++) {
			s += i;
		}
		System.out.println("return 없는 메소드 1~10까지 합 : " + s);
		return;
	}
	
	static int sum3(int n) {
		int hap=0;
		for(int i=1;i<=n;i++) {
			hap += i;
		}
		return hap;
	}
}
