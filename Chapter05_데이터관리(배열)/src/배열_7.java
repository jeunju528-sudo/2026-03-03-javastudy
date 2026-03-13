// 배열 : 메모리 주소를 이용하는 프로그램
// 주소에 있는 데이터가 손상이 될 수 있다
// 배열 / 클래스 => 메모리 주소를 사용
public class 배열_7 {
	public static void main(String[] args) {
		char[] alpha = new char[10];
		
		//1. 배열의 저장 갯수
		System.out.println("생성된 메모리 갯수: "+ alpha.length);
		//2. 배열의 초기값
		for(int i=0; i<alpha.length; i++) {
			alpha[i] = (char)((int)(Math.random()*26)+65);
		}
		for(char c : alpha) {
			System.out.print(c + " ");
		}
		alpha[0] = 'X';
		int i=0;
		for(char c='A'; c<'J'; c++) {
			alpha[i]= c;
			i++;
		}
		System.out.println("변경 후..");
		for(char c:alpha) {
			System.out.print(c+" ");
		}
	}
}
