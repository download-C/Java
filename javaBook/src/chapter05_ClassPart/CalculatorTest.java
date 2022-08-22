package chapter05_ClassPart;

public class CalculatorTest {

	public static void main(String[] args) {
		// �� ������ ����ϴ� ����
		
		Calculator cal1 = new Calculator();
		cal1.setNum(10, 5);
		cal1.add();
		cal1.sub();
		cal1.mul();
		cal1.div();

	}

}
