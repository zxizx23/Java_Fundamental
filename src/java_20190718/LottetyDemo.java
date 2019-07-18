package java_20190718;

public class LottetyDemo {
	public static void main(String[] args) {

		// math.random() -> 0보다 크거나 같고 1보다 작은 양수를 double값으로 생성(반환)

		int[] lotto = new int[6];
		for (int i = 0; i < lotto.length; i++) {

			double random = Math.random();
			int temp = (int) (random * 45) + 1;
			// 중복값 제거 1 
			lotto[i] = temp;		  
			for (int j = 0; j < i; j++) { 
			  if (lotto[i] == lotto[j]) { 
			  	i--; 
			  	break; 
			  	} 
			 }
			 
			//중복값제거 2
			if (i == 0) {
				lotto[i] = temp;
			} else {
				boolean isExisted = false;
				for (int j = 0; j < i; j++) {
					if (lotto[j] == temp) {
						isExisted = true;
						break;
					}
				}
				if (!isExisted) {
					lotto[i] = temp;
				} else {
					i--;
				}
			}
			

		}
		for (int i = 0; i < lotto.length; i++) {
			for (int j = 0; j < i; j++) {
				if(lotto[i] < lotto[j]) {
					int temp = 0;
					temp = lotto[i];
					lotto[i] = lotto[j];
					lotto[j] = temp;
				}
			}
		}
		/*
		 for(int i=0;i<lotto.length;i++) {
			for (int j = 0; j < lotto.length-(i+1); j++) {
				if(lotto[j]>lotto[j+1]) {
					int temp = lotto[j];
					lotto[j] = lotto[j+1];
					lotto[j+1] = temp;
				}
			}
		}
		 */
	

		for (int i = 0; i < lotto.length; i++) {
			System.out.print(lotto[i] + " ");
		}
		System.out.printf("입니다");

	}

}
