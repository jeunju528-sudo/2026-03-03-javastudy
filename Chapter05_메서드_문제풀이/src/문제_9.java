
public class 문제_9 {
	static String reverseStr(String str) {
		String result = "";
		for(int i=str.length()-1; i>=0; i--) {
			result += str.charAt(i);
		}
		return result;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String val = reverseStr("hello java");
		System.out.println("val : " + val);
		
	}

}
