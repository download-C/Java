package chapter07_Array;

public class FunctionTest {

	public static void main(String[] args) {
		// 137�� �޼��� �����ϰ� ȣ���ϱ�
				
		int num1 = 20;
		int num2 = 10;
		
		FunctionTest ft = new FunctionTest(); //��ü ���� �Ϸ�
		
		int result1 = ft.add(num1, num2);
		System.out.println(num1+"+"+num2+"="+result1+"�Դϴ�.");
		
		int result2 = ft.sub(num1, num2);
		System.out.println(num1+"-"+num2+"="+result2+"�Դϴ�.");
		
		int result3 = ft.mutiple(num1, num2);
		System.out.println(num1+"*"+num2+"="+result3+"�Դϴ�.");
		
		int result4 = ft.devision(num1, num2);
		System.out.println(num1+"/"+num2+"="+result4+"�Դϴ�.");

	}
	

	int add(int n1, int n2) {
		int result = n1 + n2;
		return result;
	}	
	
	// 138�� �� ȥ�� �ڵ� : ��Ģ ���� �Լ� �ϼ��ϱ�
	
	int sub(int n1, int n2 ) {
		int result = n1 - n2;
		return result;
	}
	
	int mutiple(int n1, int n2 ) {
		int result = n1 * n2;
		return result;
	}
	
	int devision(int n1, int n2 ) {
		int result = n1 / n2;
		return result;
	}
}
