/*
 *            인스턴스 변수                    정적변수
 * ------------------------------------------------------------
 * 선언방식
 * 저장시점  new 연산자를 이용            컴파일시 자동 저장
 *        => 메모리 공간 확보
 * ------------------------------------------------------------
 * 저장위치  Heap
 *        => 개발자가 정하는 메모리 공간   
 * ------------------------------------------------------------
 * 공유여부  객체마다 독립적인 메모리 생성    모든 객체가 하나의 메모리를 공유
 * ------------------------------------------------------------
 * 접근방법  객체.변수명                 클래스명.변수명
 * ------------------------------------------------------------
 * 생명주기  객체가 메모리에 있는 동안       프로그램 종료시까지 사용 가능
 * ------------------------------------------------------------
 * 
 * */
import java.util.*;
class Diary{
	int year, month, week, lastday;
	void input() {
		Scanner sc = new Scanner(System.in);
		System.out.print("연도 입력 : ");
		year = sc.nextInt();
		System.out.print("월 입력 : ");
		month = sc.nextInt();
	}
	void findLastDay() {
		//달력 객체 생성 (추상클래스는 new를 사용할 수 없음)
		Calendar cal = Calendar.getInstance();
		cal.set(Calendar.YEAR, year);
		cal.set(Calendar.MONDAY, month-1);
		cal.set(Calendar.DATE, 1);
		
		week = cal.get(Calendar.DAY_OF_WEEK);
		week -= 1;
		lastday = cal.getActualMaximum(Calendar.DATE);
		
	}
	void print() {
		System.out.println(year + "년도 "+month+"월");
		String[] strWeek = {"일","월","화","수","목","금","토"};
		for(String s : strWeek) {
			System.out.print(s+"\t");
		}
		System.out.println("\n");
		for(int i=1; i<=lastday; i++) {
			if(i==1) {
				for(int j=0; j<week;j++) {
					System.out.print("\t");
				}
			}
			System.out.printf("%02d\t",i);
			week++;
			if(week>6) {
				week = 0;
				System.out.println();
			}
		}
	}
	
}
public class 클래스_멤버변수_정리 {

//	int a = 10;
//	void increment() {
//		System.out.println("a = " + a);
//		a--;
//	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		클래스_멤버변수_정리 a= new 클래스_멤버변수_정리();
//		a.increment();
//		a.increment();
//		a.increment();
//		a.increment();
//		a.increment();
//		a.increment();
		Diary d = new Diary();
		d.input();
		d.findLastDay();
		d.print();
	}

}
