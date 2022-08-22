package chapter13_innercalss;

class OutClass2 {
	private int num = 10;
	private static int sNum = 20;
	
	static class InStaticClass {
		int inNum = 100;
		static int sInNum = 200;  // 정적 내부 클래스의 정적 변수
		
		void inTest() {
			// num += 10;  정적 내부 클래스의 일반 메서드는 외부 클래스의 인스턴스 변수 사용 부락
			System.out.println("InStaticClass inNum = "+inNum+" (정적 내부 클래스의 인스턴스 변수)");
			System.out.println("InStaticClass sInNum = "+sInNum+" (정적 내부 클래스의 정적 변수)");
			System.out.println("OutClass sNum = "+sNum+" (외부 클래스의 정적 변수)");
		}
		
		static void sTest() { // 정적 내부 클래스의 정적 메서드
			// num += 10;		 정적 내부 클래스의 정적 메서드는 외부 클래스의 인스턴스 변수 사용 불가
			// inNum += 20;      정적 내부 클래스의 정적 메서드는 내부 클래스의 인스턴스 변수 사용 불가  
			System.out.println("OutClass sNum = "+ sNum+" (외부 클래스의 정적 변수)");
			System.out.println("InStatic sInNum = "+sInNum+" (내부 클래스의 정적 변수)");
		}
	}
}

public class InnerTest {
	public static void main(String[] args) {
		OutClass2.InStaticClass isc = new OutClass2.InStaticClass();
		System.out.println("정적 내부 클래스 일반 메서드 호출");
		isc.inTest();		// 객체 생성 후 호출
		System.out.println();
		System.out.println("정적 내부 클래스의 정적 메서드 호출");
		OutClass2.InStaticClass.sTest(); // 객체 생성 없이 바로 호출 가능		
	}	
}
