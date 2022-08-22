package chapter04_ConditionalAndLoop;

import java.util.Scanner;

public class SelfCording1 {

	public static void main(String[] args) {
		// 100�� �� ȥ�� �ڵ�
		
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("������ �Է����ּ���.");
			int score = sc.nextInt();
			char grade;
			
			if(score>=90) {
				grade = 'A';							
			}
			else if(score>=80) {
				grade = 'B';
			}
			else if(score>70) {
				grade = 'C';
			}
			else if(score>60) {
				grade = 'D';
			}
			else {
				grade = 'F';
			}
			
			System.out.println(score+"���� ������ "+grade+"�Դϴ�.");
		}
		
		catch (Exception e) {
			System.out.println("�߸� �Է��ϼ̽��ϴ�. 0~100 ������ ���ڸ� �Է��ϼ���");
		}

	}

}
