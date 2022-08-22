package chapter10_Scheduler2;

// 323쪽 우선순위에 따라 배분하기

public class PriorityAllocation implements Scheduler {
	@Override
	public void getNextCall() {
		System.out.println("고객 등급이 높은 고객의 전화를 먼져 가져옵니다.");
	}
	@Override
	public void sendCallToAgent() {
		System.out.println("업무 스킬이 좋은 상담원에게 우선적으로 배분합니다.");
	}
}
