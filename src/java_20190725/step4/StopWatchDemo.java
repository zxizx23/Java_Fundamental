package java_20190725.step4;


public class StopWatchDemo {
	public static void execute(StopMilliWatch m) {

		m.start();

		for (long i = 0; i < 30000000000l; i++) {

		}
		m.stop();

		double elapsedTime = m.getElapsedTime();
		System.out.printf("경과시간 : %.3f", elapsedTime);
	}
	public static void execute(StopNanoWatch n) {

		n.start();

		for (long i = 0; i < 30000000000l; i++) {

		}
		n.stop();

		double elapsedTime = n.getElapsedTime();
		System.out.printf("경과시간 : %.9", elapsedTime);
	}
	public static void main(String[] args) {
		StopMilliWatch s1 = new StopMilliWatch();
		execute(s1);
		
	}

}
