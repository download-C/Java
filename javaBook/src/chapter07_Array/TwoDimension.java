package chapter07_Array;

// 220쪽 이차원 배열 초기화하기

public class TwoDimension {

	public static void main(String[] args) {
		
		int[][] arr = { {1, 2, 3}, {4, 5, 6} };

		for(int i=0; i<arr.length; i++){
			for(int j=0; j<arr[i].length; j++) {
				System.out.print( "arr["+i+"]["+j+"]= "+arr[i][j]+" " );
			}
		System.out.println();
		}

	}

}
