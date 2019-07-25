package java_20190725.step3;


public class StopWatchDemo {
	public static void main(String[] args) {
		StopMilliWatch s1 = new StopMilliWatch();
		// currentTimeMillis() => 1970.01.01일부터 지금까지 시간을 나노세컨드로 반환한다

		s1.start();

		for (long i = 0; i < 30000000000l; i++) {

		}
		s1.stop();

		double elapsedTime = s1.getElapsedTime();
		System.out.printf("경과시간 : %.3f", elapsedTime);
	}

}
