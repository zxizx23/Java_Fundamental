package java_20190723;
//java docs comment
/**
 Calendar 클래스는 연도별, 월별, 요일을 구할 수 있는 클래스 입니다.
 */
 
public class Calendar {
	public static final int SUNDAY = 0;
	public static final int MONDAY = 1;
	public static final int TUESDAY = 2;
	public static final int WEDNESDAY = 3;
	public static final int THURSDAY = 4;
	public static final int FRIDAY = 5;
	public static final int SATURDAY = 6;
	
	private int getCount(int year, int month, int day) {
		int preYear = year - 1;
		int preMonth = month - 1;
		int totalCount = 0;
		
		totalCount = preYear * 365 + (preYear/4 - preYear/100 + preYear/400);
		
		int[] monthArray = {31,28,31,30,31,30,31,31,30,31,30,31};
		if(isLeafYear(year)) {
			monthArray[1] = 29;
		}
		
		for(int i=0;i<preMonth; i++) {
			totalCount += monthArray[i];
		}
		
		
		totalCount += day;
		return totalCount;
		
	}
	private int getLastDay(int year,int month) {
		int[] monthArray = {31,28,31,30,31,30,31,31,30,31,30,31};
		if(isLeafYear(year)) {
			monthArray[1] = 29;
		}
		return monthArray[month-1];
	}
	private boolean isLeafYear(int year) {
		return year%4 == 0 && year % 100 != 0 || year%400 ==0;
	}
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
		System.out.println("일\t월\t화\t수\t목\t금\t토");
		int totalCount = getCount(year,month,1);
		int rest = totalCount % 7;
	
		//들여쓰기 기능
		for(int i=0;i<rest;i++) {
			System.out.print("\t");

		}
		for(int i=1;i<=getLastDay(year,month);i++) {
			System.out.print(i + "\t");
			if(rest % 7 == Calendar.SATURDAY) {
				System.out.println();
			}
			rest++;
		}
		System.out.println();
		System.out.println();
			
		

	}
	
	/**
	 매개변수에 연,월,일로 호출하면 요일을 출력하는 기능입니다.
	 
	 */
	public void print(int year,int month, int day) {
		int totalCount = getCount(year,month,day);

		

		int dayofWeek = totalCount % 7;
		
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
