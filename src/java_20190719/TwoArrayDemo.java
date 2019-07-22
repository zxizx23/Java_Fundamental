package java_20190719;

public class TwoArrayDemo {
	public static void main(String[] args) {
		int[][] a = { { 1, 1 }, { 2, 2 }, { 3, 3 } };

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				System.out.print(a[i][j]);
			}
			System.out.println();
		}
		int[] c = {10,20,30};
		
		//enhanced for loop
		for(int temp : c) {
			System.out.println(temp);
		}
	}

}
