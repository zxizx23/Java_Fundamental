package java_20190724;

public class BoxDemo {
	
	
	public static void main(String[] args) {
		Box b1 = new Box();
		b1.width = 10;
		b1.heigh = 20;
		b1.depth = 30;
		
		Box b2 = new Box();
		b2.width = 10;
		b2.heigh = 20;
		b2.depth = 30;
		
		Box b3 = b2;
		
		System.out.println(b1 == b2);
		System.out.println(b2 == b3);
		
		//System.out.printf("wideth : %d, height : %d, depth : %d\n",b1.width,b1.heigh,b1.depth);
		//b1.change(b1);
		//System.out.printf("wideth : %d, height : %d, depth : %d\n",b1.width,b1.heigh,b1.depth);
	}

}
