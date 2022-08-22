package chapter07_Array;

// 228쪽 배열 응용 프로그램 

public class StudentSubejctArrayListTest {

	public static void main(String[] args) {
		
		Student lee = new Student(1001, "Lee");
//		System.out.println(lee.getStudentID()+" "+lee.name);
		
		lee.addSubject("국어", 100);
		lee.addSubject("수학", 50);
		
		Student kim = new Student(1002, "Kim");
		kim.addSubject("국어", 70);
		kim.addSubject("수학", 85);
		kim.addSubject("영어", 100);

		
		lee.showStudentInfo();
		System.out.println("==================");
		kim.showStudentInfo();
	}

}
