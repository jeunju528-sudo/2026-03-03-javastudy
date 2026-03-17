/*
 * 문자열 잘라내기
 * 
 * substring(6) : 원하는 위치부터 뒤에 전체 
 * substring(2,5) : 부분적으로 자르기
 * String substring(int start)
 * String substring(int start, int end) -> int end는 index-1 을 줌
 * */
public class String_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String msg = "0123456789";
		// 3부터 전체
		System.out.println(msg.substring(3));
		// 1~5까지
		System.out.println(msg.substring(1,6));
		
		//우편번호 자르기
		String post = "100-111";
		System.out.println(post.substring(0,3));
		System.out.println(post.substring(4));
		
		String title = "Hello Java,Oracle";
		String temp = title.substring(0,10)+"...";
		System.out.println(temp);
	}

}
