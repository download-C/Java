package chapter09_abstractex;

// 285쪽 추상 클래스 상속받기

public class DeskTop extends Computer {
	
	// 286쪽 추상 메서드 구현하기
	@Override
	void display() {
		System.out.println("Desktop display()");
		
	}
	@Override
	void typing() {
		System.out.println("DeskTop typing()");
		
	}
}
