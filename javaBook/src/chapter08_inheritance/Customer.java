package chapter08_inheritance;

// 234쪽 고객관리 프로그램 중 Customer 클래스 구현

public class Customer {
	protected int customerID; 		// 고객 아이디
	protected String customerName;	// 고객 이름
	protected String customerGrade;	// 고객 등급
	protected int bonusPoint;					// 보너스 포인트
	protected double bonusRatio;				// 적립 비율
	
	public Customer() { 			// 생성자 만들면 자동으로 들어가는 값
		super();
		customerGrade = "SILVER";	// 기본 등급
		bonusRatio = 0.01;  		// 보너스 포인트 기본 적립 비율(1%)
		System.out.println("Customer() 생성자 호출");
	}
	


	public Customer(int i, String string) {
		this.customerID = i;
		this.customerName = string;
	}



	public String getCustomerName() {
		return customerName;
	}



	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}



	public int calcPrice(int price) {
		bonusPoint += price*bonusRatio;
		return price;
	}
	
	public void showCunstomerInfo () {
		System.out.println(customerName+"님의 등급은 "+customerGrade+"이고, 보너스 포인트는 "+bonusPoint+"입니다.");
	}
	
	
	
	

}
