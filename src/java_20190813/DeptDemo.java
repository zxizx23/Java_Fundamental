package java_20190813;

import java.util.ArrayList;

public class DeptDemo {
	public static void main(String[] args) {
		DeptDao dao = DeptDao.getInstance();
		
		boolean isSuccess = dao.insert(new DeptDto(80,"Server1","수원1"));
		
		if(isSuccess) {
			System.out.println("부서가 추가 되었음");
		}else {
			System.out.println("실패");
		}
		isSuccess = dao.update(new DeptDto(50,"개발부1","강남"));
		if(isSuccess) {
			System.out.println("부서가 변경 되었음");
		}else {
			System.out.println("실패");
		}
		ArrayList<DeptDto> list = dao.select();
		for (DeptDto d : list) {
			System.out.printf("%d\t%s\t%s\n",d.getNo(),d.getName(),d.getLoc());
		}
		
		isSuccess = dao.delete(110);
		if(isSuccess) {
			System.out.println("부서가 삭제 되었음");
		}else {
			System.out.println("삭제 안됨");
		}
	}
	
}
