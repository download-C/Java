package chapter13_innercalss;

// 450쪽 인스턴스 내부 클래스 예제

class OutClass {						// 외부 클래스
	private int num = 10;				// 외부 클래스 private 변수
	private static int sNum = 20;		// 외부 클래스 정적 변수
	
	private InClass inClass;			// 내부 클래스형으로 변수 먼저 선언
	
	public OutClass() {					// 외부 클래스의 디폴트 생성자
		inClass = new InClass();		// 외부 클래스를 먼저 생성해야 내부 클래스 객체 생성 가능
	}	
	
	class InClass {
		int inNum = 100;
//		static int sInNum = 200;		// java 16 이하에서는 인스턴스 내부 클래스에는 정적 변수 선언 불가능
		
		void inTest() {
			System.out.println("OutClass num = "+num+"(외부 클래스의 인스턴스 변수)");
			System.out.println("OutClass sNum = "+sNum+"(외부 클래스의 정적 변수)");
		}
//		static void sTest() {}			// java 16 이하에서는 인스턴스 내부 클래스에는 정적 메서드 선언 불가능
	}		
	
	public void usingClass() { 			// inClass를 통한 객체 생성 후 inTest() 메서드 호출
		inClass.inTest();
	}
}

public class InnerClassTest {
	public static void main(String[] args) {
		OutClass outClass = new OutClass();  // 외부 클래스의 디폴트 생성자를 통해 내부 클래스 객체도 함께 생성됨
		System.out.println("외부 클래스를 이용해서 내부 클래스 기능 호출");
		outClass.usingClass();
		
		// 외부 클래스의 객체를 먼저 생성해야 그 이후에 내부 클래스의 객체를 따로 생성할 수 있음.
		OutClass.InClass inClass = outClass.new InClass();
		System.out.println("InClass inNum = "+inClass.inNum);
	}
}

class A { 								// 외부 클래스
    class B {}							// 내부 클래스
    static class BB {}					// 정적 내부 클래스
}

class C {								// 외부 클래스
    void methodD() {					// 인스턴스 메서드
        class E implements Inter{		// 지역 내부 클래스 
			@Override
			public void methodInter() {
			}
        }
    }
}

interface Inter {						// 인스턴스
    default void methodInter(){ }
}

class F implements Inter {				// 
    @Override
	public void methodInter() {}
}

class G {								//
    void methodE() {
        Inter i = new Inter(){     		// 익명 내부 클래스(인스턴스를 객체 생성할 때 붙이는 이름 없는 클래스
             @Override
             public void methodInter() {
            	 
             }   
        }; 
    }
}





