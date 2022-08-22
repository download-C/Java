package chapter02_Variable2;

public class Constant {

	public static void main(String[] args) {
		// ��� ����ϱ�
		
		final int MAX_MUM = 100;  //����� ���ÿ� �ʱ�ȭ
		final int MIN_MUM;
		
		MIN_MUM = 0; // ����ϱ� ���� �ʱ�ȭ���� ������ ���� �߻�
		
		System.out.println(MAX_MUM);
		System.out.println(MIN_MUM);
		
		//MAX_MUM = 1000; ������� �缱���� ��� ���� �߻�
		
		final int MY_AGE = 22;
		System.out.println(MY_AGE);

	}

}
