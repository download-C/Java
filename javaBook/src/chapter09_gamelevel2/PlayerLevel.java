package chapter09_gamelevel2;

public abstract class PlayerLevel {
	abstract void run();
	abstract void jump();
	abstract void roll();
	abstract void showLevelMessage();
	
	final void go(int count) {
		run();
		for(int i=0; i<count; i++) {
			jump();
		}
		roll();
	}

}
