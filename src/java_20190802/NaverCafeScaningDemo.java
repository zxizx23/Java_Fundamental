package java_20190802;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.URL;

public class NaverCafeScaningDemo {
	public static void main(String[] args) throws  IOException  {
		URL url = new URL("https://blog.naver.com/PostView.nhn?blogId=harloveysj&logNo=221460034406&redirect=Dlog&widgetTypeCall=true&directAccess=false");
		InputStream is = url.openStream();
		
		//1. InputStream을 InputStreamReader로 바꾼다
		//2. InputStreamReade을 BufferedReader 바꾼다(Stream chaning)
		//3  BufferesReader로 읽은 정보를 c:\dev\test\navercafe.html 파일저장
		//4.
		InputStreamReader isr = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(isr);
		FileWriter fw = new FileWriter("c:\\dev\\test\\navercafe.html");
		BufferedWriter bw = new BufferedWriter(fw);
		PrintWriter pw = new PrintWriter(bw,true);
		
		String ReadLine = null;
		while((ReadLine = br.readLine()) != null){
			pw.println(ReadLine);
		}

		
	}
}
