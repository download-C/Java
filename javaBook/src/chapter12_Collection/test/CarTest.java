package chapter12_Collection.test;

import java.util.HashMap;

class Car {
	String name;
	public Car() {}
	
	public Car(String name) {
		this.name = name;
	}
}
class CarFactory {
	private static CarFactory instance = new CarFactory();
	private HashMap<String, Car> carMap = new HashMap<>();
	
	private CarFactory () {}
	
	public static CarFactory getInstance() {
		if (instance == null) {
			instance = new CarFactory();
		}
		return instance;
	}
	
	public Car createCar(String name) {
//		carMap.put(name, new Car());
//		Car car = carMap.get(name);
//		System.out.println("Car 주소: "+car);
//		System.out.println(carMap.size()+"개");
//		return carMap.get(name); 
		if(carMap.containsKey(name)) {
			return carMap.get(name);
		}
		Car car = new Car();
		carMap.put(name, car);
		return car;
	}


}

public class CarTest {

	public static void main(String[] args) {
		CarFactory factory = CarFactory.getInstance();
		
		Car sonata1 = factory.createCar("연수 차"); // new Car("연수차")
		Car sonata2 = factory.createCar("연수 차");	// new Car("연수차")
		System.out.println(sonata1==sonata2); //true
		
		Car avante1 = factory.createCar("승연 차");
		Car avante2 = factory.createCar("승연 차");
		System.out.println(avante1==avante2); //true
		
		System.out.println(sonata1==avante1); //false
	}

}
