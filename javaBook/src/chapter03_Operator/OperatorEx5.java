package chapter03_Operator;

public class OperatorEx5 {

	public static void main(String[] args) {
		// 85�� ��Ʈ �̵� �����ڸ� ����Ͽ� �����ϱ�
		
		int num = 0B00000101; 
		System.out.println(num<<2); //�������� 2��Ʈ �̵��Ͽ� 00010100 (20)
		System.out.println(num>>2); //���������� 2��Ʈ �̵��Ͽ� 00000001 (1)
		System.out.println(num>>>2);//���������� 2��Ʈ �̵������� ��ȣ���� ������ 0�� �� 00000000 (1)
		
		System.out.println(num); //��Ʈ�� �̵����� �ʾƼ� �״�� (5)
		
		num = num << 2;  //�������� 2��Ʈ �̵��Ͽ� 00010100 
		System.out.println(num); //������ num�� ���Ե� 00010100�� ��� (20)
		
	}

}
