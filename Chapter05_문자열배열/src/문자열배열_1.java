import java.util.Arrays;

public class 문자열배열_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String hong = "홍길동";
		String shim = "심청이";
		String kim = "김두한";
		String lee = "이순신";
		String kang = "강감찬";
		
		String[] names = {"홍길동","심청이","김두한","이순신","강감찬"};
		// 출력 방법 1
		for(int i=0;i<names.length;i++) {
			System.out.println(names[i]);
		}
		
		// 출력 방법 2
		for(String name : names) {
			System.out.println(name);
		}
		
		// 출력 방법 3 -> 라이브러리 활용 
		
		System.out.println(Arrays.toString(names));
		
		names[0] = "박문수";
		System.out.println(Arrays.toString(names));
		
		

	}

}
