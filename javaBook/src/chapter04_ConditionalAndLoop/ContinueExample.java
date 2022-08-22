package chapter04_ConditionalAndLoop;

public class ContinueExample {

	public static void main(String[] args) {
		// 119�� continue�� ����
		
		int total = 0;
		int num;
		
		for(num = 1; num <=100; num++) {
			
			if(num%2==0) continue;  //num�� ¦���� �� �ٽ� for������ ���ư� num�� 1�� ������Ŵ
			
			total += num;
			
		}
		
		System.out.println("1���� 100������ Ȧ���� ���� "+total+"�Դϴ�.");
		
		
		// 120�� 1�� ����. 1���� 100���� �� �߿��� 3�� ����� ���
		
		int num2 = 0;
		
		for(num2 = 1; num2 <= 100; num2++) {
			
			if(num2%3!=0) continue;
			System.out.println(num2);		
		}

	}
	
}
		


