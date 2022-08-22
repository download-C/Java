package chapter10_Scheduler2;

// 322쪽 Scheduler 인터페이스 구현하기

public interface Scheduler {
	void getNextCall();
	void sendCallToAgent();
}
	   