package chapter10_Scheduler2;

public class AgentGetCall implements Scheduler {
	@Override
	public void getNextCall() {
		System.out.println("상담원이 다음 전화를 요청합니다.");
	}
	@Override
	public void sendCallToAgent() {
		System.out.println("상담원이 전화를 가져갔습니다.");
	}
	
}
