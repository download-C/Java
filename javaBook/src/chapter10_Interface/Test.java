package chapter10_Interface;

interface A {
	void methodA();
}

interface B {
	void methodB();
}

class C implements A, B {
	@Override
	public void methodA() {
	}
	@Override
	public void methodB() {
	}
}

public class Test {
	public static void main(String[] args) {
		C c = new C();
		c.methodA();
		c.methodB();
		A a = new C();
		a.methodA();
		B b = new C();
		b.methodB();
	}
}
