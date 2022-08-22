package chapter01_Variable1;

public class DoubleEx2 {

	public static void main(String[] args) {
		// 58�� �ε� �Ҽ��� ����� ����
		
		double dnum = 1;
		for(int i=0; i<=10000; i++) {
			dnum=dnum+0.1;
		}
		System.out.println(dnum);   //�Ǽ��� ������ ������ ��Ÿ���µ� ������ 0�� �� ���� ������(0�̸� ��� ���ڰ� 1�� ��) �ణ�� ������ �߻���
		
		double d1 = 2.0;
		double d2 = 1.1;
		System.out.println(d1-d2);  //

	}

}
