import java.util.*;

public class 배열_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[10];
		Random r = new Random();
		for(int i=0; i<arr.length; i++) {
			arr[i] = r.nextInt(100)+1;
		}
		for(int a : arr) {
			System.out.print(a + " ");
		}
		System.out.println("\n====== 결과값 =======");
		int max = arr[0];
		int min = arr[0];
		int max_idx = 0;
		int min_idx = 0;
		for(int i=0; i<arr.length;i++) {
			if(max < arr[i]) {
				max = arr[i];
				max_idx = i;
			}
			if(min > arr[i]) {
				min = arr[i];
				min_idx = i;
			}
		}
		System.out.println("최대값 : " + max + " , 최대값 인덱스 : " + max_idx);
		System.out.println("최소값 : " + min + " , 최소값 인덱스 : " + min_idx);
		
	}

}
