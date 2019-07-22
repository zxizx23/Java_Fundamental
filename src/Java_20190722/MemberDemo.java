package Java_20190722;

public class MemberDemo {
	public static void main(String[] args) {
		Member m = new Member();
		m.setName("이의진");
		m.setZipcode("660");
		m.setAdd1("경기도");
		m.setAdd2("오산시");
		m.setAge(27);
		m.setSsn1("1111");
		m.setSsn2("2222");
		m.setRegdate("2019-07-22");
		
		System.out.println(m.getName());
		System.out.println(m.getZipcode());
		System.out.println(m.getAge());
		System.out.println(m.getAdd1());
		System.out.println(m.getAdd2());
		System.out.println(m.getSsn1());
		System.out.println(m.getSsn2());
		System.out.println(m.getRegdate());
	}
}
