package Java_20190722;

public class Member {
	private String name;
	private String zipcode;
	private String add1;
	private String add2;
	private String ssn1;
	private String ssn2;
	private int age;
	private String regdate;
	
	//name => setter, getter 메서드
	
	//name에 대한 getter method => instance name 정보를 가져 올 수 있는 메서드
	public String getName() {
		return this.name;
	}
	//name에 대한 setter method => instance name 정보를 변경 할 수 있는 메서드
	public void setName(String name) {
		this.name = name;
	}
	public String getZipcode() {
		return zipcode;
	}
	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}
	public String getAdd1() {
		return add1;
	}
	public void setAdd1(String add1) {
		this.add1 = add1;
	}
	public String getAdd2() {
		return add2;
	}
	public void setAdd2(String add2) {
		this.add2 =add2;
	}
	public String getSsn1() {
		return ssn1;
	}
	public void setSsn1(String ssn1) {
		this.ssn1 = ssn1;
	}
	public String getSsn2() {
		return ssn2;
	}
	public void setSsn2(String ssn2) {
		this.ssn2 = ssn2;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getRegdate() {
		return regdate;
	}
	public void setRegdate(String regdate) {
		this.regdate = regdate;
	}
}
