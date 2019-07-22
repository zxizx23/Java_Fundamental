package Java_20190722;
import java_20190719.Customer;
public class CustomerStaticDemo {
	public static void main(String[] args) {
		//static 변수는 클래스 이름으로 접근
		Customer.interestRate = 3.5;
		/*final 변수는 재할당 및 변경 할 수 없음
		Customer.BANKNAME = "우리은행";*/
		
		Customer c1 = new Customer();
		
		c1.name = "Lee";
		c1.age = 27;
		c1.email = "zxizx23@naver.com";
		c1.phone = "010-0000-0000";
		c1.balance = 2222.12;
		c1.isReleased = true;
		
		
		Customer c2 = new Customer();
		
		c2.name = "Kim";
		c2.age = 1;
		c2.email = "kim@naver.com";
		c2.phone = "010-1111-2222";
		c2.balance = 1711.22;
		c2.isReleased = true;
	
		Customer c3 = new Customer();
		
		c3.name = "Park";
		c3.age = 23;
		c3.email = "Park@naver.com";
		c3.phone = "010-3333-1234";
		c3.balance = 1520.4;
		c3.isReleased = false;
		
		System.out.println(Customer.interestRate);
		System.out.println(Customer.BANKNAME);
		

	}
}
