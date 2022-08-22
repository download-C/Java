package chapter04_ConditionalAndLoop;

public class WhileExample {

	public static void main(String[] args) {
		// 109�� while�� Ȱ���Ͽ� 1���� 10���� ���ϱ�
		
		int i=1;
		int sum=0;
		
		while(i<=10) {
			sum=sum+i;
			i++;
			System.out.println(sum);
		}
		System.out.println("1���� 10������ ���� " + sum + "�Դϴ�");
		
		// �߰� ����: 200~300���� ���ϱ�
		
		int sum2=0;
		int j = 200;
		while(j <= 300) {
			sum2 += j;
			j++;			
		}
		
		System.out.println("200���� 300������ ���� " + sum2 + "�Դϴ�.");
		
		//while���� ������ �ݺ��Ǵ� ���(������Ʈ ���� � ���)
		//boolean flag = true;
		//while(flag) {};
		
		//boolean stop = false;
		//while(!stop) {};

	}

}
