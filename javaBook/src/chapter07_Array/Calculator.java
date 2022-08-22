package chapter07_Array;

import java.util.Scanner;

public class Calculator {
		
	// ���� �� ���� ���ϴ� ���
	int	add(int num1, int num2) {
		int result = num1 + num2;
		return result;
	}	
	
	// ���� �� ���� ���� ���
	int sub(int num1, int num2) {
		int result = num1 - num2;
		return result;
	}
	
	// ���� �� ���� ���ϴ� ���
	int multiple(int num1, int num2) {
		int result = num1*num2;
		return result;
	}
	
	// ���� �� ���� ������ ���
	int division(int num1, int num2) {
		int result = num1 / num2;
		return result;
		
	}
	
	static void calPrint(String result) {
		System.out.println("������ ����� �Ʒ��� �����ϴ�");
		return;
	}

	public static void main(String[] args) {
		
/*		System.out.println("����ϰ��� �ϴ� ����1�� �Է��ϼ���.");
		Scanner sc1 = new Scanner(System.in);
		
		System.out.println("����ϰ��� �ϴ� ����1�� �Է��ϼ���.");
		Scanner sc2 = new Scanner(System.in);*/
		
		int num1 = 20;
		int num2 = 10;
		Calculator c = new Calculator();
		
		System.out.println("num1="+num1+", num2="+num2);


		int result1 = c.add(num1, num2);
		System.out.println(num1+"+"+num2+"="+result1);
		
		int result2 = c.sub(num1, num2);
		System.out.println(num1+"-"+num2+"="+result2);
		
		int result3 = c.multiple(num1, num2);
		System.out.println(num1+"+"+num2+"="+result3);

		int result4 = c.division(num1, num2);
		System.out.println(num1+"+"+num2+"="+result4);		

	}

}
