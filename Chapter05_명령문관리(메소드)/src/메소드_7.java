import java.util.Arrays;
import java.util.Scanner;

public class 메소드_7 {
	static char change(char c) {
		//소문자 -> 대문자, 대문자 -> 소문자
		return c >= 'A' && c <= 'Z' ? (char)(c+32) : (char)(c-32);
	}
	
	static int max(int[] arr) {
		int max = arr[0];
		for(int i=0; i<arr.length;i++) {
			if(max < arr[i]) {
				max = arr[i];
			}
		}
		return max;
	}
	
	static int min(int[] arr) {
		int min = arr[0];
		for(int i=0; i<arr.length; i++) {
			if(min > arr[i]) {
				min = arr[i];
			}
		}
		return min;
	}
	
	static void sort(int[] arr, String type) {
		for(int i=0; i<arr.length-1; i++) {
			for(int j=i+1; j<arr.length; j++) {
				boolean b = false;
				if(type.equals("ASC")) {
					b = arr[i] > arr[j];
				}
				else {
					b = arr[i] < arr[j];
				}
				if(b) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
//				System.out.println("정렬 과정[" + i + "] : " + Arrays.toString(arr));
			}
		}
	}
	
	static void gesan(int[] arr) {
		int sum = 0;
		double avg = 0.0;
		
//		for(int i=0; i<arr.length; i++) {
//			sum += arr[i];
//		}
		for(int i : arr) {
			sum += i;
		}
		
		avg = sum / (double)arr.length;
		
		System.out.println("총합 : " + sum);
		System.out.println("평균 : " + avg);
		
	}
	static void sort_desc(int[] arr) {
		for(int i=0; i<arr.length-1; i++) {
			for(int j=i+1; j<arr.length; j++) {
				if(arr[i] < arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
//				System.out.println("정렬 과정[" + i + "] : " + Arrays.toString(arr));
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Scanner sc = new Scanner(System.in);
		char c = change('a');
		System.out.println(c);
		
		int[] arr = new int[5];
		for(int i=0; i<arr.length; i++) {
			arr[i] = (int)(Math.random()*100)+1;
		}
		int max = max(arr);
		System.out.println("정렬 전 : " + Arrays.toString(arr));
		System.out.println("최대값은 "+max+"입니다.");
		
		int min = min(arr);
		System.out.println("최소값은 "+min+"입니다.");
		sort(arr, "ASC"); //asc, desc
		System.out.println("오름차순 정렬 후 : " + Arrays.toString(arr));
		sort(arr, "DESC"); //asc, desc
		System.out.println("내림차순 정렬 후 : " + Arrays.toString(arr));
		
		gesan(arr);

//		sort_desc(arr);
//		System.out.println("내림차순 정렬 후 : " + Arrays.toString(arr));
	}

}
