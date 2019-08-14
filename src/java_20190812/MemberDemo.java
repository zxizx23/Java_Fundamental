package java_20190812;

import java.util.ArrayList;

public class MemberDemo {
	public static void main(String[] args) {
		MemberDao mdao = MemberDao.getInstance();
/*		MemberDto m1 = new MemberDto(3,"트럼프2","미국2");
		boolean isSuccess = mdao.insert(m1);
		if(isSuccess) {
			System.out.println("성공");
		}else {
			System.out.println("실패");
		}
		
		m1 = new MemberDto(20,"트럼프2","미국2");
		isSuccess = mdao.update(m1);
		if(isSuccess) {
			System.out.println("수정 성공");
		}else {
			System.out.println("수정 실패");
		}*/
		ArrayList<MemberDto> list = mdao.select();
		for (MemberDto m : list) {
			int num = m.getNum();
			String name = m.getName();
			String addr = m.getAddr();
			System.out.printf("%d\t%s\t%s%n",num,name,addr);
		}
	}
}
