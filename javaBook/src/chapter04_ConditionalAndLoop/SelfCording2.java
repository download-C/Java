package chapter04_ConditionalAndLoop;

import java.util.Scanner;

public class SelfCording2 {

	public static void main(String[] args) {
		// 106�� �� ȥ�� �ڵ�
		
	System.out.println("���ϴ� ������ �Է��ϼ���"); 
	
		try(Scanner sc = new Scanner(System.in)) {
		
			int floor = sc.nextInt();
			String storeName;
		
			switch(floor) {
			case 1 -> storeName = "�౹";
			case 2 -> storeName = "�����ܰ�";
			case 3 -> storeName = "�Ǻΰ�";
			case 4 -> storeName = "ġ��";
			case 5 -> storeName = "�ｺ Ŭ��";
			default -> storeName = "���� ��";
			}
			
			System.out.println(floor+"���� " + storeName+"�Դϴ�");
		}
		
		catch (Exception e) {
			System.out.println("���ڸ� �Է��ϼ���");
		}
	}

}
