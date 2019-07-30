package java_20190730;

import java.util.ArrayList;

class product{
	int number;
	String name;
	double price;
	product(int number,String name, double price){
		this.number = number;
		this.name = name;
		this.price = price;
	}
	@Override
	public String toString() {
		return "product [number=" + number + ", name=" + name + ", price=" + price + "]";
	}
}
public class ListDemo {
	
	
	public static void main(String[] args) {
		//ArrayList : 순서가 있고 , 객체의 중복을 허용한다
		ArrayList<product> list = new ArrayList<product>();//생성
		product p1 = new product(1,"terra",2500);
		product p2 = new product(2,"신라면",1000);
		product p3 = new product(3,"서울우유",3000);
		product p4 = new product(1,"terra",2500);
		
		list.add(p1);//할당
		list.add(p2);
		list.add(p3);
		list.add(p4);
		
		/*for(int i=0;i<list.size();i++) {
			list.remove(i--);						
		}
		*/
		for(int i=0;i<list.size();i++) {
			product temp = (product)list.get(i);
			System.out.println(temp);
		}
		//enhanced for loop 출력 가능(제너릭으로 선언한 경우만 가능) 
		for (product product : list) {
			System.out.println(product);
		}
	}
}
