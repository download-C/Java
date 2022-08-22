package template;

// 291쪽 추상 클래스와 템플릿 메서드

public abstract class Car {
	public abstract void drive();
	public abstract void stop();
	public abstract void wiper();

	public void startCar() {
		System.out.println("시동을 켭니다.");
	}
	
	public void turnOff() {
		System.out.println("시동을 끕니다.");
	}
	
	
	// final 예약어를 통해 메서드를 재정의할 수 없도록 하는 템플릿 메서드
	final public void run() {
		startCar();
		drive();
		wiper();
		stop();
		turnOff();
	}
	
}
