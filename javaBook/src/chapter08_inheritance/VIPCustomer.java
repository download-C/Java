package chapter08_inheritance;

// 236쪽 Customer 클래스를 상속받는 VIPCustomer 클래스 구현

public class VIPCustomer extends Customer{
	// int customerID;
	// String customerName;
	// String customerGrade;
	// int bonusPoint;
	// int bonusRatio;
	double discountRatio;
	int agentID;
	
	//calcPrice(), showCustomerInfo()
	
	public VIPCustomer() {
		 super();
		 customerGrade = "VIP";
		 bonusRatio = 0.05;
		 discountRatio = 0.1;
		 System.out.println("VIPCustomer() 생성자 호출");
	}
	
	public VIPCustomer(int customerID, String customerName, int bonusPoint) {
		this.customerID = customerID;
		this.customerName = customerName;
		this.bonusPoint = bonusPoint;
		customerGrade = "VIP";
		bonusRatio = 0.05;
		discountRatio = 0.1;
		System.out.println("VIPCustomer() 생성자 호출");
	}
	
	@Override	// @override : 오버라이드 애너테이션. 상속받는 하위 클래스에서 사용하는 개념으로 '재정의된 메서드라는 뜻. 
				// 			   하위 클래스에 있는 메서드를 재정의해주기 위해 같은 이름을 사용해야 함.
				//			   menu -> Source -> Override/Implement Methods로 사용 가능.
	
	public int calcPrice(int price) {
		bonusPoint += price*bonusRatio;
		return ( price-(int)(price*discountRatio) );
	}
		
	public int getAgentID() {
		return agentID;
	}

}
