package java_20190807.echo.server;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class EchoServer1 {
	private int port;

	public EchoServer1(int port) {
		this.port = port;
	}

	public void run() {
		ServerSocket serverSocket = null;

		try {
			
			serverSocket = new ServerSocket(port);

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
		while (true) {
			System.out.println("클라이이언트 기다린다~~~");
			try {
				Socket socket = serverSocket.accept();
				InetAddress i = socket.getInetAddress();
				String ip = i.getHostAddress();
				System.out.println("클라이언트  ip : " + ip);
				

				InputStream is = socket.getInputStream();
				InputStreamReader isr = new InputStreamReader(is);
				BufferedReader br = new BufferedReader(isr);
				String as = br.readLine();
				System.out.println("Message : " + as);

				OutputStream os = socket.getOutputStream();
				OutputStreamWriter osw = new OutputStreamWriter(os);
				BufferedWriter bw = new BufferedWriter(osw);
				bw.write(as);
				bw.newLine();
				bw.flush();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

	public static void main(String[] args) {
		new EchoServer1(3000).run();

	}
}
