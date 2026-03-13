import java.util.*;
/*
 * 변수/배열/클래스 => RAM에 저장, 프로그램 종료 시 사라짐
 * */
public class 배열_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
		Scanner sc = new Scanner(System.in);
		
		int kor1, kor2, kor3;
		int eng1, eng2, eng3;
		int math1, math2, math3;
		int total1, total2, total3;
		double avg1, avg2, avg3;
		char score1, score2, score3;
		
		System.out.print("첫번째 학생의 국어 점수 : ");
		kor1 = sc.nextInt();
		System.out.print("첫번째 학생의 영어 점수 : ");
		eng1 = sc.nextInt();
		System.out.print("첫번째 학생의 수학 점수 : ");
		math1 = sc.nextInt();		
		total1 = kor1+eng1+math1;
		avg1 = total1 / 3.0;
		
		System.out.print("두번째 학생의 국어 점수 : ");
		kor2 = sc.nextInt();
		System.out.print("두번째 학생의 영어 점수 : ");
		eng2 = sc.nextInt();
		System.out.print("두번째 학생의 수학 점수 : ");
		math2 = sc.nextInt();		
		total2 = kor2+eng2+math2;
		avg2 = total2 / 3.0;
		
		System.out.print("세번째 학생의 국어 점수 : ");
		kor3 = sc.nextInt();
		System.out.print("세번째 학생의 영어 점수 : ");
		eng3 = sc.nextInt();
		System.out.print("세번째 학생의 수학 점수 : ");
		math3 = sc.nextInt();		
		total3 = kor3+eng3+math3;
		avg3 = total3 / 3.0;
		
		System.out.printf("%5d%5d%5d%5d%7.2f\n",kor1, eng1, math1, total1, avg1);
		System.out.printf("%5d%5d%5d%5d%7.2f\n",kor2, eng2, math2, total2, avg2);
		System.out.printf("%5d%5d%5d%5d%7.2f\n",kor3, eng3, math3, total3, avg3);

	}
}
