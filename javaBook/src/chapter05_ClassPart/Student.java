package chapter05_ClassPart;

public class Student {
	// 146�� Student��� Ŭ������ ������ �ִ� ��� ����
	
	int studentId;  
	String studentName;
	int grade;
	String address;	

	
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String name) {
		this.studentName = name;
	}

	public static void main(String[] args) {
		
		Student s = new Student();
		s.studentName = "�ȿ���";					// ��� ������ �ٷ� ���� �Է�
		s.setStudentName("�ȿ���");					// set �޼��带 ���ؼ� ���� �Է�
		

		
	// 148��
		
		System.out.println(s.studentName);			// ��� ������ �ٷ� ���
		System.out.println(s.getStudentName());		// set �޼����� ���� return �޴� get �޼��带 ���ؼ� ���
		System.out.println();
		

	}
}




	
	
