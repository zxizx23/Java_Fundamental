package Java_20190722;

public class MemberPayDemo {
	public static void main(String[] args) {
	MemberPay m = new MemberPay();
	m.setSeq(1);
	m.setGroup(1);
	m.setName("MBE");
	m.setPrice(580);
	m.setStatus("1");
	m.setSdate("2019-07-22");
	m.setEdate("2020-01-22");
	m.setRegdate("2019-07-22");
	m.setValid(true);

	System.out.println(m.getSeq());
	System.out.println(m.getGroup());
	System.out.println(m.getName());
	System.out.println(m.getPrice());
	System.out.println(m.getStatus());
	System.out.println(m.getSdate());
	System.out.println(m.getEdate());
	System.out.println(m.getRegdate());
	System.out.println(m.isValid());
	
	}
	
}
