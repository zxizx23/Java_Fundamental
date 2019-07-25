package java_20190724;

public class InitializationDemo {
	int a;
	static int b;
	static final int C = 10;
	//static 초기화
	static {
		System.out.println("static area");
		b = 100;
	}
	public InitializationDemo(int a) {
		//생성자에서 초기화 할 수 있는 변수는 instance 변수만 가능
		System.out.println("생성자");
		this.a = a;
	}
	public static void main(String[] args) {
		System.out.println("main area");
		InitializationDemo i = new InitializationDemo(1000);
		System.out.println(i.a);
		System.out.println(b);
		System.out.println(C);
		
	}
}
