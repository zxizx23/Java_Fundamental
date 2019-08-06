package java_20190802;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public class PrintStreamDemo {
	public static void main(String[] args) {
		FileInputStream fis = null;
		FileOutputStream fos = null;
		BufferedInputStream bis = null;
		BufferedOutputStream bos = null;
		PrintStream ps = null;
		
		try {
			ps = System.out;
			ps.println("Hello world");
		
		fis = new FileInputStream("c:\\dev\\test\\java-pdf.zip");
		fos = new FileOutputStream("c:\\dev\\test\\java-pdf-clone.zip");
		bis = new BufferedInputStream(fis);//Stream chaining
		bos = new BufferedOutputStream(fos);
		ps = new PrintStream(bos,true);
		int readByte = 0;
		long start = System.currentTimeMillis();
		while((readByte = bis.read()) != -1){
			ps.write(readByte);
			
		}
		//bos.flush();//꼭 해줘야 함.
		long end = System.currentTimeMillis();
		System.out.println("경과시간 :" + (end-start));
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			try {
				
				if (fis != null) fis.close();
				if (fos != null) fos.close();
				if (bis != null) bis.close();
				if (ps != null) ps.close();
				if (bos != null) bos.close();
			} catch (IOException e1) {
				e1.printStackTrace();
			}
		}
	}
}
