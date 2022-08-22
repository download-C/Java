package chapter12_Collection;

// 정렬 기준을 정의한 MyComparator 클래스를 이용하여 ArrayList 정렬하기

import java.util.ArrayList;
import java.util.Collections;

public class Test {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		list.add(100);
		list.add(4);
		list.add(200);
		list.add(10);
		
		System.out.println(list);
		System.out.println();
		
		// 특정 배열을 정렬할 때 정렬 기준을 가져오는 메서드 Collections.sort(배열, 정렬기준 클래스 객체 생성)
		System.out.println("MyComparator 기준(내림차순)으로 정렬하기");
		Collections.sort(list, new MyComparator());
		System.out.println(list);
	}

}
