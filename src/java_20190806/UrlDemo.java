package java_20190806;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;

public class UrlDemo {
	public static void main(String[] args) throws IOException {
		URL url = new URL("https://sports.news.naver.com/kbaseball/news/read.nhn?oid=529&aid=0000035945#content");
		String protocol = url.getProtocol();
		String host = url.getHost();
		int port = url.getPort();
		String path = url.getPath();
		String query = url.getQuery();
		String ref = url.getRef();
		
		System.out.println("Protocol : "+protocol);
		System.out.println("Host : "+host);
		System.out.println("Port : "+port);
		System.out.println("Path : "+path);
		System.out.println("Query : "+query);
		System.out.println("Ref : "+ref);
		
		InputStream is = url.openStream();
		InputStreamReader isr = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(isr);
		
		String readLine = null;
		while((readLine = br.readLine()) != null ) {
			System.out.println(readLine);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}
}
