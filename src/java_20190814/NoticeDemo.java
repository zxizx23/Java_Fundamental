package java_20190814;

import java.util.ArrayList;

public class NoticeDemo {
	public static void main(String[] args) {
		NoticeDao dao = NoticeDao.getInstance();
		
	/*	boolean isSuccess = dao.insert(new NoticeDto(0,"아","아","아",""));
		if(isSuccess) {
			System.out.println("삽입 성공");
		}else {
			System.out.println("삽입 실패");
		}
		*/
		boolean isSuccess = dao.update(new NoticeDto(2,"아","아","아",""),1);
		if(isSuccess) {
			System.out.println("업데이트 성공");
		}else {
			System.out.println("업데이트 실패");
		}
		
		ArrayList<NoticeDto> list = dao.select();
		for (NoticeDto n : list) {
			System.out.printf("%d\t%s\t%s\t%s\t%s\n",n.getNum(),n.getWriter(),n.getTitle(),n.getContent(),n.getRegdate());
		}
		
	/*	isSuccess = dao.delete(22);
		if(isSuccess) {
			System.out.println("삭제 성공");
		}else {
			System.out.println("삭제 실패");
		}*/
	}
}
