
public class 빈도수구하기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[46];
		for(int i=0;i<=100;i++) {
			int rand = (int)(Math.random()*45)+1; //0~9
			arr[rand]++;
		}
		for(int i=1; i<arr.length;i++) {
			System.out.println(i+"->"+arr[i]);
			
		}
	}

}
