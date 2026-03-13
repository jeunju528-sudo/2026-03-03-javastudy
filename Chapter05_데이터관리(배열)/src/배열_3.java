import java.util.Arrays;

public class 배열_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[5];
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = (int)(Math.random()*100)+1;
		}
//		for(int a : arr) {
//			System.out.println(a);
//		}
		
		System.out.println(Arrays.toString(arr));
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		
		// 배열 => 기능별로 묶는다
		/* 문자열 배열
		 * 이름 / 성별 / 주소 -> 각각 따로 저장할 수 있도록 배열을 만든다
		 * 
		 * */
	}

}
