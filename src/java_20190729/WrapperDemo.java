package java_20190729;
//ctrl + shift + o => 자동 import
import java.util.ArrayList;

public class WrapperDemo {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		//자바 1.4이전 버전에서는 primitive data type을 collection에 저장할 수 없었기 때문에 
		//Primitive date type을 객체화 할 수 있는 Wrapper으로 변환하여 저장해야 한다. 아래와 같이 1을 add 할 수 없음
		//list.add(1);
		list.add(new Integer(1));
		
		// 1. Primitive data type = > Wrapper type(new Integer(10))
		Integer i2 = new Integer(10);
		Integer i3 = new Integer(20);
		
		// 2. String => Wrapper class (Integer.valueOf("10"))
		String s1 = "10";
		Integer i = Integer.valueOf(s1);	
	
		// 3. Wrapper class => primitive data type(intValue())
		int temp = i2.intValue() + i3.intValue();
		
		// 4. String = > Primitive data type (Integer.parseInt(s))
		int a = Integer.parseInt(s1);
		
		// 5. Primitive data type => String (String.valueOf(int))
		int a1 = 10;
		String s3 = String.valueOf(a1);
		
		//auto - Boxing : primitive data type을 자동으로 Wrapper
		Integer w = 10;
		
		//auto - UnBoxing : Wrapper를 자동으로 primitive data type
		int q = i2 + i3;
		
		String s5 = "12.34";
		double z = Double.parseDouble(s5);
		System.out.println(s5);
	}
}
