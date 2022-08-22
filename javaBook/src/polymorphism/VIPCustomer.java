package polymorphism;

// 263쪽 고객 관리 프로그램 완성하기(2) 
// VIP 고객의 등급과 보너스 적립율 설정

public class VIPCustomer extends Customer {
	private int agentID;
	double discountRatio;
	
	public VIPCustomer(int customerID, String customerName, int agentID) {
		super(customerID, customerName);
		customerGrade = "VIP";
		bonusRatio = 0.05;
		discountRatio=0.1;
		this.agentID = agentID;
	}
	
	public int getAgentID() {
		return agentID;
	}

	@Override
	public int calcPrice(int price) {
		bonusPoint += bonusRatio*price;
		return (price - (int)(price*discountRatio));
	}

	@Override
	public void showCustomerInfo() {
		System.out.println(customerName+"님의 등급은 "+this.customerGrade+"이며,"
						   + " 보너스 포인트는 "+bonusPoint+"점입니다.");
	}
	
}
