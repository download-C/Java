package chapter07_Array;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

// ArrayList로 로또 만들기

public class ArrayListLotto {

	public static void main(String[] args) {
		
		ArrayList<Integer> lotto = new ArrayList<Integer>();
		Random rd = new Random();
		
		while(lotto.size()<7) {
			
			int num = rd.nextInt(45)+1;
			
			if(!lotto.contains( num ) ) {
				lotto.add(num);
			}
		}
		// 일반 for문으로 로또 번호 배열 순서대로 출력하기
		for(int i=0; i<lotto.size(); i++) {
			System.out.println("lotto("+i+")="+lotto.get(i)+" ");
			System.out.println();
		}
		// lotto 번호 정렬하기
		Collections.sort(lotto);
		
		//향상된 for문으로 출력하기
		System.out.println("로또 번호");
		for(int print: lotto) {
			System.out.println(print);
		}
		System.out.println();		
	}

}
