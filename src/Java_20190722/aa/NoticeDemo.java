package Java_20190722.aa;

public class NoticeDemo {
	public static void main(String[] args) {
		Notice n1 = new Notice();
		//public은 서로 다른 패키지도 접근가능
		n1.number = 1;
		//protected은 서로 다른 패키지이면서 상속받은 경우에는 접근 가능
		n1.title = "공지사항입니다";
		//default는 같은 패키지 내에서 접근가능
		n1.hit = 345;
		//private은 같은 클래스 안에서만 접근 가능
		//n1.regdate = "2019";
	}
}
