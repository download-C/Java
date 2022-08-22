package polymorphism;

// 262쪽 고객 관리 프로그램 완성하기(1) 
// 일반 고객의 등급과 보너스 적립율 설정

public class Customer {
	// 하위 클래스를 제외한 다른 클래스에서 수정할 수 없도록 protected로 지정
	protected int customerID;			
	protected String customerName;
	protected String customerGrade;
	protected int bonusPoint;
	protected double bonusRatio;
	
	// 반복되는 등급과 보너스 적립율을 메서드로 만들어서 호출
	private void initCustomer() {
		customerGrade="SILVER";
		bonusRatio=0.01;
	}
	
	// 디폴트 생성자에 기본 정보 등록
	public Customer() {
		initCustomer();
	}
	
	// 정보를 입력받는 생성자 
	public Customer(int customerID, String customerName) {
		this.customerID = customerID;
		this.customerName = customerName;
		initCustomer();
		
	}
	
	// 들어온 금액으로 적립율을 계산해주는 메서드
	public int calcPrice(int price) {
		bonusPoint += price*bonusRatio;
		return price;
	}
	
	public void showCustomerInfo() {
		System.out.println(customerName+"님의 등급은 "+customerGrade+"이며, "
				           + "보너스 포인트는 "+bonusPoint+"점입니다.");
	}

	public int getCustomerID() {
		return customerID;
	}

	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerGrade() {
		return customerGrade;
	}

	public void setCustomerGrade(String customerGrade) {
		this.customerGrade = customerGrade;
	}

}
