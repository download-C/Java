package chapter04_ConditionalAndLoop;

public class DoWhileExample {

	public static void main(String[] args) {
		// 112�� do-while�� ����
		
		int num = 1;
		int sum = 0;
		
		do {
			sum += num;
			num++;
		} while(num <= 10);
		
		System.out.println(sum);

	}

}


