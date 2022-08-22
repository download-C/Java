package chapter08_inheritance;

// 상위 클래스(Person), 하위 클래스(Student, Employee)

public class ExtendsEx1 {

	public static void main(String[] args) {
		
		Student s1 = new Student(); // Person 생성자 1, Student 생성자
		s1.name = "홍길동" ;
		s1.serialNum = 11111111;
		s1.grade = 95; 
		
		
		Employee e1 = new Employee(); // Person 생성자 1, Employee 생성자
		e1.name= "고길동";
		e1.serialNum = 22222222;
		e1.part = "개발";
		

	}

}