package chapter09_abstractex;

// 287쪽 MyNoteBook 클래스 구현하기
// 상위 클래스인 Notebook에는 추상 클래스 typing()이 남아있기 때문에
// 하위 클래스인 MyNoteBook 클래스에서 완성해주어야 함.

public class MyNoteBook extends NoteBook {

	@Override
	void typing() {
		System.out.println("MyNoteBook typing()");
		
	}
	
}
