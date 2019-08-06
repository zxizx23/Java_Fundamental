package java_20190802;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintStream;

public class FileReaderWriterDemo {
	public static void main(String[] args) {
		FileReader fr = null;
		FileWriter fw = null;
		PrintStream ps = null;
		
		try {
			fr = new FileReader("c:\\dev\\test\\kic.txt");
			fw = new FileWriter("c:\\dev\\test\\kic-copy.txt");
	/*		int read = 0;
			while((read = fr.read()) != -1){
				fw.write(read);
				System.out.print((char)read);
			}*/
			int readCharCount = 0;
			char[] readChars = new char[10];
			while((readCharCount = fr.read(readChars)) != -1) {
				fw.write(readChars, 0, readCharCount);
				System.out.print(new String(readChars, 0, readCharCount));
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(fr != null)	fr.close();
				if(fw != null) fw.close();
			} catch (IOException e1) {
				e1.printStackTrace();
			}
		}	
	}
	

}
