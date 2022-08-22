package chapter04_ConditionalAndLoop;

public class Exam3 {

	public static void main(String[] args) {
		// 122�� 1�� ����
		
		int sum = 0;
		int num;
		
		for(num=1; ; num++) {
			
			sum += num;
			
			if(sum >= 500) break;
		
		}
		
		System.out.println("num: "+ num);
		System.out.println("sum: "+ sum);

	}

}
