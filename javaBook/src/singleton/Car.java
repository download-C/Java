package singleton;

public class Car {
	
	static int carNum = 10001;
	
	public static int getCarNum( ) {
		
		return carNum++;	
		
	}

}
