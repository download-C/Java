package chapter05_ClassPart;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student4 studentLee = new Student4();
		
//		studentLee.studentName = "�̻�� ";  -> Student4 Ŭ������ studentName�� private �����̱� ������ ���������� ȣ�� �Ұ�
//											 -> private ������ ����ϰ� ���� �� �ش� ������ ����ִ� �޼ҵ带 ȣ���ؾ� ��.
		studentLee.setStudent4Name("�̻��");
		
		System.out.println(studentLee.getStudent4Name());
		
	}

}
