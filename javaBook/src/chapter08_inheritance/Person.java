package chapter08_inheritance;

// 상속할 상위 클래스 Person 만들기(생성자, getter/setter)

public class Person {
	
	String name;
	long serialNum;
	
	public Person() {
		System.out.println("Person 생성자 1");
	}

	public Person(String name, long serialNum) {
		super();
		this.name = name;
		this.serialNum = serialNum;
		System.out.println("Person 생성자 2");
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public long getSerialNum() {
		return serialNum;
	}
	public void setSerialNum(long serialNum) {
		this.serialNum = serialNum;
	}
	
	public void showInfo() {
		System.out.println("이름:" +name+", 번호:"+serialNum);
	}

}
