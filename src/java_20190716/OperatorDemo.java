package java_20190716;

public class OperatorDemo {
	public static void main(String[] args) {
		int a = 3, b = 5;
		a += b;
		System.out.println(a);
		a *= a;
		System.out.println(a);

		float c = a % b;
		System.out.println(c);

		int d = 10, e = 22;

		c = (float) e / d;
		System.out.println(c);
		int sum = 0;
	/*	for (int i = 1; i <= 100; i++) {
			for (int j = 2; i <= 100; j++) {
				if (j % i == 0) {
					System.out.println(j);
				}

			}

		}*/
		a = 10; 
		b = 20;
		
		boolean isSuccess = false;
		
		isSuccess = a > b;
		System.out.println(isSuccess);
		
		isSuccess = a < b;
		System.out.println(isSuccess);
		
		isSuccess = a >= b;
		System.out.println(isSuccess);
		
		isSuccess = a <= b;
		System.out.println(isSuccess);
		
		isSuccess = a == b;
		System.out.println(isSuccess);
		
		isSuccess = a != b;
		
		System.out.println(isSuccess);
		
		//앞이 이미 false라서  short circuit 발생, 뒤에 연산 안함 
		isSuccess = a ==b && a++ == b++;
		System.out.println(!isSuccess);
		System.out.println(a);
		System.out.println(b);
		

	}
}
