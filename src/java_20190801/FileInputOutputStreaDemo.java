package java_20190801;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileInputOutputStreaDemo  {
	public static void main(String[] args) {
		FileInputStream fis = null;
		FileOutputStream fos = null;
		
		try {
			fis = new FileInputStream("c:\\dev\\test\\son.jpg");
			//FileOutputStream(String path) 생성자에서 FileBNotFoundException 에러의 의미는 경로가 없기 때문에 발생하는 것임
			//따라서 FileOutputStream 객체를 생성할 때는 경로가 있는지 체크한 후에 객체를 생성해야 한다.
			fos = new FileOutputStream("c:\\dev\\test\\son1.jpg");
			int readByte = 0;
			//fis.read() => 1Byte씩 읽어들임 
			//더 이상 읽을 바이트가 없으면 -1 반환한다
			while((readByte = fis.read()) != -1){
				//fos.write(readByte)는 한 바이트 쓰기
				System.out.print(readByte);
			}
			System.out.println("성공");
		}catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				if(fis != null)fis.close();
			}catch(IOException e){
				e.printStackTrace();
			}
		}
	}
	
}
