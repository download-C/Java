package polymorphism;

// 264쪽 고객 관리 프로그램 완성하기(3)
// 고객의 정보 입력 및 할인 가격과 적립된 보너스포인트

public class CustomerTest {

	public static void main(String[] args) {
		// 일반 고객 "최다운"의 정보 입력 및 정보 출력
		Customer choi = new Customer(10010, "최다운");
		choi.bonusPoint = 1000;
		choi.showCustomerInfo();
		
		// VIP 고객 "김명진"의 정보 입력 및 정보 출력
		Customer kim = new VIPCustomer(10020, "김명진", 12345);
		kim.bonusPoint = 1000;
		
		kim.showCustomerInfo();
		
		System.out.println();
		
		System.out.println("========== 할인율 및 보너스 포인트 계산 ==========");
		
		// 제품 가격 설정 및 고객 별 구매 변수 만들기
		int price = 1000;
		int choiPrice = choi.calcPrice(price);
		int kimPrice = kim.calcPrice(price);
		System.out.println("제품의 가격은 "+price+"원입니다");
		System.out.println();
		
		
		// 고객 별 할인된 금액과 적립된 보너스 포인트 출력
		System.out.println(choi.getCustomerName()+"님이"+choiPrice+"원 지불하셨습니다.");
		choi.showCustomerInfo();
		System.out.println();
		System.out.println(kim.getCustomerName()+"님이"+kimPrice+"원 지불하셨습니다.");
		kim.showCustomerInfo();
	}

}
