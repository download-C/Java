package chapter09_abstractex;

// 286쪽 NoteBook 클래스 구현하기

// display() 메서드만 구현하기 때문에 상위 클래스의 추상 메서드인 typing()이 남아있음.

public abstract class NoteBook extends Computer {
	@Override
	void display() {
		System.out.println("NoteBook display()");
		
	}

}
