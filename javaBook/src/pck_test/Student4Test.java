package pck_test;

import chapter05_ClassPart.Student4;

public class Student4Test {

	public static void main(String[] args) {
		// 163�� private ���� �׽�Ʈ�ϱ�
		
		Student4 studentLee = new Student4();  // -> Student4�� chapter5_ClassPart ��Ű���� �ֱ� ������ ��Ű���� �޶����� ȣ���� ���� ����.
											   // 	 ��Ű���� �ٸ� ���� import ������� ��.
		
		
//		studentLee.studentName = "�̻�� ";  -> Student4 Ŭ������ studentName�� private �����̱� ������ ���������� ȣ�� �Ұ�
//											 -> private ������ ����ϰ� ���� �� �ش� ������ ����ִ� �޼ҵ带 ȣ���ؾ� ��.
		studentLee.setStudent4Name("�̻��");
		
		
		System.out.println(studentLee.getStudent4Name());		// public
//		System.out.println(studentLee.adress);  				//private
//		System.out.println(studentLee.grade);   				//default
//		System.out.println(studentLee.studentID);				//protected

	}

}
