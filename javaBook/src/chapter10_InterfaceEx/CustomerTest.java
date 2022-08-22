package chapter10_InterfaceEx;

public class CustomerTest {
	public static void main(String[] args) {
		Customer customer = new Customer();
		
		Buy buyer = customer;    // Customer 클래스형인 costomer를 인터페이스 Buy형으로 변환.
		buyer.buy();			 // buy()는 Buy형에서만 호출 가능
		Sell seller = customer;  // Customer 클래스형인 costomer를 인터페이스 Sell형으로 변환
		seller.sell();		     // sell()은 Sell형에서만 호출 가능
		
		if(seller instanceof Customer) {			// seller의 자료형을 확인 후 Customer형으로 다운캐스팅
			Customer customer2 = (Customer)seller;
			customer2.buy();						
			customer2.sell();
			customer2.order();
		}
	}	
}
