
public class q13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int answer = 0;
		for(int i=1; i<=10; i++) {
			if(i % 2 == 0) {
				answer -= i;
			}
			else {
				answer += i;
			}
		}
		System.out.println("1-2+3-4...+9-10 의 값 : "+answer);
	}

}
