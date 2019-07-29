package java_20190729;

public class StringDemo {
	public static void main(String[] args) {
		String s1 = new String("test");
		String s2 = new String("test");
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));
		
		String s3 = "abc";
		String s4 = "abc";
		System.out.println(s3==s4);
		System.out.println(s3.equals(s4));
		
		String ssn = "abcd-zxcv";
		char a = ssn.charAt(3);
		System.out.println(a);
		
		
		System.out.println(ssn +" "+ s1);
		//ssn = ssn.concat(s1);
		System.out.println(ssn);
		
		String fileName = "aas.doc";
		if(fileName.endsWith("zip")) {
			System.out.println("압축파일 입니다");
		}else if(fileName.endsWith("doc")) {
			System.out.println("워드문서 입니다");
		}else {
			System.out.println("파일입니다");
		}
		//대소문자 구분 안함
		System.out.println(fileName.equalsIgnoreCase("AAs.dOc"));
		
		//입력한 문자열이 몇번째 인지 알려줌
		int index = ssn.indexOf("-");
		System.out.println(index);
		
		String fn = "asd.qwe.zxc.wte.doc";
		System.out.println(fn.indexOf("."));
		//문자열에서 맨 뒤에서부터 입력한 문자열을 찾고 앞에서 부터 몇번째 인지 세서 알려줌
		System.out.println(fn.lastIndexOf("."));
		
		//첫번째 숫자는 포함하고, 뒤에숫자는 포함하지 않음(0,4)
		String first = ssn.substring(0,4);
		//String first = ssn.substring(0,ssn.indexOf("-")); => 위에랑 똑같은 말
		
		//5번째 문자부터 전부 출력
		String second = ssn.substring(5);
		//String second = ssn.substring(ssn.indexOf("-")+1);
		System.out.println(first);
		System.out.println(second);
		
	}
}
