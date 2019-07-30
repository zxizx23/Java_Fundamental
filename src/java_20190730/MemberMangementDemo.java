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
		System.out.print(msg);
		Scanner sc = new Scanner(System.in);
		return sc.next();
	}

	private void run(String selectIndex) {
		// TODO Auto-generated method stub
		if(selectIndex.equals("1")) {
			insert();
		}else if(selectIndex.equals("2")) {
			System.out.println("update....");
		}else if(selectIndex.equals("3")) {
			System.out.println("delete....");
		}else if(selectIndex.equals("4")) {
			System.out.println("search....");
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
