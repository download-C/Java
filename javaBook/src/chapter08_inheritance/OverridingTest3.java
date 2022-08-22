package chapter08_inheritance;

// 257쪽 클래스형에 기반하여 지불 금액 계산하기

public class OverridingTest3 {

	public static void main(String[] args) {
		int price = 10000;
		
		Customer lee = new Customer(10010, "이순신");
		System.out.println(lee.getCustomerName()+"님이 지불해야 할 금액은"+lee.calcPrice(price)+"입니다.");
		
		VIPCustomer kim = new VIPCustomer(10020, "김유신", 12345);
		System.out.println(kim.getCustomerName()+"님이 지불해야 할 금액은"+kim.calcPrice(price)+"입니다.");
		
		Customer na = new VIPCustomer(10030, "나몰라", 2000);
		System.out.println(na.getCustomerName()+"님이 지불해야 할 금액은"+na.calcPrice(price)+"입니다.");
	}

}
