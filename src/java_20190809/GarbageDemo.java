package java_20190809;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;

class A extends Thread{
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("tmfpem....");
	}
}
class B implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("tmfpem2....");
	}
	
}
class Customer{
	String name;
	Customer(String name){
		this.name = name;
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}

class CustomerDao{
	public Customer[] getCustomer() {
		Customer[] cs = new Customer[10];
		Customer c1 = new Customer("lee1");
		Customer c2 = new Customer("lee2");
		Customer c3 = new Customer("lee3");
		Customer c4 = new Customer("lee4");
		Customer c5 = new Customer("lee5");
		Customer c6 = new Customer("lee6");
		Customer c7 = new Customer("lee7");
		Customer c8 = new Customer("lee8");
		Customer c9 = new Customer("lee9");
		//Customer c10 = new Customer("lee10");
		cs[0] = c1;
		cs[1] = c2;
		cs[2] = c3;
		cs[3] = c4;
		cs[4] = c5;
		cs[5] = c6;
		cs[6] = c7;
		cs[7] = c8;
		cs[8] = c9;
		cs[9] = new Customer("lee10");
		return cs;
	}
	public ArrayList<Customer> getCustomers(){
		ArrayList<Customer> list = new ArrayList<Customer>();
		list.add(new Customer("lee1"));
		list.add(new Customer("lee2"));
		list.add(new Customer("lee3"));
		list.add(new Customer("lee4"));
		list.add(new Customer("lee5"));
		list.add(new Customer("lee6"));
		list.add(new Customer("lee7"));
		list.add(new Customer("lee8"));
		list.add(new Customer("lee9"));
		list.add(new Customer("lee10"));
		return list;
	}
}


public class GarbageDemo {
	public static Calendar getInstance() {
		Calendar c = new GregorianCalendar();
		return new GregorianCalendar();
	}
	public static void main(String[] args) {
		/*A a = new A();
		a.start();
		
		B b = new B();
		Thread t = new Thread(b);
		t.start();

		System.out.println("aaaa");
		
		Calendar c = Calendar.getInstance();
		Calendar c1 = new GregorianCalendar();
		*/
	/*	
		CustomerDao c = new CustomerDao();
		Customer[] customers = c.getCustomer();
		for (Customer customer : customers) {
			System.out.println(customer.getName());
		}*/
		CustomerDao c1 = new CustomerDao();
		ArrayList<Customer> list = c1.getCustomers();
		for (Customer customer : list) {
			System.out.println(customer.getName());
		}
		
	}
		
}
