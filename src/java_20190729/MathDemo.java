package java_20190729;

public class MathDemo {
	public static void main(String[] args) {
		double d1 = Math.ceil(4.0);
		System.out.println(d1);
		
		d1 = Math.floor(4.9);
		System.out.println(d1);
		
		int a1 = Math.round(4.4f);
		System.out.println(a1);
		
		double d2 = 42.789;
		double a = Math.round(d2*100);
		System.out.println(a/100);
		System.out.printf("%.2f\n",d2);
		
		double d3 = Math.sqrt(4);
		System.out.println(d3);
		
		double d4 = Math.pow(2, 50);
		System.out.println(d4);
		
		double d5 = Math.random();
		
		System.out.println(d5);
	}
}
