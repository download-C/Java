package chapter12_Collection.treeset;

import java.util.TreeSet;

public class TreeSetTest {

	public static void main(String[] args) {
		TreeSet<String> treeset = new TreeSet<>();
		treeset.add("최다운");
		treeset.add("김다은");
		treeset.add("정인혜");
		
		// 자동으로 String에 들어온 언어에 따라 정렬
		System.out.println(treeset);
	}

}
