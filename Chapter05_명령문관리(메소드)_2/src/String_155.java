
public class String_155 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String hong = "admin";
		String shim = "admin";
		String park = new String("admin");
		String lee = "ADMIN";
		
		if(hong==shim) { // 주소비교
			System.out.println("hong과 shim은 같다");
		}
		else {
			System.out.println("hong과 shim은 같지않다");
		}
		
		if(hong==park) { // 주소비교
			System.out.println("hong과 park은 같다");
		}
		else {
			System.out.println("hong과 park은 같지않다");
		}
		
		if(hong.equals(park)) { // 값 비교
			System.out.println("hong과 park은 같다");
		}
		else {
			System.out.println("hong과 park은 같지않다");
		}
		
		if(hong.equals(lee)) { // 값 비교, 대소문자 비교
			System.out.println("hong과 lee는 같다");
		}
		else {
			System.out.println("hong과 lee는 같지않다");
		}
		
		if(hong.equalsIgnoreCase(lee)) { // 값 비교, 대소문자 비교
			System.out.println("hong과 lee는 같다");
		}
		else {
			System.out.println("hong과 lee는 같지않다");
		}


	}

}
