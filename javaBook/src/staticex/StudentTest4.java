package staticex;

// 188 �� �й� ����ϱ� 

public class StudentTest4 {

	public static void main(String[] args) {
		Student2 studentLee = new Student2();
		studentLee.setStudentName("������");
		System.out.println(Student2.getSerialNum());
		System.out.println(studentLee.getStudentName()+" �й� : "+studentLee.studentID);
		
		Student2 studentSon = new Student2();
		studentSon.setStudentName("�ռ���");
		System.out.println(Student2.getSerialNum());
		System.out.println(studentSon.getStudentName()+" �й� : "+studentSon.studentID);
	
		

	}

}
