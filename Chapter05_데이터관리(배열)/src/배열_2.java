/*
 * 1. 배열 선언
 * 2. 배열 초기화
 * 3. 반복문을 이용한 데이터 출력
 * 4. 배열 복사
 * 5. 동적 생성
 * 
 * 1) 선언
 *    데이터형[] 배열명; => 권장사항
 *    데이터형 배열명[]; => C언어 호환
 *    => 정수 10개 : int[] arr
 *    => 문자      : char[] arr
 *    => 문자열    : String[] arr
 *    => 실수     : double[] arr
 *    => 논리     : boolean[] arr 
 * */
public class 배열_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 중간에 빠지거나 삭제되는 번호는 없다
		int arr[] = {10, 20, 30, 40, 50};
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[3]);
		System.out.println(arr[4]);
		
		arr[0] = 100;
		arr[1] = 200;
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[3]);
		System.out.println(arr[4]);
		
		for(int i=0; i<5; i++) {
			System.out.println(arr[i]);
		}
		
		// 향상된 for문 : arr의 실제값을 하나씩 가져옴 
		for(int a : arr) {
			System.out.println(a);
		}
		
		
		
	}

}
