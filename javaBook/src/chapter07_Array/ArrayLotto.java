package chapter07_Array;

import java.util.Arrays;
import java.util.Random;

// 로또 번호 



public class ArrayLotto {

	public static void main(String[] args) {
		
		 /*
		   # 로또복권 만들기
		     0. 배열의 크기와 범위 정하기
			 1. 1부터 ~ 45번까지 임의의 숫자 추출하기
			 2. 1부터 ~ 45번까지 넣을 수 있는 공간 만들기
			 3. 조건문 for문을 돌려서 6가지 숫자 출력 해보기
			 4. 중복된 숫자 확인하기
			 5. 중복이 되지 않는 6자리 숫자를 작은 수부터 나열하기
		 */
		
		// 배열의 크기 정의 
		int[] lotto = new int[6];  // lotto[0] ~ lotto[6], lotto.length=7
		
		// 랜덤 함수 정의
		Random rd = new Random(); 
		
		

		
		// for문을 돌려서 1~45 숫자 6개 추출
		for(int i=0; i<lotto.length; i++) {
			
			//로또 숫자의 범위 정의
			int num =  rd.nextInt(45)+1;
			boolean isContain = false;
			
			for(int j=0; j<i; j++) {
				if(num == lotto[j]) {
					isContain = true;
					break;
				}
			}  
			
			if(isContain) {
				i--;
				continue;
			}
			
			lotto[i] = num;
									
		}
		
		// 5. 중복이 되지 않는 6자리 숫자를 작은 수부터 나열하기
		Arrays.sort(lotto);
		
		System.out.println("로또 번호:" +Arrays.toString(lotto)+ ", 보너스: ");
	}

}
