package staticex;

// 183쪽 static 변수 테스트하기

public class StudentTest1 {

	public static void main(String[] args) {
		Student studentLee = new Student();
		studentLee.setStudentName("이지원");
		System.out.println(studentLee.serialNum); 	// serialNum 변수의 초기값 1000 출력
		studentLee.serialNum++; 					// static 변수의 값 증가
		
		Student studentSon = new Student();
		studentSon.setStudentName("손수경");		// studentSon.serialNum은 변화값 없음.
		System.out.println(studentSon.serialNum);	// studentLee.serialNum++로 값이 1 증가되었고, 이 변수는 static변수이기 때문에 studentSon.serialNum도 같은 값을 공유함. 
		System.out.println(studentLee.serialNum);	// 

	}

}
