package java_20190807.echo.client;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class EchoClient2 {
	private String ip;
	private int port;
	
	public EchoClient2(String ip, int port) {
		this.ip = ip;
		this.port = port;
	}
	public void run() {
		Socket socket = null;
		OutputStream os = null;
		OutputStreamWriter osw = null;
		BufferedWriter bw = null;
		InputStream is = null;
		FileOutputStream fos = null;
		try {
			socket = new Socket(ip,port);
			
			os = socket.getOutputStream();
			osw = new OutputStreamWriter(os);
			bw = new BufferedWriter(osw);
			bw.write("apache-tomcat-9.0.22.zip");
			bw.newLine();
			bw.flush();
			
			is = socket.getInputStream();
			File f = new File("c:\\dev\\test\\network");
			f.mkdirs();
			f = new File(f,"apache-tomcat-9.0.22.zip");
			fos = new FileOutputStream(f);
			byte[] readBytes = new byte[1024*8];
			int readByteCount = 0;
			while((readByteCount = is.read()) != -1) {
				fos.write(readBytes,0,readByteCount);
			}
			
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			System.out.println("서버 주소 이상해~~~");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("서버가 죽었어ㅜㅜㅜㅜㅜ");
		}finally {
			try {
			if(os != null) os.close();
			if(osw != null) osw.close();
			if(bw != null) bw.close();
			if(is != null) is.close();
			if(fos != null) fos.close();
			if(socket != null) socket.close();
			
			}catch(IOException e1) {
				e1.printStackTrace();
			}
			
		}
	}
	public static void main(String[] args) {
		new EchoClient2("192.168.0.52",4000).run();
	}
}
