package java_20190805;



import java.util.Scanner;

import bouns.Utility;

public class APIExamCaptchaDemo {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String id = "cdghen3knUduaHKmvUdb";
		String pw = "kGQzoJ2keE";
		String key = Utility.getCaptchaKey(id,pw);
		boolean isSuccess = Utility.isCaptchaImage(id,pw,key);
		if(isSuccess) {
			System.out.println("이미지 확인ㄱ");
			System.out.print("이미지 결과 값을 입력>");
			String value = sc.next();
			String result = Utility.getCaptchaResult(id, pw, key, value);
			System.out.println(result);
		}else {
			System.out.println("다시 확인ㄱ");
		}
		
	}
}
