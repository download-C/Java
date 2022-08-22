package chapter07_Array;

//강사님이 내준 문제 풀기~~~

import java.util.Scanner; //ctrl+shift+o

public class ArrayEx2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] array1 = new int[3];   // array1[0], array1[1], array1[2], array1.length=3
		int i;		
		int sum=0;
		// int max=0; // 배열에 입력한 수 중 가장 큰 수를 찾기 위한 변수 -> int값을 음수로 넣을 경우 최대값이 0으로 나옴
		int max=Integer.MIN_VALUE;  // Integer 라이브러리에 가장 작은 int값을 가지는 static 변수.
		int min=Integer.MAX_VALUE;  // Integer 라이브러리에 가장 큰 int값을 가지는 static 변수.
				
		// for 문을 이용해 사용자로부터 정수를 3번 입력 받아 배열변수 array1[3]에 저장 
		for(i=0; i<array1.length; i++ ) {
			System.out.println("배열에 넣고 싶은 "+(i+1)+"번째 정수를 입력하세요.");
			array1[i]=sc.nextInt();
			sum+=array1[i];
			if(max<array1[i]) max=array1[i];  // 최대값 구하는 비교문
			if(min>array1[i]) min=array1[i];  // 최소값 구하는 비교문
			}
						
		//for 문을 이용해서 저장된 배열변수의 값을 화면에 출력
		for(i=0; i<array1.length; i++) {
		System.out.println("array1["+i+"] = "+array1[i]);
		}
		
		// 입력받은 배열의 수를 더하기 (위의 배열에 입력받는 for문 안에 sum+=array1[i] 추가)
		System.out.println("array1[3]의 합계 : "+sum);
		
		// 사용자가 입력한 값 중 최대문 찾기 
		// int[] array1 = new int[] {5, 100, 2};
		
		// 비교문 if를 이용해 풀어서 적기
//		if(max<array1[0]) {
//			max=array1[0];
//		} 		
//		if(max<array1[1]) {
//			max=array1[1];
//		}		
//		if(max<array1[2]) {
//			max=array1[2];
//		}
		
		// for문을 이용해 위의 문장을 하나로 구현하기(17번 줄 for문에 if(max<array[i]) { max=array[i]; } 삽 

		System.out.println("사용자가 입력한 가장 큰 값은 "+max+"입니다.");
		System.out.println("사용자가 입력한 가장 작은 값은 "+min+"입니다.");
		
		
	}

}


