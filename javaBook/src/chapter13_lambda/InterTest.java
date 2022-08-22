package chapter13_lambda;

interface Inter {
	public void methodI();
}

class InterClass implements Inter {
	@Override
	public void methodI() {
		System.out.println("클래스로 인터페이스 구현");
	}
}

public class InterTest {
	public static void main(String[] args) {
		InterClass ic = new InterClass();
		ic.methodI();
		
		Inter i1 = new Inter() {
			@Override
			public void methodI() {
				System.out.println("내부 클래스로 인터페이스 구현");
			}
		};
		i1.methodI();
		
		Inter i2 = () -> {System.out.println("람다식으로 인터페이스 구현");};
		i2.methodI();
		
	}
}
