package java_20190731;
//사용자 정의 예외 클래스
public class InsufficientBalanceException extends Exception {
	public InsufficientBalanceException(String msg) {
		//Exception 클래스의 매개변수 String인 생성자를 호출
		//msg는 에러메서지를 출력할 목적으로 사용한다
		super(msg);
	}
}
