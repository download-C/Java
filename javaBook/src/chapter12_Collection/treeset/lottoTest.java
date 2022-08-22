package chapter12_Collection.treeset;

import java.util.Random;
import java.util.TreeSet;

public class lottoTest {
	public static void main(String[] args) {
		Random random = new Random();

		
		TreeSet<Integer> lotto = new TreeSet<>();
		while(lotto.size()<6) {
			int num = random.nextInt(45)+1;
			lotto.add(num);	
		}
		
		System.out.print("로또 번호: ");
		for(int lottoNum: lotto) {
			System.out.print(lottoNum+" ");
		}
		System.out.println();
		
		System.out.print("보너스 번호: ");
		int num = random.nextInt(45)+1;
		System.out.print(num);

	}
}
