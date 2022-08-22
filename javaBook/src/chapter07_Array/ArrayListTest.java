package chapter07_Array;

import java.util.ArrayList;

// 224쪽 ArrayList 클래스 사용하기

public class ArrayListTest {

	public static void main(String[] args) {
//		ArrayList<String> strs = new ArrayList<String>();
//		ArrayList<Integer> number = new ArrayList<Integer>();
//		ArrayList<Boolean> tf = new ArrayList<Boolean>();
		
		// ArrayList 선언
		ArrayList<Book> library = new ArrayList<Book>(); 
		
		// add를 이용하여 값 추가 
		// -> Book 클래스의 생성자(Book (String bookName, String author) 이용
		library.add(new Book("태백산맥", "조정래"));
		library.add(new Book("데미안", "헤르만 헤세"));
		library.add(new Book("어떻게 살 것인가", "유시민"));
		library.add(new Book("토지", "박경리"));
		library.add(new Book("어린왕자", "생택쥐페리"));
	
		System.out.println("========for문을 이용한 배열 하나씩 출력=======");
		for(int i=0; i<library.size(); i++) {
			// Book 클래스를 호출하기 위해 Book 타입의 인스턴스 생성
			Book book = library.get(i);
			// Book 클래스 안에 있는 정보 출력 메서드 사용
			book.showInfo();;
		}
		System.out.println();
		
		System.out.println("==========향상된 for문 사용하여 출력==========");
		
		// Book 클래스를 호출하기 위해 Book 타입의 인스턴스 book 생성
		for(Book book: library) {
			book.showInfo();
		}
	}

}
