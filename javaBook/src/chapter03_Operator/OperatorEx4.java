package chapter03_Operator;

public class OperatorEx4 {

	public static void main(String[] args) {
		// 81�� ���� �����ڸ� ����Ͽ� �θ���� ���� ���ϱ�
		
		int fatherAge = 45;
		int motherAge = 47;
		
		char ch;
		ch = ( fatherAge > motherAge ) ? 'T':'F';  //������ F�̱� ������ ch���� ������ ���� 'F'�� ����
		
		System.out.println(ch);  		//F
		
		// 82�� 1�� ����
		
		int num = 10;
		boolean isEven;
		isEven = ( num % 2 == 0 ) ? true : false; //num%2==0�� ¦�� ���θ� �˾ƺ��� ��. num�� ¦���̸� ���� true, Ȧ���̸� ������ false
		System.out.println(isEven); 		//true

	}

}
