import java.util.Arrays;

public class 데이터정렬_선택정렬_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] alpha = new char[5];
		for(int i=0; i<alpha.length;i++) {
			alpha[i] = (char)((int)(Math.random()*26)+'A');
			for(int j=0; j<i; j++) {
				if(alpha[i] == alpha[j]) {
					i--; //이미 넣은 다음에 중복된 값이 있으면 삭제하기 위해 idx를 하나 앞으로 돌림
					break;
				}
			}
		}
		System.out.println("정렬 전 : ");
		for(char c : alpha) {
			System.out.print(c + " ");
		}
		
		System.out.println("\n정렬 후 : ");
		for(int i=0; i<alpha.length-1;i++) {
			for(int j=i+1; j<alpha.length; j++) {
				if(alpha[i] > alpha[j]) {
					char temp = alpha[i];
					alpha[i] = alpha[j];
					alpha[j] = temp;
				}
			}
			System.out.println(Arrays.toString(alpha));
		}
		for(char c : alpha)
		System.out.print(c + " ");

	}

}
