package Java_20190722;

public class MethodDemo {
	//메서드 정의
	//boolean 메서드의 반환값
	//int year => 매개변수(parameter)
	public boolean isLeafyear(int year) {
		//메서드이 반환값이 boolean이기 때문에 return value의 value도 boolean 이어야한다
		return year % 4 == 0 && year % 100 != 0 || year % 400 == 0; 
	}
	public char charofString(String message,int index) {
		return message.charAt(index);
	}
	public long plus(long first, long second) {
		return first + second;
	}
	public double div(double first, double second) {
		return first / second;
	}
	public void asc(int[] array) {
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < i; j++) {
				if(array[i] < array[j]) {
					int temp = 0;
					temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
		}
	}
	public static void main(String[] args) {
		//1번방법
		MethodDemo m1 = new MethodDemo();
		//인스턴스 메서드의 사용방법
		//객체 생성한 후에 reference()를 이용해서 호출하면 됨
		boolean isLeafyear = m1.isLeafyear(1200);
		System.out.println(isLeafyear);
		
		//2번 방법
		System.out.println(new MethodDemo().isLeafyear(2019));
		
		char c = m1.charofString("Hello", 0);
		System.out.println(c);
		
		long a = m1.plus(2100000000, 2100000000);
		System.out.println(a);
		
		double b = m1.div(3, 0);
		System.out.println(b);
		
		int[] temp = {2,1,6,4,30,11};
		for(int q : temp) {
			System.out.print(q + "\t");
		}
		System.out.println();
		
		m1.asc(temp);
		for(int q : temp) {
			System.out.print(q + "\t");
		}
		
	}
}
