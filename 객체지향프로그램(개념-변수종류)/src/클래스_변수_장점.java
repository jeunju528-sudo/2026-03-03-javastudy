import java.util.*;

class Student{
	int kor,eng,math,total;
	double avg;
	char score;
	String name;
}

public class 클래스_변수_장점 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student[] std = new Student[3];
		Scanner sc = new Scanner(System.in);
		for(int i=0; i<std.length;i++) {
			Student s = new Student();
			System.out.println("이름 입력 : ");
			s.name = sc.next();
			System.out.println((i+1)+"번째 국어 점수 : ");
			s.kor = sc.nextInt();
			System.out.println((i+1)+"번째 영어 점수 : ");
			s.eng = sc.nextInt();
			System.out.println((i+1)+"번째 수학 점수 : ");
			s.math = sc.nextInt();
			
			s.total = s.kor + s.eng + s.math;
			s.avg = s.total / 3.0;
			
			std[i] = s;
			
		}
		
		for(Student ss : std) {
			System.out.printf("%5s%5d%5d%5d%7d%7.2f\n", ss.name, ss.kor,ss.eng,ss.math,ss.total,ss.avg);
		}
		

	}

}
