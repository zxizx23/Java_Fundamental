package java_20190725;

public class SubDemo {
	public static void main(String[] args) {
		Sub s1 = new Sub();
		
		s1.gotoSchool();
		s1.makeMoney();//부모의 메서드
		s1.play("Starcraft"); // 부모의 메서드를 overriding(재정의)
		
		s1.money = 100000;
		s1.ck = "aaaa";
		
		//부모의 멤버변수, 메서드 접근가능
		//자식의 멤버변수 접근불가, 메서드 접근불가
		//자식의 메서드 중에서 오버라이딩된 메서드 접근 가능
		Super s2 = new Sub(); //Super
		//s2.gotoSchool();
		s2.makeMoney();
		s2.play("Starcraft");  //overriding 된거는 자식클래스를 따라감
		
		s2.money = 100000;
		//s2.ck = "aaaa";
	}
}
