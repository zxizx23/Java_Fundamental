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

public class EchoClient1 {
	private String ip;
	private int port;
	
	public EchoClient1(String ip, int port) {
		this.ip = ip;
		this.port = port;
	}
	public void run() {
		Socket socket = null;
		OutputStream os = null;
		OutputStreamWriter osw = null;
		BufferedWriter bw = null;
		InputStream is = null;
		InputStreamReader isr = null;
		BufferedReader br = null;
		try {
			socket = new Socket(ip,port);
			
			os = socket.getOutputStream();
			osw = new OutputStreamWriter(os);
			bw = new BufferedWriter(osw);
			bw.write("이 야호~~~!");
			bw.newLine();
			bw.flush();
			
			is = socket.getInputStream();
			isr = new InputStreamReader(is);
			br = new BufferedReader(isr);
			String q = br.readLine();
			System.out.println(q);
			
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
			if(isr != null) isr.close();
			if(br != null) br.close();
			if(socket != null) socket.close();
			
			}catch(IOException e1) {
				e1.printStackTrace();
			}
			
		}
	}
	public static void main(String[] args) {
		new EchoClient1("192.168.0.52",3000).run();
	}
}
