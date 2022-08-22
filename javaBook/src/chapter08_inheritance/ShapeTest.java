package chapter08_inheritance;

import java.util.ArrayList;

// 279쪽 마무리 문제 5

class Shape {
	
	public void draw() {
		System.out.println("Shape");
	}
}



class Circle extends Shape {
	@Override
	public void draw() {
		System.out.println("Circle");
	}
}



class Triangle extends Shape {
	@Override
	public void draw() {
		System.out.println("Triangle");
	}
}

class Square extends Shape {
	@Override
	public void draw() {
		System.out.println("Square");
	}
}

class Hexagon extends Shape {
	@Override
	public void draw() {
		System.out.println("Hexagon");
	}
}



public class ShapeTest {

	public static void main(String[] args) {
		// 상위 클래스 타입으로 배열리스트 생성
		ArrayList<Shape> list = new ArrayList<Shape>();
		
		// list.add를 통해 차례로 배열에 상위클래스 Shape와 하위클래스 Circle, Triangle, Square 생성자로 값 생성
		list.add(  new Shape()    );
		list.add(  new Circle()   );
		list.add(  new Triangle() );
		list.add(  new Square()   );
		list.add(  new Hexagon()  );
		
		// 향상된 for문을 이용해서 상위 클래스의 draw() 메서드와 하위 클래스 Circle, Triangle, Square, Hexagon의 재정의된 draw() 메서드 출력
		for(Shape s : list) {
			s.draw();
		}
	}

}
