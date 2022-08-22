package chapter09_gamelevel;

public class AdvancedLevel extends PlayerLevel {	
	@Override
	void run() {
		System.out.println("빠르게 달립니다.");
		
	}
	@Override
	void jump() {
		System.out.println("높이 뜁니다.");
	}	
	@Override
	void turn() {
		System.out.println("구르기 스킬을 사용할 레벨이 부족합니다.");
	}
	@Override
	void showLevelMessage() {
		System.out.println("***** 중급자 레벨입니다. *****");
	}
}
