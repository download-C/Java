package chapter12_generic;

public class GenericMethod {
	
	public static <T, V>double makeRectangle(Point<T,V> p1, Point<T,V> p2) {
		
		// 두 점의 x값과 y값에 대해 double 타입으로 변환되도록 업캐스팅해줌.
		double left = ((Number)p1.getX()).doubleValue();
		double top = ((Number)p1.getY()).doubleValue();
		double right = ((Number)p2.getX()).doubleValue();
		double bottom = ((Number)p2.getY()).doubleValue();
		
		// 두 점의 x축 거리를 가로, y축 거리를 높이로 정의함.
		double width = Math.abs(right) - Math.abs(left);
		double height = Math.abs(bottom)-Math.abs(top);
		
		// 가로와 세로를 곱해서 직사각형의 면적 구함.
		return width*height;
	}

}
