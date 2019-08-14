package java_20190807.echo.client;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class EchoClient {
	private String ip;
	private int port;
	public EchoClient(String ip, int port) {
		this.ip = ip;
		this.port = port;
	}
	public void run() {
		Socket socket = null;
		
		try {
			//ip와 port로 서버와 접속을 시도한다
			//3번 소켓을 생성한다
			//4번 서버와 연결 한다.
			socket = new Socket(ip,port);
			
			//6번 소켓을 출력스트림으로 생성한 후에 서버에서 메세지를 보낸다.
			OutputStream os = socket.getOutputStream();
			OutputStreamWriter osw = new OutputStreamWriter(os);
			BufferedWriter bw = new BufferedWriter(osw);
			bw.write("하위~~~~");
			bw.newLine();
			bw.flush();
			
			//9번 소켓을 입력스트림으로 생성한 후에 서버에서 메세지를 읽는다
			InputStream is = socket.getInputStream();
			InputStreamReader isr = new InputStreamReader(is);
			BufferedReader br = new BufferedReader(isr);
			String readLine = br.readLine();
			System.out.println(readLine);
			
			
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			System.out.println("서버주소가 잘 못 되었습니다");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("서버가 죽어있습니다.");
		}
	}
	
	public static void main(String[] args) {
		new EchoClient("192.168.0.47",3000).run();;
	}
}
