package java_20190718;

public class ArrayDemo {
	public static void main(String[] args) {
		int[] a = new int[4];
		
		a[0] = 100;
		a[1] = 200;
		a[2] = 300;
		a[3] = 400;
		
		int sum = 0;
		for(int i=0; i<a.length; i++) {
			int temp = a[i];
			sum += temp;
			System.out.println(temp);
			
		}
		System.out.printf("배열의 총합은 %d입니다\n",sum);
		
		int[] s = {1000,2000,3000,4000,5000};
		
		System.out.println(s[0]);
		
		s[0] = 1;
		System.out.println(s[0]);
		
		for(int i=0;i<s.length;i++) {
			System.out.println(s[i]);
		}
	}

}
