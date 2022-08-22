package chapter04_ConditionalAndLoop;

import java.util.Scanner;

public class SwitchCase1 {

	public static void main(String[] args) {
		// 102�� switch-case�� ����

		System.out.println("����� �Է��ϼ���");
		Scanner sc = new Scanner(System.in);
		int ranking = sc.nextInt();
		char medalColor;
		
		switch(ranking) {
		case 1 -> medalColor = 'G';
		case 2 -> medalColor = 'S';
		case 3 -> medalColor = 'B';
		default -> medalColor = 'A';
		}
		
		System.out.println(ranking+"���� �޴� ������ "+medalColor+"�Դϴ�");
	}

}
