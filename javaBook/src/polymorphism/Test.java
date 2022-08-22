package polymorphism;

public class Test {
	public static void main(String[] args) {
	A a = new A();
	B b = new B();
	
	a = b;			// 부모형 변수 = 자녀형 변수 		   -> 자동 형 변환
	b = (B)a;		// 자녀형 변수= (자녀형) 부모형 변수   -> 상속에서 수동 형 변환
	
	A c = new A();
	c = b;
	b = (B)c;		// 수동 형 변환 시에는 원래 자동 형 변환이 일어난 부모만 수동 형 변환 가능
					// -> 자동 형 변환을 되돌리기 위한 수동 형 변환만 가능함.
	
	}
	
}
