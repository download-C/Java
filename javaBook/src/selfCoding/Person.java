package selfCoding;

public class Person {
	String name;
	String cafeName;
	Cafe cf;
	
	public Person() {}
	
	public Person(String name) {
		this.name = name;
	}
	
	public void goCafe(Cafe cf) {
		this.cf = cf;
//		cf = new Cafe();
//		cf.setCafeName(cafeName);
	}
	   
	public void showInfo() {
		System.out.println(name+"���� "+cf.cafeName+"�� ����.");
	}

}
