package java_20190725;

public class Sub extends Super {
	String ck;
	public void gotoSchool() {
		System.out.println("Sub gotoSchool()");
	}
	//overriding : 부모의 메스드를 재정의
	//1. 반환형, 메서드 이름, 매개변수 일치
	//2. 접근 한정자는 부모보다 자식이 상위이거나 같아야 함
	public void play(String Starcraft) {
		super.play("omok");
		System.out.println("Sub play");
	}
}
