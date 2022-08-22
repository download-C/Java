package chapter05_ClassPart;

public class Student3Test {

	public static void main(String[] args) {
		// 159, 160, 161�ʿ��� ���� Ŭ������ �̿��� �׽�Ʈ
		
		Student3 s3 = new Student3();
		s3.studentID = 123456;   									// int���̱� ������ �ٷ� ���� �Է�
		s3.studentName = "ȫ�浿";									// String���̱� ������ ���ڿ� �Է�
			System.out.println("�й� : "+s3.studentID);
			System.out.println("�̸� : "+s3.studentName);
			System.out.println();
		
		s3.korean = new Subject();									// Subject���̰� Subject�� ���� ���� Ŭ�����̱� ������ new Subject() �Է� 
		s3.math = new Subject();		  							// Subject���̰� Subject�� ���� Ŭ�����̱� ������ new Subject() �Է�
			System.out.println("����� : "+s3.korean); 			 	// -> subject()�� ��ü�̱� ������ �ּҰ��� ��µ�.
			System.out.println("����� : "+s3.math);
			System.out.println();
		
		Subject kSub = new Subject();
		kSub.subjectName = "����";
		Subject mSub = new Subject();
		mSub.subjectName = "����";		
			System.out.println("����� : "+s3.korean.subjectName);	// -> �Է��س��� ���� ��� null�� ��µ�.
			System.out.println("����� : "+s3.math.subjectName);
			System.out.println();
			
			System.out.println("����� : "+kSub.subjectName);		// -> ���� ����ִ� �ν��Ͻ��� ���� ���
			System.out.println("����� : "+mSub.subjectName);
	}

}
