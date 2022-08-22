package chapter12_Collection.hashset;

import java.util.HashSet;

public class HashSetTest {

	public static void main(String[] args) {
		HashSet<String> hashSet = new HashSet<>();

		hashSet.add("최다운");
		hashSet.add("김명진");
		hashSet.add("김다은");
		hashSet.add("정인혜");
		hashSet.add("최다운");
		
//		hashSet.add(new String("최다운"));
//		hashSet.add(new String("김명진"));
//		hashSet.add(new String("김다은"));
//		hashSet.add(new String("정인혜"));
//		hashSet.add(new String("최다운"));
		
		System.out.println(hashSet);
	}

}
