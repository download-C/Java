package chapter09_gamelevel2;

public class BeginnerLevel extends PlayerLevel { 
	@Override
	void run() {
		System.out.println("천천히 달립니다.");
	}

	@Override
	void jump() {
		System.out.println("점프 스킬을 사용하기 위한 레벨이 부족합니다.");
	}

	@Override
	void roll() {
		System.out.println("구르기 스킬을 사용하기 위한 레벨이 부족합니다.");
	}

	@Override
	void showLevelMessage() {
		System.out.println("***** 초보자 레벨 *****");
	}

}
