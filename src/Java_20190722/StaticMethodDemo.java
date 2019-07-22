package Java_20190722;

public class StaticMethodDemo {
	String name;
	static double interestRate;
	
	public void m1() {
		System.out.println("m1() 메서드 호출");
	}
	
	public void m2() {
		//instance method에서는 instance 변수 , static 변수 사용가능
		//instance메서드 , static 메서드 호출 가능
		name = "Lee";
		interestRate = 0.1;
		m1();
		m3();
	}
	
	public static void m3() {
		System.out.println("m3() 메서드 호출");		
	}
	
	public static void m4() {		
		//static method에서는 instance 변수 사용 할 수 없음 , static 변수 사용가능
		//instance메서드 호출 불가능 , static 메서드 호출 가능
		//name = "Hong";
		interestRate = 0.2;
		//m1();
		m3();
	}
	public static void main(String[] args) {
		m3();
		m4();
		interestRate = 1.4;
		//instance 메서드는 객체를 생성 해 줘야 static 메서드에서 사용가능
		StaticMethodDemo s1 = new StaticMethodDemo();
		s1.m1();
		s1.m2();
		s1.name = "asd";
	}

}

