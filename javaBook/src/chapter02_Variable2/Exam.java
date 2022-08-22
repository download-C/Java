package chapter02_Variable2;

public class Exam {

	public static void main(String[] args) {
		// 69�� �������� 4��
		
		int num1 = 10;
		double num2 = 2.0;
		
		double result1 = num1+num2;
		double result2 = num1-num2;
		double result3 = num1*num2;
		double result4 = num1/num2;
		double result5 = num1%num2;
		
		System.out.println((num1+num2)+" / "+(int)(num1+num2)+" / "+(int)result1);

		System.out.println((num1-num2)+" / "+(int)(num1-num2)+" / "+(int)result2);
		
		System.out.println((num1*num2)+" / "+(int)(num1*num2)+" / "+(int)result3);
		
		System.out.println((num1/num2)+" / "+(int)(num1/num2)+" / "+(int)result4);

		System.out.println((num1%num2)+" / "+(int)(num1%num2)+" / "+(int)result5);
		
		// �������� 5��
		
		char ch1 = '한';
		char ch2 = 44544;
		
		System.out.println((int)ch1);
		System.out.println((char)ch2);
	}

}
