package chapter10_Interface;

// 315쪽 Calc 인터페이스 만들기

public interface Calc {
	double PI = 3.14;
	final static int ERROR = -99999999;
	
	int add(int num1, int num2);
	int substract(int num1, int num2);
	int times(int num1, int num2);
	int divide(int num1, int num2);
	int square(int num);
	
	default void dercription() {
		System.out.println("정수 계산기를 구현합니다.");
		myMethod();
	}
	
	static int total(int[] arr) {
		int total = 0;
		for(int i: arr) {
			total += i;
		}
		myStaticMethod();
		return total;
	}
	
	private void myMethod() {
		System.out.println("Private 메서드");
	}
	private static void myStaticMethod() {
		System.out.println("Private Static 메서드");
	}
	
}
