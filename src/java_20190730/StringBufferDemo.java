package java_20190730;

public class StringBufferDemo {
	public static void main(String[] args) {
		StringBuffer s1 = new StringBuffer("test");
		StringBuffer s2 = new StringBuffer("test");
		System.out.println(s1 == s2);
		//equals() Overriding 하지 않으면 false
		System.out.println(s1.equals(s2));
		//StringBuffer => String : toString()
		String s3 = s1.toString();
		String s4 = s2.toString();
		System.out.println(s3.equals(s4));
		
		StringBuffer sq1 = new StringBuffer();
		sq1.append("select name, age");
		sq1.append("from member");
		sq1.append("where name = '이의진'");
		sq1.append("order by name desc");
		
		System.out.println(sq1);
		//sq1의 모든 문자열 지우기
		sq1.setLength(0);
		
		sq1.append("select no,writer from board");
	}
}
