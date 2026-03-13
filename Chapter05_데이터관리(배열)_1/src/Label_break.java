
public class Label_break {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		aaa:
		for(int i=1;i<=3;i++) {
			for(int j=1;j<=3;j++) {
				if(j == 2) break aaa; // 라벨이 있는 곳으로 돌아가도록 함
				
				System.out.println(i + " " + j);
			}
		}
	}

}
