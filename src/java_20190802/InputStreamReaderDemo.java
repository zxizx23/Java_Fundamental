package java_20190802;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class InputStreamReaderDemo {
	public static void main(String[] args) {
		/*
		FileOutputStream fos = null;
		System.out.println("입려크> ");
		InputStream in = System.in; // 소스가 키보드인 경우
		byte[] b = new byte[1000];
		int readByteCount = 0;
		try {
			fos = new FileOutputStream("c:\\dev\\test\\keyboard.txt",true);//.txt 뒤에 ,true를 붙이면 원래 텍스트 파일에 이어쓰기 가능
			//readByteCount = in.read(b); // in.read(b) => 키보드에서 enter를 치면 읽는다.
			while((readByteCount = in.read(b)) != -1) {
				String str = new String(b,0,readByteCount).trim();
				if(str.equals("exit")) break;
				fos.write(b,0,readByteCount);
				System.out.println("입려크(exit시 종료) >");
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
					if(in != null) in.close();
					if(fos != null) fos.close();
			} catch (IOException e1) {
				e1.printStackTrace();
			}
		}*/
		System.out.println("입려크> ");
		InputStream in = System.in;
		InputStreamReader isr = null;
		BufferedReader br = null;
		
		FileWriter fw = null;
		BufferedWriter bw = null;
		PrintWriter pw = null;
		try {
			isr = new InputStreamReader(in);
			br = new BufferedReader(isr);
			
			fw = new FileWriter("c:\\dev\\test\\keyboard.txt",true);
			bw = new BufferedWriter(fw);
			pw = new PrintWriter(bw,true);
			
			String readLine = null;
			while((readLine = br.readLine()) != null){
				if(readLine.equals("exit")) break;
				pw.println(readLine);
				System.out.println("입려크");
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
					if(in != null) in.close();
					if(isr != null) isr.close();
					if(br != null) br.close();
					if(fw != null) fw.close();
					if(bw != null) bw.close();
					if(pw != null) pw.close();
					
					
			} catch (IOException e1) {
				e1.printStackTrace();
			}


		}
	}
}
