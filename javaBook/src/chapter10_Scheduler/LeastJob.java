package chapter10_Scheduler;

// 323쪽 짧은 대기열 순서로 배분하기

public class LeastJob {
	public void getNextCall() {
		System.out.println("상담 전화를 순서대로 대기열에서 가져옵니다.");
	}
	public void sendCallToAgent() {
		System.out.println("현재 상담 없무가 없거나 대기가 가장 적은 상담원에게 배분합니다.");
	}
	
}
