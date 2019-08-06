package java_20190806;

public class ThreadDemo extends Thread{
	public ThreadDemo(String threadName) {
		super(threadName);
	}
	public void run() {
		for(int i=0;i<1000;i++) {
			String threadName = Thread.currentThread().getName();
			System.out.printf("%s : %d\n",threadName,i);
		}
	}
	public static void main(String[] args) {
		System.out.println("*********start*********");
		ThreadDemo t1 = new ThreadDemo("첫번째 쓰레드");
		t1.start();
		ThreadDemo t2 = new ThreadDemo("두번째 쓰레드");
		t2.start();
		
		System.out.println("*********end*********");
		
	}
}
