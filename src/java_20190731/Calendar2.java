package java_20190731;

import java.util.Calendar;

//java docs comment
/**
 Calendar 클래스는 연도별, 월별, 요일을 구할 수 있는 클래스 입니다.
 */
 
public class Calendar2 {

	/**
	 매개변수에 연도로 호출하면 해당 연도의 월별 달력을 출력하는 기능입니다.
	 
	 */
	public void print(int year) {
		for(int i=1;i<=12;i++) {
			
			print(year,i);
		
		}

	
	}
	/**
	 매개변수에 연도와 월로 호출하면 해당 연도의 월 달력을 출력하는 기능입니다.
	 
	 */
	public void print(int year, int month) {
		Calendar c = Calendar.getInstance();
		c.set(year,month-1,1);
		System.out.println("일\t월\t화\t수\t목\t금\t토");
		int dayOfWeek = c.get(Calendar.DAY_OF_WEEK);
	
		//들여쓰기 기능
		for(int i=1;i<dayOfWeek;i++) {
			System.out.print("\t");

		}
		for(int i=1;i<=c.getActualMaximum(Calendar.DATE);i++) {
			System.out.print(i + "\t");
			if(dayOfWeek % 7 == 0) {
				System.out.println();
			}
			dayOfWeek++;
		}
		System.out.println();
		System.out.println();
			
		

	}
	
	/**
	 매개변수에 연,월,일로 호출하면 요일을 출력하는 기능입니다.
	 
	 */
	public void print(int year,int month, int day) {
		Calendar c = Calendar.getInstance();
		c.set(year,month-1,day);
		

		

		int dayofWeek = c.get(Calendar.DAY_OF_WEEK);
		
		String message = null;
		if(dayofWeek == Calendar.SUNDAY) {
			message = "일요일";
		}else if(dayofWeek == Calendar.MONDAY) {
			message = "월요일";
		}else if(dayofWeek == Calendar.TUESDAY) {
			message = "화요일";
		}else if(dayofWeek == Calendar.WEDNESDAY) {
			message = "수요일";
		}else if(dayofWeek == Calendar.THURSDAY) {
			message = "목요일";
		}else if(dayofWeek == Calendar.FRIDAY) {
			message = "금요일";
		}else if(dayofWeek == Calendar.SATURDAY) {
			message = "토요일";
		}
		System.out.println(year + "년 " + month +"월 " + day + "일은 " + message + "입니다");
	}
}
