package chapter10_Scheduler;

// 322쪽 순서대로 배분하기

public class RoundRobin {

	public void getNextCall() {
		System.out.println("상담 전화를 순서대로 대기열에 가져옵니다.");
	}

	public void sendCallToAgent() {
		System.out.println("다음 순서 상담원에게 배분합니다.");
	}
	
}
