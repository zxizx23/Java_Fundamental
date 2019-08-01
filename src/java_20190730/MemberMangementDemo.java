package java_20190730;

import java.util.ArrayList;
import java.util.Scanner;

public class MemberMangementDemo {
	private ArrayList<Member> list;
	
	public MemberMangementDemo() {
		list = new ArrayList<Member>();
		// TODO Auto-generated constructor stub
	}
	public void print() {
		System.out.println("***************************************************");
		System.out.println("* 1. insert 2. update 3. delets 4. search 5. exit *");
		System.out.println("***************************************************");
	}
	public String console(String msg) {
		//System.out.print(msg);
		Scanner sc = new Scanner(System.in);
		return sc.next();
	}

	private void run(String selectIndex) {
		// TODO Auto-generated method stub
		if(selectIndex.equals("1")) {
			insert();
		}else if(selectIndex.equals("2")) {
			update();
		}else if(selectIndex.equals("3")) {
			delete();
		}else if(selectIndex.equals("4")) {
			search();
		}else if(selectIndex.equals("5")) {
			System.out.println("exit....");
		}else {
			System.out.println("warning....");
			print();
			String Index = console("번호를 선택하셔요>");
			run(Index);
		}
		
	}
	//1.아이디를 입력받는다
	//2.이름을 입력 받는다.
	//3.ArrayList에 고객을 추가한다.
	//4.ArrayList에 있는 고객을 모두 출력한다.
	//5.print() 메서드를 호출한다.
	//6.번호를 선택하세요> 메세지를 출력한후 키보드 입력을 받게한다.
	private void insert() {
		String id = console("아이디 : ");
		String name = console("이름 : ");
		Member m1 = new Member(id,name);
		list.add(m1);
		extracted();				
	}
	//1. 수정할 아이디를 입력받는다
	//2. ArrayList에서 수정 할 아이디를 찾아서 수정 할 이름을 입력 받고, ArrayList에서 수정하고 , 없으면 수정 할 아이디가 없습니다. 메시지 출력
	//3. ArrayList에 있는 모든 고객을 출력한다.
	//4. print()메서드를 호출
	//5. 번호를 선택하셔요> 메세지를 출력한 후 키보드 입력을 받게한다
	private void update() {
		String id = console("아이디 : ");
		boolean isExisted = false;
		
		for(Member member:list) {
			if(id.equals(member.getId())) {
				isExisted = true;
				break;
			}
		}
		if(isExisted) {
			String updatename = console("수정 할 이름 : ");
			for(Member member:list) {
				if(id.equals(member.getId())) {
					member.setName(updatename);
					break;
				}
			}
		}else {
			System.out.println("수정 할 아이디가 없습니다");
			
			}
		
		extracted();
	}
	//1. 삭제 할 아이디를 입력받는다.
	//2. ArrayList의 Member 객체 중에서 삭제할 아이디를 찾아 있으면 삭제하고 , 없으면 삭제할 아이디가 없습니다. 메시지 출력
	//3. ArrayList에 있는 모든 고객을 출력한다.
	//4. print()메서드를 호출
	//5. 번호를 선택하셔요> 메세지를 출력한 후 키보드 입력을 받게한다
	private void delete() {
		String id = console("삭제 할 아이디 : ");
		boolean isExisted = false;
		
		for(Member member:list) {
			if(id.equals(member.getId())) {
				isExisted = true;
				list.remove(member);
				break;
			}
		}
		if(!isExisted) {
			System.out.println("삭제 할 아이디가 없습니다");
		}
		
		extracted();
		
	}
	//1. 검색할 아이디를 입력한다.
	//2. ArrayList에 Member객체에 검색할 아이디를 찾아서 있으면 출력하고 없으면, 검색할 아이디가 없습니다. 메시지 출력
	//3. ArrayList에 있는 모든 고객을 출력한다.
	//4. print()메서드를 호출
	//5. 번호를 선택하셔요> 메세지를 출력한 후 키보드 입력을 받게한다
	private void search() {
		String id = console("검색 할 아이디 : ");
		boolean isExisted = false;
		for (Member member : list) {
			if(id.equals(member.getId())) {
				isExisted = true;
				System.out.println(member);
				break;
			}
			
		}
		if(!isExisted) {
			System.out.println("검색 한 결과가 없습니다");
		}
		extracted();
		
	}
	private void extracted() {
		for (Member member : list) {
			System.out.println(member);
		}
		print();
		String Index = console("번호를 선택하셔요>");
		run(Index);
	}
	public static void main(String[] args) {
		MemberMangementDemo m1 = new MemberMangementDemo();
		m1.print();
		String selectIndex = m1.console("번호를 선택하셔요>");
		//System.out.println(selectIndex);
		m1.run(selectIndex);
	}
}
