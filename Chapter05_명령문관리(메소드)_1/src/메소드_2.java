import java.util.Scanner;

public class 메소드_2 {
	static int input(String subject) {
		Scanner sc = new Scanner(System.in);
		System.out.println(subject + " 입력 : ");
		return sc.nextInt();
	}
	
	static int total(int kor, int eng, int math) {
		int total = kor + eng + math;
		System.out.println("총점 : " + total);
		return total;
	}
	
	static double avg(int total) {
		double avg = total / 3.0;
		System.out.println("평균 : " + avg);
		return avg;
	}
	static String score(int avg) {
		
		String score = switch ((int)(avg/10)) {
		case 10,9->"A";
		case 8->"B";
		case 7->"C";
		case 6->"D";
		default-> "F";
		};
		System.out.println("학점 : " + score);
		return score;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int kor = input("국어");
		int eng = input("영어");
		int math = input("수학");
		
		int total = total(kor,eng,math);
		double avg = avg(total);
		String score = score((int)avg);
	}

}
