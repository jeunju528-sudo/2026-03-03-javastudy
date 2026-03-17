/*
 * 두 정수를 나눗셈 결과를 구해주는 메소드 구현
 * */
public class 문제_7 {
	static int mod(int a, int b) {
		int result = a / b;
		return result;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int val = mod(6,3);
		System.out.println("두 정수의 나눗셈 결과 : " + val);
	}

}
