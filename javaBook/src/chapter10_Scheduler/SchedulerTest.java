package chapter10_Scheduler;

import java.io.IOException;

public class SchedulerTest {

	public static void main(String[] args) throws IOException {
		
		// 1. 인터페이스 없이 입력 문자에 따라 배분 정책 수행하기
		
		System.out.println("***** 상담 전화 할당 방식을 선택해서 키보드로 입력하세요 *****");
		System.out.println("R: 한 명씩 차례대로 할당됩니다.");
		System.out.println("L: 쉬고 있거나 대기가 가장 적은 상담원에게 할당됩니다.");
		System.out.println("P: 우선 순위가 높은 고객부터 할당됩니다.");
		
		int ch = System.in.read();
		
		if(ch=='R'||ch=='r') {
			RoundRobin sche= new RoundRobin();
			sche.getNextCall();
			sche.sendCallToAgent();
		} else if(ch=='L'||ch=='l') {
			LeastJob sche = new LeastJob();
			sche.getNextCall();
			sche.sendCallToAgent();
		} else if(ch=='P'||ch=='p') {
			PriorityAllocation sche = new PriorityAllocation();
			sche.getNextCall();
			sche.sendCallToAgent();
		} else {
			System.out.println("잘못 입력하셨습니다.");
			System.out.println("***** 상담 전화 할당 방식을 다시 선택하세요 *****");
			System.out.println("R: 한 명씩 차례대로 할당됩니다.");
			System.out.println("L: 쉬고 있거나 대기가 가장 적은 상담원에게 할당됩니다.");
			System.out.println("P: 우선 순위가 높은 고객부터 할당됩니다.");
			return;
		}
			
	}

}














