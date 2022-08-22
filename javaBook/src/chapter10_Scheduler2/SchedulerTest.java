package chapter10_Scheduler2;

import java.io.IOException;

//인터페이스를 이용하여 입력 문자에 따라 배분 정책 수행하기

public class SchedulerTest {

	public static void main(String[] args) throws IOException {
		
		System.out.println("***** 상담 전화 할당 방식을 선택해서 키보드로 입력하세요 *****");
		System.out.println("R: 한 명씩 차례대로 할당됩니다.");
		System.out.println("L: 쉬고 있거나 대기가 가장 적은 상담원에게 할당됩니다.");
		System.out.println("P: 우선 순위가 높은 고객부터 할당됩니다.");
		System.out.println("A: 전화를 요청하는 상담원에게 할당됩니다.");
		
		int ch = System.in.read();
		Scheduler sche;
		
		if(ch=='R'||ch=='r') {
			sche= new RoundRobin();
		} else if(ch=='L'||ch=='l') {
			sche = new LeastJob();
		} else if(ch=='P'||ch=='p') {
			sche = new PriorityAllocation();
		} else if(ch=='A'||ch=='a') {
			sche = new AgentGetCall();
		} else {
			System.out.println("잘못 입력하셨습니다.");
			System.out.println();
			System.out.println("***** 상담 전화 할당 방식을 다시 선택하세요 *****");
			System.out.println("R: 한 명씩 차례대로 할당됩니다.");
			System.out.println("L: 쉬고 있거나 대기가 가장 적은 상담원에게 할당됩니다.");
			System.out.println("P: 우선 순위가 높은 고객부터 할당됩니다.");
			return;
		}
		
		sche.getNextCall();
		sche.sendCallToAgent();
		
	}

}














