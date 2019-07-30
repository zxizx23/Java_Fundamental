package java_20190730;

import java.util.Iterator;
import java.util.TreeSet;

//해쉬를 이용한 로또 만들기
public class SetDemo {
	public static void main(String[] args) {
		//HashSet은 데이터(객체)의 중복을 허용하지 않고, 순서가 없음
		//HashSet set = new HashSet();//선언
		//TreeSet은 데이터(객체)의 중복을 허용하지 않고, 오름차순 정렬한다.
		TreeSet<Integer> set = new TreeSet<Integer>();
		while(true) {
			int random = (int)(Math.random()*45)+1;
			set.add(random);//할당, auto-Boxing(primitive data type => Wrapper class)
			//HashSet 크기 : size()
			if(set.size() == 6) break;
		}
		//HashSet이 출력은 Iterator 변경을 해서 출력해야 한다
		Iterator<Integer> i = set.iterator();
		//hasNext() HashSet에 출력할 객체가 존재하는지 판단하는 메서드
		
		while(i.hasNext()) {
			//auto-unBoxing (wrapper => primitive data type
			int temp = i.next();//next() 해당객체를 가져온다
			System.out.println(temp + "\t");
		}
	}
}

