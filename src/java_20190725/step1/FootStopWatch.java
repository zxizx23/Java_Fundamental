package java_20190725.step1;
//1.요구상은 밀리세컨드로 경과 시간 만듬

public class FootStopWatch {
	long startTime;
	long endTime;
	
	public double getElapsedTime() {
		return (double)(endTime - startTime)/(double)1000;
	}
	public static void main(String[] args) {
		FootStopWatch f1 = new FootStopWatch();
		//currentTimeMillis() => 1970.01.01일부터 지금까지 시간을 밀리세컨드로 반환한다
		f1.startTime = System.currentTimeMillis();
		
		for(long i=0;i<30000000000l;i++) {
			
		}
		f1.endTime = System.currentTimeMillis();
		
		double elapsedTime = f1.getElapsedTime();
		System.out.printf("경과시간 : %.3f",elapsedTime);
	}
	
}
