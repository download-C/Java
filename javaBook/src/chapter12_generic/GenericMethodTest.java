package chapter12_generic;

public class GenericMethodTest {

	public static void main(String[] args) {
			
		Point<Integer, Double> p1 = new Point<>(0, 0.0);
		Point<Integer, Double> p2 = new Point<> (10, 10.0);
		
		double rect = GenericMethod.makeRectangle(p1, p2);
		System.out.println("두 점으로 만들어진 사각형의 넓이는 "
							+rect+"입니다");

	}

}
