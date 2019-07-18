package java_20190717;

public class BreakDemo {
	public static void main(String[] args) {
		/*int sum = 0;
		for(int i = 1; i <=10; i++) {
			if(i%2 == 0) {
				sum += i;
			}
		}
		System.out.println(sum);
		System.out.printf("1부터 100까지의 짝수의 합은 %d입니다",sum);*/
	/*	int a;
		for(int j = 2; j <10; j++) {
			for(int k = 1; k<10; k++) {
				a = j * k;
				System.out.printf("%d * %d = %d\n",j,k,a);
			}
		}
		*/
		
	/*	for(int i = 5; i >=1; i--) {
			
			for(int j = 1; j<=6-i; j++) {
				System.out.printf("*");
			}
			
			System.out.println();
			
		}
		for(int i = 9; i>=2; i--) {
			for(int j=1; j <= 9 ;j++) {
				System.out.printf("%d * %d = %d\n",i,j,i*j);
			}
		}*/
		
		int sum = 0;
		test: for(int i = 1; i <=10; i++) {
			if(i == 6) break test; 
				sum += i;
			
		}
		System.out.printf("1부터 100까지의 짝수의 합은 %d입니다",sum);
	}

}
