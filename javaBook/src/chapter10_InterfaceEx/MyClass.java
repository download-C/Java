package chapter10_InterfaceEx;

// 338쪽 MyInterface를 구현하는 MyClass 구현하기

public class MyClass implements MyInterface {

	@Override
	public void x() {
		System.out.println("x()");
	}

	@Override
	public void y() {
		System.out.println("y()");
	}

	@Override
	public void myMethod() {
		System.out.println("myMethod()");
	}

}
