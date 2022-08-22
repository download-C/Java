package withArrayList;

//267쪽 새로운 고객 등급 추가하기

import polymorphism.Customer;

public class GoldCustomer extends Customer {
	double discountRatio;
	
	public GoldCustomer(int customerID, String customerName) {
		customerGrade = "GOLD";
		bonusRatio = 0.02;
		discountRatio = 0.1;
		this.customerID = customerID;
		this.customerName = customerName;
	}

	@Override
	public int calcPrice(int price) {
		bonusPoint += price*bonusRatio;
		return price - (int)(price*discountRatio);
	}
		
}
