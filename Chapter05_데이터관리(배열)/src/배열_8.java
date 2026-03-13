import java.util.*;

public class 배열_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int win=0, lose=0, same=0;
		String[] res = {"가위","바위","보"};
		
		Scanner sc = new Scanner(System.in);
		for(int i = 0; i < 10; i++) {
			int com = (int)(Math.random()*3);
			
			System.out.println("가위(0), 바위(1), 보(2) : ");
			int user = sc.nextInt();
			
			int r = com-user;
			if(r == -1 || r == 2) {
				win++;
			} else if(r == 1 || r == -2) {
				lose++;
			} else {
				same++;
			}
			
		}
		System.out.printf("결과:%d승-%d무-%d패\n",win,same,lose);

//		Scanner sc = new Scanner(System.in);
//		
//		System.out.println("가위(0), 바위(1), 보(2) : ");
//		int user_input = sc.nextInt();
//		
//		int com = (int)(Math.random()*3);
//		System.out.println("컴퓨터 : " + res[com]);
//		System.out.println("사용자 : " + res[user_input]);
//		
//		System.out.println("====== 결과값 ======");
//		int r = com-user_input;
//		if(r == -1 || r == 2) {
//			System.out.println("User Win!!");
//		} else if(r == 1 || r == -2) {
//			System.out.println("Com Win!!");
//		} else {
//			System.out.println("Same Same");
//		}
		
	}

}
