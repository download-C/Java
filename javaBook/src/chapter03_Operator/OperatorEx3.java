package chapter03_Operator;

public class OperatorEx3 {

	public static void main(String[] args) {
		// 78�� �ܶ� ȸ�� �� �ǽ��ϱ�
		
		int num1 = 10;
		int i = 2;
		
		boolean value = ((num1 = num1 + 10) < 10) && ((i = i + 2) < 10); //���� ��(num1<10)�� F�� �Ǹ鼭 ������ ���� ��� X
		System.out.println(value);		//false
		System.out.println(num1);		//20
		System.out.println(i);			//2
		
		value = ((num1 = num1 + 10) > 10) || ((i = i + 2) < 10);		//���� ��(num1>10)�� T�� �Ǹ鼭 ������ ���� ��� X
		System.out.println(value);		//true
		System.out.println(num1);		//30
		System.out.println(i);			//2
		
		int num = 5;
		i = 10;
		
		
		//79�� 1�� ����
		boolean value2 = ((num = num * 10)>45) || ((i = i - 5) < 10); //���� ��(num>45)�� T�� �Ǹ鼭 ������ ���� ��� X
		System.out.println(value2);		//true
		System.out.println(num);		//50
		System.out.println(i);			//10

	}

}
