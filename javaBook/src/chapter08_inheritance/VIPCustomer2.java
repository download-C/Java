package chapter08_inheritance;

public class VIPCustomer2 {

	
	int customerID;
	String customerName;
	String customerGrade;
	int bonusPoint;
	double bonusRatio;
	double discountRatio;
	int agentID;
	
	public VIPCustomer2() {
		
		 customerGrade = "VIP";
		 bonusRatio = 0.05;
		 discountRatio = 0.1;
	}
	
	public int calcPrice(int price) {
		bonusPoint += price*bonusRatio;
		return (int)(price-(price*discountRatio));
	}
		
	public int getAgentID() {
		return agentID;
	}
	
	public void showCustomerInfo() {
		System.out.println(customerName+"님의 등급은 "+customerGrade+"이고, 보너스 포인트는 "+bonusPoint+"입니다.");
	}
}
