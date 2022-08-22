package chapter08_inheritance;

// 239쪽 상속 클래스 테스트하기

public class CustomerTest {

	public static void main(String[] args) {
		Customer c1 = new Customer();
		VIPCustomer v1 = new VIPCustomer();
		VIPCustomer2 v2 = new VIPCustomer2();
		
		c1.customerID = 10010;
		c1.customerName = "Kim";
		c1.showCunstomerInfo();
		System.out.println("========== 1000원짜리 빵 구매 ==========");
		System.out.println("가격: "+c1.calcPrice(1000)+"원");
		c1.showCunstomerInfo();
		
		System.out.println();
		
		v1.customerID = 10020;
		v1.customerName = "Lee";
		v1.showCunstomerInfo();
		System.out.println("========== 1000원짜리 빵 구매 ==========");
		System.out.println("가격: "+v1.calcPrice(1000)+"원");
		v1.showCunstomerInfo();
		
		System.out.println();
		
		v2.customerID = 10030;
		v2.customerName = "Park";
		v2.showCustomerInfo();
		System.out.println("========== 1000원짜리 빵 구매 ==========");
		System.out.println("가격: "+v2.calcPrice(1000)+"원");
		v2.showCustomerInfo(); 
		
		
		
		

	}

}
