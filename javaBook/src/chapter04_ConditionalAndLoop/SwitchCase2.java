package chapter04_ConditionalAndLoop;

import java.util.Scanner;

public class SwitchCase2 {

	public static void main(String[] args) {
		// 104�� case�� ���ÿ� ����ϱ�
		
		System.out.println("�ϼ��� �˰� ���� ���� �Է��ϼ���");
		Scanner sc = new Scanner(System.in);
		
		String month1 = sc.next();
		int day;
		
		switch(month1) {
		case "1��","3��","5��","7��","8��","10��","12��" : day= 31; 	
			break;
		case "2��" : day= 28; 				
			break;	
		case "4��","6��","9��","11��" : day= 30;	        
			break;        
		default : day=0; 
		}
				
		System.out.println(month1+"�� "+day+"���Դϴ�");
//		int month2 = sc.nextInt();
//		int day2 = switch(month2) {
//		case 1,3,5,7,8,10,12 -> 31;
//		case 2 -> 28;
//		case 4,6,9,11 -> 20;
//		}
		
	}	

}
