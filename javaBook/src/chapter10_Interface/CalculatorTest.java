package chapter10_Interface;

// 317쪽 CompleteCalc 클래스 구현하기

public class CalculatorTest {

	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 5;
		
		CompleteCalc c = new CompleteCalc();
		System.out.println(num1+"+"+num2+" = "+c.add(num1, num2));
		System.out.println(num1+"-"+num2+" = "+c.substract(num1, num2));
		System.out.println(num1+"*"+num2+" = "+c.times(num1, num2));
		System.out.println(num1+"/"+num2+" = "+c.divide(num1, num2));
		System.out.println(num1+"^2"+" = "+c.square(num1));
		c.showInfo();
		c.dercription();
		
		int[] arr = {1, 2, 3, 4, 5};
		System.out.println(Calc.total(arr));
	}

}
