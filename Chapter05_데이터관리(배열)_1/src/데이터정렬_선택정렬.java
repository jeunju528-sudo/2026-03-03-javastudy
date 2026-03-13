/*
 * 선택정렬 : 맨 처음 숫자와 다른 숫자들을 하나씩 비교함 (round)
 * 
 * */

import java.util.Arrays;

public class 데이터정렬_선택정렬 {
	public static void main(String[] args) {
		
		int[] arr = {3,6,1,2,5};
		
		System.out.println("\n정렬 후 : ");
		for(int i=0; i<arr.length-1;i++	) {
			for(int j=i+1; j<arr.length;j++) {
				if(arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
			System.out.println(Arrays.toString(arr));
		}
		
		for(int i: arr) {
			System.out.print(i + " ");
		}
	}
}
