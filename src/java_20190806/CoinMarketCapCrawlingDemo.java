package java_20190806;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import bouns.Utility;

public class CoinMarketCapCrawlingDemo {
	public static void main(String[] args) {
		String url = "https://coinmarketcap.com/currencies/bitcoin/historical-data/?start=20190101&end=20190806";
		
		Document doc = null;
		
		try {
			doc = Jsoup.connect(url).get();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Date\tOpen\tHigh\tLow\tClose\tVolume\tMarket Cap");
		
		Elements elements = doc.select(".table-responsive .table tbody tr");
		
		
		HSSFWorkbook workbook = new HSSFWorkbook();//새 엑셀파일 생성
		HSSFSheet sheet = workbook.createSheet("새파일");
		HSSFRow row = null;
		HSSFCell cell = null;
		row = sheet.createRow(0);
		cell = row.createCell(0);
		cell.setCellValue("Date");
		cell = row.createCell(1);
		cell.setCellValue("Open");
		cell = row.createCell(2);
		cell.setCellValue("High");
		cell = row.createCell(3);
		cell.setCellValue("Low");
		cell = row.createCell(4);
		cell.setCellValue("Close");
		cell = row.createCell(5);
		cell.setCellValue("Volume");
		cell = row.createCell(6);
		cell.setCellValue("Market");
		

		

		
		//System.out.println(elements.size());
		for(int i=0;i<elements.size();i++) {
			int index = 0;
			Element trElement = elements.get(i);
			//Element dateElement = trElement.child(0);
			
			String date = trElement.child(index++).text();
			date = Utility.getKoreanDate(date);
			
			///Element openElement = trElement.child(1);
			String open = trElement.child(index++).text();
			String high = trElement.child(index++).text();
			String low = trElement.child(index++).text();
			String close = trElement.child(index++).text();
			String volume = trElement.child(index++).text();
			String market = trElement.child(index++).text();
			row = sheet.createRow(i+1);
			
			cell = row.createCell(0);
			cell.setCellValue(date);
			cell = row.createCell(1);
			cell.setCellValue(open);
			cell = row.createCell(2);
			cell.setCellValue(high);
			cell = row.createCell(3);
			cell.setCellValue(low);
			cell = row.createCell(4);
			cell.setCellValue(close);
			cell = row.createCell(5);
			cell.setCellValue(volume);
			cell = row.createCell(6);
			cell.setCellValue(market);
//			System.out.printf("%s\t%s\t%s\t%s\t%s\t%s\t%s\n",date,open,high,low,close,volume,market);
			
		}
		
		try {
			FileOutputStream fos = new FileOutputStream("c:\\dev\\test\\crawling.xls");
			workbook.write(fos);
			fos.close();
			workbook.close();
			System.out.println("성공!");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}
