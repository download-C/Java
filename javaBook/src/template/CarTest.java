package template;

// 294쪽 추상 클레스와 템플릿 메서드
// Car 클래스와 AIcCar 클래스 사용하기

public class CarTest {

	public static void main(String[] args) {
		System.out.println("=== 자율 주행하는 자동차 ===");
		Car myCar = new AICar();
		myCar.run();
		
		System.out.println();
		
		System.out.println("=== 사람이 운전하는 자동차 ===");
		Car hisCar = new ManualCar();
		hisCar.run();
	}

}
