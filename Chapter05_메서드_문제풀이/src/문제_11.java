import java.util.Arrays;

public class 문제_11 {
	static void sort(int[] arr, String type) {
		if(type.equals("ASC")) {
			for(int i=0; i<arr.length-1; i++) {
				for(int j=i+1;j<arr.length;j++) {
					if(arr[i] > arr[j]) {
						int temp = arr[i];
						arr[i] = arr[j];
						arr[j] = temp;
					}
				}
			}
		} else {
			for(int i=0; i<arr.length-1; i++) {
				for(int j=i+1;j<arr.length;j++) {
					if(arr[i] < arr[j]) {
						int temp = arr[i];
						arr[i] = arr[j];
						arr[j] = temp;
					}
				}
			}
			
		}
		System.out.println(((type.equals("ASC")) ? "오름차순 : " : "내림차순 : ") + Arrays.toString(arr));
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[5];
		for(int i=0; i<arr.length;i++) {
			arr[i] = (int)(Math.random()*100)+1;
		}
		System.out.println("정렬 전 : " + Arrays.toString(arr));
		sort(arr, "ASC");
		sort(arr, "ASC");
		sort(arr, "DESC");
	}

}
