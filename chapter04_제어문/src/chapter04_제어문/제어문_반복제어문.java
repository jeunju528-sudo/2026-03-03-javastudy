package chapter04_제어문;

/*
 * break : 
 *  - switch-case, 반복문 에서 사용
 *  - 해당 제어문 종료
 *  - 단독 if문 안에서 사용하면 오류 발생
 * continue:
 *  - 반복문에서만 사용 가능
 *  -
 * */
public class 제어문_반복제어문 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1; i<=10; i++) {
			if(i==5) continue;
			System.out.print(i+" ");
		}

	}

	
	
}
