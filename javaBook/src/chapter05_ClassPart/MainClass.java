package chapter05_ClassPart;

public class MainClass {

	public static void main(String[] args) {
		
		Student s1, s2;      //s1, s2��� ������ ������.
		s1 = new Student(); //s1�̶�� �ν��Ͻ��� ������.
		s2 = new Student(); //s2��� �ν��Ͻ��� ������.
		
		s1.studentId=1;
		s1.studentName="�ִٿ�";
		s1.grade = 1;
		s1.address = "�λ��";
		
	
		
		System.out.println("�й�: "+s1.studentId);
		System.out.println("�̸�: "+s1.studentName);
		System.out.println("�г�: "+s1.grade);
		System.out.println("�ּ�: "+s1.address);
		System.out.println();
				
		s2.studentId = 2;
		s2.studentName = "������";
		s2.grade = 1;
		s2.address = "�λ��";
		
		System.out.println("�й�: "+s2.studentId);
		System.out.println("�̸�: "+s2.studentName);
		System.out.println("�г�: "+s2.grade);
		System.out.println("�ּ�: "+s2.address);
		System.out.println();
				
	}

}
