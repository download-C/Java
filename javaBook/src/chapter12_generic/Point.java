package chapter12_generic;

// 400쪽 제네릭 두 개를 사용하는 클래스 Point 정의하기

public class Point<T,V> {
	T x;
	V y;
	
	public Point(T x, V y) {
		this.x = x;
		this.y = y;
	}
	
	public T getX() {
		return x;
	}

	public V getY() {
		return y;
	}
	

}
