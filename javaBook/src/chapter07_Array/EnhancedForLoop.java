package chapter07_Array;

// 218쪽 향상된 for문 사용하기

public class EnhancedForLoop {

	public static void main(String[] args) {
	
		String[] strArray = {"Java", "Android", "C", "JavaScript", "Python"};
		
		for(String comLang: strArray) {
			System.out.println(comLang);
		}
		
		System.out.println();
	
	
// 1분 복습
	
		int[] numArray = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		System.out.print("int numArray[10]: ");
		for(int num: numArray) {
			System.out.print(num+", ");
		}
		
	}

}
