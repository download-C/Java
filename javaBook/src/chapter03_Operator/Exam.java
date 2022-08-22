package chapter03_Operator;

public class Exam {

	public static void main(String[] args) {
		// 88�� ��������
		
		//Q1
		
		int myAge = 23;
		int teacherAge = 38;
		
		boolean value = (myAge >25); //23>25 -> F
		System.out.println(value); //false
		
		System.out.println(myAge <= 25); //23<=25 -> true
		System.out.println(myAge == teacherAge); //23==38 -> false
				
		char ch;
		ch = (myAge > teacherAge) ? 'T':'F'; //23>38 -> false -> ������ 'F'
		System.out.println(ch); //F
		
		//Q2
		int num;
		num = -5 + 3 * 10 / 2;  //-5 + ((3 * 10) / 2) = -5 + (30 / 2) = -5 + 15 = 10;
		System.out.println(num); //10
		
		//Q3
		num = 10;
		System.out.println(num);    //10 
		System.out.println(num++);  //10 (num���� 10 ��� �� num�� 1�� ���� num�� 11�� ��)
		System.out.println(num);    //11 (���� num�� 11�� �Ǿ� �״�� ���)
		System.out.println(--num);  //10 (num�� 11���� 1�� �� 10�� ��� �� num�� 10 ����)
		
		//Q4
		int num1 = 10;
		int num2 = 20;
		boolean result;
		
		result = ((num1>10) && (num2>10)); // �������� F, �������� T -> F&&T
		System.out.println(result);  //false
		result = ((num1>10) || (num2 > 10));  //�������� F, �������� T -> F||T
		System.out.println(result); //true
		System.out.println(!result); //���� result�� true�̹Ƿ� !true = false
		
		//Q5
		num1 = 2;
		num2 = 10;
		System.out.println(num1 & num2); //2
		System.out.println(num1 | num2); //10
		System.out.println(num1 ^ num2); //8
		System.out.println(~num1); //-3
		
		//Q6
		num = 8;
		
		System.out.println(num += 10); //18 (num=num+10 -> num=8+10 -> num=18)
		System.out.println(num -= 10); //8  (num=num-10 -> num=18-10 -> num=8)
		System.out.println(num >>= 2); //2  (num=num>>2 -> num=00001000>>2 -> num=00000010 -> num=2)
		
		//Q7
		num = 10;
		num2 = 20;
		int result1 = (num >= 10) ? (num2+10) : (num2-10);   // (10 >=10) ? (20+10):(20-10) -> true ? 30:10
		System.out.println(result1); //30
		
	}

}
