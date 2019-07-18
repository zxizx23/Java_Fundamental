package java_20190716;
/*
 1. 2-9 .2-5 곱한후 합계
 2. 총합을 11로 나눈 나머지 구한다
 3. 11에서 나머지를 뺸다
 4. 3읠 결과를 10으로 나눈 나머지를 구한다.
 5. 4의 결과와 마지막 숫자가 같으면 정상적인 주민 번호
 */

public class SsnDemo {
	public static void main(String[] args) {
		int a1 = 9;
		int a2 = 4;
		int a3 = 0;
		int a4 = 2;
		int a5 = 2;
		int a6 = 1;
		
		int b1 = 1;
		int b2 = 1;
		int b3 = 6;
		int b4 = 2;
		int b5 = 2;
		int b6 = 1;
		int b7 = 3;
		
		int sum = a1*2 + a2*3 + a3*4 + a4*5 + a5*6 + a6*7 + b1*8 + b2*9 + b3*2 + b4*3 + b5*4 + b6*5 ;
		int re = sum % 11;
		re = 11 - re;
		re = re % 10 ;
		
		if(re == b7) {
			System.out.println("정상");
		}else {
			System.out.println("비정상");
		}
		System.out.println("끝~~~~~~~~~~~~~~~~~~~~~");
		
		
		
		
	}

}
