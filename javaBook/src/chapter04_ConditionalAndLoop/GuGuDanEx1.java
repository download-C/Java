package chapter04_ConditionalAndLoop;

import java.util.Scanner;

public class GuGuDanEx1 {

	public static void main(String[] args) {
		//�߰� ����. ������ �����
		
		int dan;
		int time;
		
		
		for(dan = 2; dan <= 9; dan++) {
			for(time = 1; time <= 9; time++) {
				System.out.println(dan+"X"+time+"="+dan*time);
			}
			
			System.out.println( );
		}
		
	}
}



