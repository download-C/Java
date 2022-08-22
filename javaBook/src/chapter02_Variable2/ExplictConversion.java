package chapter02_Variable2;

public class ExplictConversion {

	public static void main(String[] args) {
		// ����� �� ��ȯ
		
		double dNum1 = 1.2;
		float fNum2 = 0.9F; //double�� �ڵ� �� ��ȯ�� ���� Float�� ���� �� ��ȯ
		
		int iNum3 = (int)dNum1 + (int)fNum2; //double�� float�� int�� ���� ���� �� ��ȯ�Ͽ� dNum1=1, fNum2=0�� �� �� ����
		int iNum4 = (int)(dNum1 + fNum2);  //double���� dNum1=1.2�� float���� fNum2=0.9�� ���� ���Ͽ� 2.1�� �� �� int�� ��ȯ�Ͽ� 2�� �� 
		System.out.println(iNum3);
		System.out.println(iNum4);

	}

}
