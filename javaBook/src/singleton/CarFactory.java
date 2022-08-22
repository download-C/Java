package singleton;

public class CarFactory {
	
	private CarFactory() {}
	
	private static CarFactory instance = new CarFactory();
	
	public static CarFactory getInstance() {
		
		return instance;
		
	} 
		
		
	Car createCar() {
		return new Car();
	} 
	
	
	

}
