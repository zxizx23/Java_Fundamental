package java_20190723;

import java.util.*;

public class PrimeNumber {
	public void checkPrimeNumber(int temp) {
		boolean isPrimeNumber = false;
		int[] a = new int[temp];
		for (int i = 0; i < temp; i++) {
			a[i] = i + 2;
		}
		for (int i = 0; i < temp; i++) {
			a: for (int j = 0; j <= a.length; j++) {
				int di = a[j];
				if (temp % di == 0) {

					isPrimeNumber = false;

				}
			}
			isPrimeNumber = true;
		}

		if (isPrimeNumber) {
			System.out.println("소수");
		} else
			System.out.println("소수아님");
	}

	public static void main(String[] args) {
		PrimeNumber pr = new PrimeNumber();
		Scanner scanner = new Scanner(System.in);
		while (true) {
			System.out.println("숫자를 입력하시오");
			String input = scanner.nextLine();
			int num = Integer.parseInt(input);
			pr.checkPrimeNumber(num);
		}
	}

	public void printPrimeNumber(int temp) {
		// temp => 50이면 50이하의 소수를 모두구하여 출력한다.
		// 소수란 1을 제외한 2부터 약수가 1과 자기 자신 뿐인 수
		// 즉, 자기 자신보다 작은 수들을 나눠서 하나라도 나누어지면 소수가 아님
		// 2,3,5,7,11,13,17....
		boolean isPrimeNumber = false;
		int count = 0;
		for (int i = 2; i <= temp; i++) {
			isPrimeNumber = true;
			for (int n = 2; n < i; n++) {
				if (i % n == 0) {
					isPrimeNumber = false;
					break;
				}
			}
			if (isPrimeNumber) {
				count++;
				System.out.print(i + "\t");
			}
		}
		System.out.println();
		System.out.printf("소수의 갯수 : %s%n", count);

	}

	public int[] getPrimeNumber(int temp) {
		int[] array = new int[temp];// 추가
		boolean isPrimeNumber = false;
		int count = 0;
		for (int i = 2; i <= temp; i++) {
			isPrimeNumber = true;
			for (int n = 2; n < i; n++) {
				if (i % n == 0) {
					isPrimeNumber = false;
					break;
				}
			}
			if (isPrimeNumber) {
				array[count] = i;// 추가
				count++;
			}
		}
		int[] copyArray = new int[count];// 추가
		System.arraycopy(array, 0, copyArray, 0, count);// 추가
		return copyArray;// 추가
	}
}
