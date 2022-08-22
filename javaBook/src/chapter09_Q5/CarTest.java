package chapter09_Q5;

import java.util.ArrayList;

// 311쪽 연습문제 5

public class CarTest {

	public static void main(String[] args) {
		ArrayList<Car> carList = new ArrayList<Car>();
		carList.add(new Sonata());
		carList.add(new Grandeur());
		carList.add(new Avante());
		carList.add(new Genesis());
		for(Car car: carList) {
			car.run();
			System.out.println("======================");
		}
	
	}

}
