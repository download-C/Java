package chapter07_Array;

public class ArrayEx1 {

	public static void main(String[] args) {
		// 199�� �迭
		
		char[] c = new char[10];  // c[0], c[1], ... c[8], ,c[9], c.length=10
		
		for(int i=0; i<10; i++) {
			System.out.println("c["+i+"]="+c[i]);
		}
		
		System.out.println();
		boolean[] b = new boolean[3]; // b[0], b[1], b[2], b.length=3
		
		for(int i=0; i<3; i++) {
			System.out.println("b["+i+"]="+b[i]);
		}
		
		char[] ch1 = new char[3]; //ch[0], ch[1], ch[2], ch.length=3
		char[] ch1_1;
		ch1_1 = new char[3];
		
		char[] ch2 = new char[] {' ', ' ', ' '};
		char[] ch2_2;
		ch2_2 = new char[] {' ', ' ', ' '};
		
		char[] ch3 = {' ', ' ', ' '};
		

	}

}
