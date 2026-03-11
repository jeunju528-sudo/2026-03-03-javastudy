package chapter04_제어문;

public class 제어문_반복문_while3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 1;
		int sum = 0, h_cnt = 0, j_cnt = 0;
		
		while(i <= 100) {
			if(i % 2 == 0) {
				j_cnt += i;
			}else {
				h_cnt += i;
			}
			i++;
		}
		sum = h_cnt + j_cnt;
		System.out.printf("총합 : %d, 홀수 합 : %d, 짝수 합 : %d", sum, h_cnt, j_cnt);
	}
}
