package chapter12_Collection;

import java.util.LinkedList;

public class LinkedListTest {
	public static void main(String[] args) {
		// String 타입의 LinkedList 생성 
		LinkedList<String> myList = new LinkedList<>();
		
		// 리스트에 값 차례로 추가
		myList.add("A");
		myList.add("B");
		myList.add("C");
		
		// 리스트의 모든 값 출력
		System.out.println(myList);
		
		//리스트의 1번 인덱스에 D 추가 
		myList.add(1, "D");
		System.out.println(myList);
		
		// 연결 리스트의 맨 앞에 O 추가
		myList.addFirst("0");
		System.out.println(myList);
		
		// 연결 리스트의 맨 뒤 요소의 값 출력 후 삭제
		System.out.println(myList.removeLast());
		System.out.println(myList);
	}
}
