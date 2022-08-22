package chapter08_inheritance;

// Person 클래스를 상속받는 Student 클래스 만들기

public class Student extends Person{

	int grade;
	
	public Student() { 
		super("이길동", 1111); // 부모 클래스의 생성자 호출
		System.out.println("Student 생성자");
	}

}
