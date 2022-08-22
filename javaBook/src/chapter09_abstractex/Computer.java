package chapter09_abstractex;

// 283쪽 추상 클래스 구현하기

public abstract class Computer {
	abstract void display();
	abstract void typing();
	void turnOn() {
		System.out.println("전원을 켭니다.");
	}
	void turnOff() {
		System.out.println("전원을 끕니다");
	}
}