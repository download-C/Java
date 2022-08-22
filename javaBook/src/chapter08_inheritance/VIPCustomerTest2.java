package chapter08_inheritance;

//  242쪽 하위 클래스 생성하기

public class VIPCustomerTest2 {

	public static void main(String[] args) {
		VIPCustomer kim = new VIPCustomer();
		kim.customerID = 10020;
		kim.customerName = "김유신";
		kim.bonusPoint = 10000;
		kim.showCunstomerInfo();
	}

}
