package withArrayList;

import java.util.ArrayList;
import polymorphism.Customer;
import polymorphism.VIPCustomer;

public class CustomerTest {

	public static void main(String[] args) {
		
		int price = 10000;
		
		// 고객 정보를 입력하는 ArrayList 만들기
		ArrayList<Customer> customerList = new ArrayList<Customer>();
		
		// 객체 생성 후 메서드를 통해 고객 정보 입력하기
		Customer lee = new Customer(10010, "이순신");
		Customer shin = new Customer(10020, "신사임당");
		Customer hong = new GoldCustomer(10030, "홍길동");
		Customer youl = new GoldCustomer(10040, "이율곡");
		Customer kim = new VIPCustomer(10050, "김유신", 12345);
		
		// 배열에 고객 정보 입력하기
		customerList.add(lee);
		customerList.add(shin);
		customerList.add(hong);
		customerList.add(youl);
		customerList.add(kim);
		
		System.out.println("========== 고객 정보 출력 ==========");
		for(Customer customer: customerList) {
			customer.showCustomerInfo();
			System.out.println();
		}
		
		System.out.println("================ 구매할 제품 정보 ================");
		System.out.println("구매하실 제품의 원래 가격은 "+price+"원입니다.");
		System.out.println();
		System.out.println("========== 할인율과 보너스 포인트 계산 ==========");
		for(Customer customer: customerList) {
			int cost = customer.calcPrice(price);
			System.out.println("등급별 할인율에 따라 "+customer.getCustomerName()+"님이 지불하실 금액은 "+cost+"원입니다.");
			customer.showCustomerInfo();
			System.out.println();
		}
		
	}

}