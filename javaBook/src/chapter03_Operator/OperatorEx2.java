package chapter03_Operator;

public class OperatorEx2 {

	public static void main(String[] args) {
		// 75�� ���� �� ���� �����ڸ� ����Ͽ� �� �����ϱ�
		
		int gameScore = 150;
		
		int lastScore1 = ++gameScore;		//gameScore�� 1�� ���� ���� �� lastScore1�� ����
		System.out.println(lastScore1);		//151
		
		int lastScore2 = --gameScore;		//gameScore�� 1�� ���� �� �� lastScore2�� ����
		System.out.println(lastScore2);		//150

		
		// 76�� 1�� ����
		gameScore = 150;
		
		lastScore1 = gameScore++;		//gameScore�� lastScore1�� ���� �� 1�� ����
		System.out.println(lastScore1);		//150
		System.out.println(gameScore);		//151
		
		lastScore2 = gameScore--;		//������ 151�̵� gameScore�� lastScore2�� ���� �� 1�� ��
		System.out.println(lastScore2);		//151
		System.out.println(gameScore);		//150
	}

}
