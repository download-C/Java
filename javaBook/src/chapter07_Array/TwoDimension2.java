package chapter07_Array;

// 221쪽 2차원 배열의 길이 출력하기

public class TwoDimension2 {

	public static void main(String[] args) {
		
		int[][] arr = new int[2][3];
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				System.out.print( "arr["+i+"]["+j+"]="+arr[i][j]+",   ");
			}
			System.out.println();
			
		}
		System.out.println();
		System.out.println("arr[2][3]의 행 길이: "+arr.length);
		System.out.println("arr[0][3]의 열 길기: "+arr[0].length);
		System.out.println("arr[1][3]의 열 길기: "+arr[1].length);
		
	}

}
