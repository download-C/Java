package chapter09_gamelevel;

public class BeginnerLevel extends PlayerLevel {
	void run() {
		System.out.println("천천히 달립니다.");
	}
	
	void jump() {
		System.out.println("점프 스킬을 사용할 레벨이 부족합니다.");
	}
	
	void turn() {
		System.out.println("구르기 스킬을 사용할 레벨이 부족합니다.");
	}

	@Override
	void showLevelMessage() {
		System.out.println("***** 초급자 레벨입니다. *****");
	}
}
