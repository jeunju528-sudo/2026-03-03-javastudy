import java.util.*;
public class 달력만들기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int year=0,month=0,day=0;
		
		System.out.println("년도 입력 : ");
		year = sc.nextInt();
		System.out.println("월 입력 : ");
		month = sc.nextInt();
		System.out.println("일 입력 : ");
		day = sc.nextInt();
		System.out.println(year+"년도 "+month+"월 "+day+"일");
		
		String[] strWeek = {"일","월","화","수","목","금","토"};
		for(String w:strWeek) {
			System.out.print(w+"\t");
		}
		
		// 요일 구하기(총날수 % 7) => 전년도까지의 총날수
		int total = (year-1)*365
				   +(year-1)/4
				   -(year-1)/100
				   +(year-1)/400;
		int[] lastday = {31,28,31,30,31,30,31,31,30,31,30,31};
		for(int i=0; i<month-1; i++) {
			total += lastday[i];
		}
		
		total++;
		
		int week=total%7;
		
		System.out.println();
		for(int i=1; i<=lastday[month-1];i++) {
			if(i==1)
			{
				for(int j=1;j<week;j++) {
					System.out.print("\t");
				}
			}
			System.out.printf("%d\t",i);
			week++;
			if(week>6) {
				week=0;
				System.out.println();
			}
		}
		
		
	}

}
