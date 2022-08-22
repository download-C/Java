package chapter09_gamelevel2;

public class SuperLevel extends PlayerLevel {
	@Override
	void run() {
		System.out.println("레벨업으로 스킬이 향상되어 아주 빠르게 달립니다.");
	}

	@Override
	void jump() {
		System.out.println("아주 높이 점프합니다.");
	}

	@Override
	void roll() {
		System.out.println("구르기 스킬이 생겼습니다.");
	}

	@Override
	void showLevelMessage() {
		System.out.println("***** 고급자 레벨 *****");
	}

}
