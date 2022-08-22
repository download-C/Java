package chapter10_bookshelf;

import java.util.ArrayList;

// 340쪽 bookShelf를 만들기 위한 더 상위 개념 Shelf 만들기

public class Shelf {
	// 자료를 순서대로 입력하기 위한 ArrayList 선언
	protected ArrayList<String> shelf;
	
	// Shelf형 객체를 생성하면 자동으로 배열도 생성되도록 디폴트 생성자 선언
	public Shelf() {
		shelf = new ArrayList<String>();
	}
	
	// 배열에 저장된 자료를 반환하는 메서드
	public ArrayList<String> getShelf() {
		return shelf;
	}
	
	// 배열에 저장된 개수를 반환하는 메서드
	public int getCount() {
		return shelf.size();
	}
	
}
