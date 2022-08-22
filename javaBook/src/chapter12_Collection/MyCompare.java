package chapter12_Collection;

import java.util.Comparator;

public class MyCompare implements Comparator<String>{

	@Override
	public int compare(String s1, String s2) {
		// String 타입의 값이 들어올 경우 내림차순으로 정렬
		return (s1.compareTo(s2)) * -1;
	}

}
