package chapter09_Q5;

public class Grandeur extends Car {
	String name = "Grendeur";
	@Override
	public void start() {
		System.out.println(name+ " 시동을 켭니다.");
	}

	@Override
	public void drive() {
		System.out.println(name+" 달립니다.");
	}

	@Override
	public void stop() {
		System.out.println(name+" 멈춥니다.");
	}

	@Override
	public void turnOff() {
		System.out.println(name+" 시동을 끕니다");
	}

}