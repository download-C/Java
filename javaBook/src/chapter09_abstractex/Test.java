package chapter09_abstractex;

public class Test {
	
	public static void main(String[] args) {
		// A a = new A(); 추상 클래스는 객체 생성 불가
		A a = new B();  // 자동 형 변환
		a.methodA();
		B b = new B();
		b.methodA();
		
System.out.println();

		//Computer c1 = new Computer();
		DeskTop c2 = new DeskTop();
		//NoteBook c3 = new NoteBook();
		MyNoteBook c4 = new MyNoteBook();
		c2.display();
		c2.typing();
		c4.display();
		c4.typing();
	}
}

abstract class A {
	
	abstract void methodA();
	
}

class B extends A {
	@Override
	void methodA() {
		System.out.println("재정의된 메서드A");
	}
}