
public class q08 {
	public static void main(String[] args) {
		int answer = 0;
		for(int i=1;i<=100;i++) {
			if(i%2==0) {
				answer += i;
			}
		}
		System.out.println("2+4+...+100의 합 : " + answer);
		
	}
}
