package chapter07_Array;

//221쪽 나 혼자 코딩

public class TwoDimensionSelf {

	public static void main(String[] args) {
		char[][] alphabet = { {'a','b'}, {'c','d'}, {'e','f'}, {'g','h'}, 
							  {'i','j'}, {'k','l'}, {'m','n'}, {'o','p'}, 
							  {'q','r'}, {'s','t'}, {'u','v'}, {'w','x'}, 
							  {'y','z'}                                   };
		
		

		for(int i=0; i<alphabet.length; i++) {
			for(int j=0; j<alphabet[i].length; j++) {
				System.out.print(alphabet[i][j]);
			}
			System.out.println();
		
		}
		System.out.println();
		
			
		char a = 'a';
		char[][] alphabet2 = new char[13][2]; 
		// alphabet2[0][0] ~ alphabet2[12][1]  (변수 26개)
		// alphabet2.length, alphabet2[0].length~alphabet2[12].length (length 14개)
		for(int i=0; i<alphabet2.length; i++) {
			
			for(int j=0; j<alphabet2[i].length; j++, a++) {
				alphabet2[i][j]= a;
				
				System.out.print(alphabet2[i][j]);
			}
			System.out.println();
		}
		
		System.out.println();
		
		int b = 97;
		int[][] alphabet3 = new int[13][2];
		
		for(int i=0; i<alphabet3.length; i++) {
			
			for(int j=0; j<alphabet3[i].length; j++, b++) {
				alphabet3[i][j]= b;
				
				System.out.print((char)alphabet3[i][j]);
			}
			System.out.println();
		}

	}

}
