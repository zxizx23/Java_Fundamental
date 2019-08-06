package java_20190805;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class ExcelDemo2 {
	public static void main(String[] args) {
		//1. c:/dev/test/test1.txt파일 읽어 온다 => BufferedReader
		//2. BufferedReader의 readLine() 메서드를 이용해서 한줄 씩 읽어온다
		//3. 한줄읽은 문자열을 String의 split("#")을 이용해서 String[] 반환받는다.
		//4. [0] => cell입련한다. [1] => cell 입력한다.
		//5. 2~4반복 작업을 통해 엑셀에 입력한다
		//6. 엑셀파일명: c:\dev\test\test2.xls
		FileReader fr = null;
		BufferedReader br = null;
		FileOutputStream fos = null;
		int countrow = 0;
		HSSFWorkbook workbook = new HSSFWorkbook();//새 엑셀파일 생성
		HSSFSheet sheet = workbook.createSheet("새파일");
		HSSFRow row = sheet.createRow(countrow);
		HSSFCell cell = null;
		
		
		try {
			fr = new FileReader("c:\\dev\\test\\test1.txt");
			br = new BufferedReader(fr);
			String ReadLine = null;
			while((ReadLine = br.readLine()) != null){
				String[] a = ReadLine.split("#");					
				for (int i = 0; i < a.length; i++) {
					cell = row.createCell(i);
					cell.setCellValue(a[i]);;
			}
			countrow++;
			row = sheet.createRow(countrow);
			}
			fos = new FileOutputStream("c:\\dev\\test\\test2.xls");
			workbook.write(fos);
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(fr != null) fr.close();
				if(br != null) br.close();
				if(fos != null) fos.close();
			} catch (IOException e1) {
				e1.printStackTrace();
			}
		}
		/*FileReader fr = null;
		BufferedReader br = null;
		FileOutputStream fos = null;
		String readLine = null;
		HSSFRow row1 = null;
		HSSFCell cell1 = null;
		HSSFRow row2 = null;
		HSSFCell cell2 = null;
		int rowIndex = 0;
		HSSFWorkbook workbook = new HSSFWorkbook();// 새 엑셀파일 생성
		HSSFSheet sheet1 = workbook.createSheet("새파일1");// 새 시트 생성
		HSSFSheet sheet2 = workbook.createSheet("새파일2");// 새 시트 생성
		try {
			fr = new FileReader("c:\\dev\\test\\test1.txt");
			br = new BufferedReader(fr);
			while ((readLine = br.readLine()) != null) {
				row1 = sheet1.createRow(rowIndex);
				row2 = sheet2.createRow(rowIndex++);
				String[] temp = readLine.split("#");
				for (int i = 0; i < temp.length; i++) {
					cell1 = row1.createCell(i);
					cell1.setCellValue(temp[i]);
					cell2 = row2.createCell(i);
					cell2.setCellValue(temp[i]);
				}
			}
			fos = new FileOutputStream("c:\\dev\\test\\test2.xls");
			workbook.write(fos);
			System.out.println("성공...");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {

			try {
				if (fr != null) fr.close();
				if (br != null) br.close();
				if (fos != null) fos.close();
				if (workbook != null) workbook.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}*/
		
	}
	
}
