package chapter09_gamelevel2;

public class AdvancedLevel extends PlayerLevel {
	@Override
	void run() {
		System.out.println("레벨업으로 스킬이 향상되어 더 빠르게 달립니다.");
	}

	@Override
	void jump() {
		System.out.println("높이 점프합니다.");
	}

	@Override
	void roll() {
		System.out.println("구르기 스킬을 사용하기 위한 레벨이 부족합니다.");
	}

	@Override
	void showLevelMessage() {
		System.out.println("***** 중급자 레벨 *****");
	}
}