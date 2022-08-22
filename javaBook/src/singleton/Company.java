package singleton;

// 194쪽 Company 클래스 구현하기

public class Company {
	
	private Company() {}
	
	private static Company instance = new Company();  
	// Company 클래스를 이용해 instance라는 이름의 인스턴스 생성. 
	// static을 붙여 Company를 이용한 추가적인 인스턴스 생성 제한
	
	public static Company getInstance() {
		if(instance == null) {
			instance = new Company();
		}
		return instance;
	}
	
}
