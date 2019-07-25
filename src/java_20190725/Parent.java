package java_20190725;

public class Parent {
	static {
		staticParent = 20;
		System.out.println("Parent static 초기화  ");
		m1();
	}
	static void m1() {
		System.out.println("sss");
	}
	void m2() {
		System.out.println("non static");
	}
	static int staticParent;
	String name;
	{
		System.out.println("Parent instance block");
		m1();
		m2();
	}
	
	public Parent() {
		System.out.println("Parent 생성자");
		m1();
	}
}
