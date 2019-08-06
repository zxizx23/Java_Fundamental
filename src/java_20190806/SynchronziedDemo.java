package java_20190806;

public class SynchronziedDemo implements Runnable {
	int x;
	int y;
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0;i<100;i++) {
			x++;
			y++;
			String threadName = Thread.currentThread().getName();
			System.out.printf("x : %d, y : %d - %s\n",x,y,threadName);
			
		}
	}
	public static void main(String[] args) {
		SynchronziedDemo s1 = new SynchronziedDemo();
		SynchronziedDemo s2 = new SynchronziedDemo();
		
		Thread t1 = new Thread(s1);
		Thread t2 = new Thread(s2);
		
		t1.start();
		t2.start();
	}
}
