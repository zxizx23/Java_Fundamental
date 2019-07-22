package java_20190718;
import java.util.*;

/*
  1. 1년 1월 1일 월요일
  2. 1년 365일. 운년 366일 - 2월 29일
  3. 윤년은 4년마다 발생하고 그중에서 100의 배수는 제외하고 400의 배수는 제외하지 않는다.
  4. 191225
  5. 2018년까지 총일수. 11월 까지 총일수, 25 더해서 7로 나눈 나머지가 1이면 월, 2이면 화.......0이면 일
 */
public class CalendarDemo {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int year = 2020;
		int month = 12;
		int day = 25;
		
		int preYear = year - 1;
		int preMonth = month - 1;
		int totalCount = 0;
		
		totalCount = preYear * 365 + (preYear/4 - preYear/100 + preYear/400);
		
		int[] monthArray = {31,28,31,30,31,30,31,31,30,31,30,31};
		if(year%4 == 0 && year % 100 != 0 || year%400 ==0) {
			monthArray[1] = 29;
		}
		
		for(int i=0;i<preMonth; i++) {
			totalCount += monthArray[i];
		}
		
		
		totalCount += day;
		int dayofWeek = totalCount % 7;
		
		String message = null;
		if(dayofWeek == 0) {
			message = "일요일";
		}else if(dayofWeek == 1) {
			message = "월요일";
		}else if(dayofWeek ==2) {
			message = "화요일";
		}else if(dayofWeek ==3) {
			message = "수요일";
		}else if(dayofWeek ==4) {
			message = "목요일";
		}else if(dayofWeek ==5) {
			message = "금요일";
		}else if(dayofWeek ==6) {
			message = "토요일";
		}
		System.out.println(year + "년 " + month +"월 " + day + "일은 " + message + "입니다");
		
	}
}