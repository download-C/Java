package chapter12_Collection;

import java.util.Set;
import java.util.TreeSet;

public class MyComparatorTest {

	public static void main(String[] args) {
		// String 타입을 매개변수로 가지는 Set 라이브러리를 이용함. 
		// 객체 생성시 생성자의 매개변수로 비교 기준을 정의한 MyCompare 클래스를 객체 생성하여 삽입.
		Set<String> set = new TreeSet<String>(new MyCompare());
		set.add("aaa");
		set.add("bbb");
		set.add("ccc");
		
		System.out.println(set);
	}

}
