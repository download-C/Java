package chapter08_inheritance;

// Person 클래스를 상속받는 Employee 클래스 만들기

public class Employee extends Person{
	String part;
	
	Employee() {
		
		System.out.println("Employee 생성자");
	}
	
}
