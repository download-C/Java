package chapter03_Operator;

public class OperatorEx1 {

	public static void main(String[] args) {
		// 74�� ��� �����ڸ� ����Ͽ� ������ ��� ���ϱ�
		
		int mathScore = 90;
		int engScore = 70;
		
		int totalScore = (mathScore+engScore);  //���� ���ϱ�
		System.out.println(totalScore);
		
		double avgScore = (totalScore/2);		//��� ���ϱ�
		System.out.println(avgScore);

		// 74�� 1�� ����
		mathScore = 90;
		engScore = 70;
		int korScore = 80;
		
		totalScore = (mathScore+engScore+korScore);  //���� ���ϱ�
		System.out.println("����: " + totalScore);				 //240
		
		avgScore = (totalScore/3);		//��� ���ϱ�
		System.out.println("���: " + avgScore);	//80
		
		
	}

}
