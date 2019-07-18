package java_20190717;

public class WhileDemo {
	public static void main(String[] args) {
		int sum = 0;
		int i = 1;
		while(i<=10){
			sum += i;
			i++;
			
		}
		System.out.printf("1부터 10까지의 합은 %d입니다.\n",i,sum);
		
		int j=2;
		while(j<=9) {
			int k=1;
			while(k<=9) {
				System.out.printf("%d * %d = %d\n",j,k,j*k);
				k++;
			}
			j++;
		}
	}

}
	