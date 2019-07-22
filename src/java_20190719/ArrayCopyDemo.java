package java_20190719;

public class ArrayCopyDemo {
	public static void main(String[] args) {
		String[] fruits = {"apple","banana","watermelon","blueberry"};
		
		String[] temp = new String[6];
		
		//fruits =>  원본배열
		//0 => 원본배의 위치, 즉 원본배열의 복사 할 위치
		//temp => 카피 할 배열
		//0 => 카피 할 배열의 위치
		//4 => 원본배열의 4개요소를 카피
		System.arraycopy(fruits, 0, temp, 2, 4);
		temp[0] = "grape";
		temp[1] = "peach";
		
		for(String i : temp) {
			System.out.println(i);
		}
		
	}

}
