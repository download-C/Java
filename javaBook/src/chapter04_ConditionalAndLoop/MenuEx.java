package chapter04_ConditionalAndLoop;

import java.util.Scanner;

public class MenuEx {

	public static void main(String[] args) {
		// do-while������ �޴� �����
		
		System.out.println("�޴� ����");
		
		Scanner sc = new Scanner(System.in);
		int menuNum;
		
//			boolean flag = true;
//			do {
//				
//			} while(flag)
		

		
		do {			
			System.out.println("1: 1�������� 10���� ����, 2: ����");

			menuNum = sc.nextInt();
				
			if(menuNum == 1 ) {
					
				int sum = 0;
				for (int num = 1; num <= 10; num++) {
					sum += num;
					
				} 
					System.out.println(sum);
									
				
			} else if(menuNum != 2) {
				System.out.println("���ڴ� 1�� 2�� ���� �� �ֽ��ϴ�");
			}
				
			
			} while(menuNum != 2); 
		
		
		System.out.println("���α׷� ����");
		

	}

}
