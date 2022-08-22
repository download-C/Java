package chapter10_InterfaceEx;

// 338쪽 MyClass 테스트하기

public class MyClassTest {

	public static void main(String[] args) {
		MyClass mClass = new MyClass(); // MyClass형으로 객체 생성
		X xClass = mClass;				// 인터페이스 X형으로 객체 생성
		xClass.x();						// 인터페이스 X의 x() 호출
		Y yClass = mClass;				// 인터페이스 Y형으로 객체 생성
		yClass.y();						// 인터페이스 Y의 y() 호출
		
		MyInterface iClass = mClass;	// 인터페이스 MyInterface 형으로 객체 생성
		iClass.x();						// 하위 인터페이스 MyInterface로 인터페이스 X의 x() 호출
		iClass.y();						// 하위 인터페이스 MyInterface로 인터페이스 Y의 y() 호출
		iClass.myMethod();				// 인터페이스 MyInterface의 myMethod() 호출
	}	

}
	