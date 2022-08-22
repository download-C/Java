package chapter13_innercalss;

// 455쪽 지역 내부 클래스 예제

 class Outer {
	 int outNum = 100;
	 static int sOutNum = 200;
	 
	 Runnable getRunnable(int i) {  // i와 localNum은 메서드의 내부클래스에서만 사용하기 위한 지역변수로 final이 생략된 상수.
		 int num = 100;
		 		 
		 class MyRunnable implements Runnable {  // Runnable 인터페이스는 java.lang에 이미 정의되어져있음.
			 int localNum = 10;
			 
			 @Override
			 public void run() {
				 // num = 200;
				 // i = 100;
				 System.out.println("i="+i+"(메서드의 매개변수(지역 변수))");
				 System.out.println("num="+num+"(메서드의 지역 변수)");
				 System.out.println("localNum"+localNum+"(내부 클래스 지역 변수)");
				 System.out.println("outNum="+outNum+"(외부 클래스 인스턴스 변수)");
				 System.out.println("Outer.sOutnum="+Outer.sOutNum+"(외부 클래스 정적 변수)");
			 }
		 }
		 return new MyRunnable();  // MyRunnable이 Runnable을 상속하기 때문에 자동으로 업캐스팅되어 Runnable 타입으로 return 가능.
	 } 	 
 }

public class LocalInnerTest {
	public static void main(String[] args) {
		Outer out = new Outer();
		Runnable runner = out.getRunnable(10);
		runner.run();
	}
}
