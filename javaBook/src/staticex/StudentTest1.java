package staticex;

// 183�� static ���� �׽�Ʈ�ϱ�

public class StudentTest1 {

	public static void main(String[] args) {
		Student studentLee = new Student();
		studentLee.setStudentName("������");
		System.out.println(studentLee.serialNum); 	// serialNum ������ �ʱⰪ 1000 ���
		studentLee.serialNum++; 					// static ������ �� ����
		
		Student studentSon = new Student();
		studentSon.setStudentName("�ռ���");		// studentSon.serialNum�� ��ȭ�� ����.
		System.out.println(studentSon.serialNum);	// studentLee.serialNum++�� ���� 1 �����Ǿ���, �� ������ static�����̱� ������ studentSon.serialNum�� ���� ���� ������. 
		System.out.println(studentLee.serialNum);	// 

	}

}
