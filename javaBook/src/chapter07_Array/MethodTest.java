package chapter07_Array;

public class MethodTest {
	// 135~136�� �Լ� �����ϱ�
	
	static int add(int num1, int num2) {		
		int result = num1 + num2;
		return result;		
	}
	
	static int getTenTotal() {
		int i;
		int total = 0;
		
		for (i=1; i<=10; i++) {
			total += i;
			
		}
		return total;
	}
	
	void printGreeting(String name) {
		System.out.println(name+"�� �ȳ��ϼ���.");
		return;
	}
	
	void divide(int num1, int num2) {
		if(num2==0) {
			System.out.println("������ ���� 0�� �� �� �����ϴ�");
			return;
		}
		else {
			int result = num1/num2;
			System.out.println(num1+"/"+num2+"="+result+"�Դϴ�");
		}
	
	}
	
	public static void main(String[] args) {
		
		

	
	}


}
