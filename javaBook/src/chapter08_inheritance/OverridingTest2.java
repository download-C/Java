package chapter08_inheritance;

// 253쪽 클래스 형 변환과 재정의 메서드 호출하기

public class OverridingTest2 {

	public static void main(String[] args) {
		Customer vc = new VIPCustomer(10030, "나몰라", 2000); 
		vc.bonusPoint = 1000;
		
		vc.showCunstomerInfo();
		
		System.out.println(vc.getCustomerName()+"님이 지불하셔야 할 금액은 "
		+vc.calcPrice(10000)+"원입니다.");
		
	}

}
