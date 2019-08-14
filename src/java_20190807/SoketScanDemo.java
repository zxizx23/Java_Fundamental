package java_20190807;

import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

public class SoketScanDemo {
	public static void main(String[] args)  {
		//InetAddress i = InetAddress.getByName("99flower.co.kr");
		Socket socket = null;
		for(int s=0;s<=1024;s++) {
			//socket 객체가 생성되었다는 얘기를 host, port로 통신 할 수 있다는 얘기고 이는 해당 host에 port번호를 사용하고 있다는 얘기
			try {
				socket = new Socket("211.119.250.80",s);
				System.out.println(s+"번호를 사용하고 있다");
			} catch (UnknownHostException e) {
				// TODO Auto-generated catch block
				System.out.println("호스트가 존재 하지 않는다");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				System.out.println(s+"번호를 사용하지 않고 있습니다");
			}
			
		}
	}
}
