import java.util.Calendar;
import java.util.Scanner;

public class 달력만들기_2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("년도 입력 : ");
		int year = sc.nextInt();
		System.out.print("월 입력 : ");
		int month = sc.nextInt();
		
//		System.out.println(year+"년도 "+month+"월"); 
		System.out.printf("%d년도 %02d월\n",year,month);
		
		Calendar cal = Calendar.getInstance();
		cal.set(Calendar.YEAR, year);
		cal.set(Calendar.MONTH, month-1);
		cal.set(Calendar.DATE, 1);
		
		int week = cal.get(Calendar.DAY_OF_WEEK);
		int lastday = cal.getActualMaximum(Calendar.DATE);
		
		String[] strWeek = {"일","월","화","수","목","금","토"};
		
//		System.out.println("오늘은 "+strWeek[week-1]+"요일입니다");
//		System.out.println("이번달 말일은 "+lastday+"입니다.");
		week -= 1;
		
		for(int i=0; i<strWeek.length;i++) {
			if(i==0) {
				System.err.print(strWeek[i]+"\t");
			}
			else {
				System.out.print(strWeek[i]+"\t");
			}
		}
		System.out.println();
		
		for(int i=1; i<=lastday; i++) {
			if(i==1) {
				for(int j=0;j<week;j++) {
					System.out.print("\t");
				}
			}
			if(week == 0) {
				System.out.printf("%2d\t",i);
			}else {
				System.out.printf("%2d\t",i);
			}
			week++;
			if(week > 6) { //일요일이면
				week = 0;
				System.out.println();
			}
		}
	}
}
