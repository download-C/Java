package chapter09_gamelevel;

public class SuperLevel extends PlayerLevel {
	@Override
	void run() {
		System.out.println("매우 빠르게 달립니다.");
	}
	@Override
	void jump() {
		System.out.println("아주 높이 뜁니다.");
	}
	@Override
	void turn() {
		System.out.println("한 바퀴 구릅니다.");
	}
	@Override
	void showLevelMessage() {
		System.out.println("***** 고급자 레벨입니다. *****");
	}
}
