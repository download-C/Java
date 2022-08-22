package chapter04_ConditionalAndLoop;

public class ForTest {

	public static void main(String[] args) {
		// �ݺ������� 1, 2, 3, 4, 5 ��� 
		
		
		
//		for(int i=1; i<=2; i++) {
//			for(int j=1; j<=3; j++)	{
//				System.out.println("i="+i+", j="+j);
//			}
//		} 
		
//		for(int i=1; i<=2; i++) {
//			System.out.print("i="+i+", j=");
//			for(int j=1; j<=3; j++)	{
//				System.out.print(j);
//				if(j>2) break;
//				System.out.print(", ");
//			} 	
//			System.out.println(); 
//		} 
		
		
		for(int i=4; i>=1; i--) {
			System.out.print(" ");
			for(int j=1; j<=7; j++)	{
				if((i*2-1)<=j){
					System.out.print("*");
				}
					System.out.print(" "); 
			} 	
			System.out.println();
		}
		
		

		
		
		
		

		
		
		
		
	}

}
