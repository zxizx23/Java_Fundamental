package java_20190716;

public class IfDemo {
	public static void main(String[] args) {

		// run configurations -> Arguments -> program arguments
		/*
		  int month = Integer.parseInt(args[0]); //System.out.println(month); String
		 season = null; if(month == 12 || month == 1 || month == 2) { season =
		  "winter"; }else if (month == 3 || month == 4 || month == 5) { season =
		  "spring"; }else if (month == 6 || month == 7 || month == 8) { season =
		  "summer"; }else if (month == 9 || month == 8 || month == 10) { season =
		  "fall"; }else { season = "none"; } System.out.println(month + "month is " +
		  season); }*/

	int month = Integer.parseInt(args[0]);
	// System.out.println(month);
	String season = null;if(month==12||month==1||month==2)
	{
		season = "winter";
	}else if(month>=3&&month<=5)
	{
		season = "spring";
	}else if(month>=6&&month<=8)
	{
		season = "summer";
	}else if(month>=9&&month<=11)
	{
		season = "fall";
	}else
	{
		season = "none";
	}System.out.println(month+"month is "+season);
}

}

