package chapter04_ConditionalAndLoop;

public class BreakExample {

	public static void main(String[] args) {
		// 121�� break�� ����
		
		int num = 0;
		int sum = 0;
		
		for(num = 0; ; num++) {
			sum += num;
			if(sum>=100) break;
		}
		System.out.println("1���� num���� ������ �� 100���� Ŀ���� �� num: "+num);
		System.out.println("1���� num������ �� sum: "+sum);

	}

}
