package chapter12_generic;

// 393쪽 Plastic 클래스 정의하기

public class Plastic extends Material {
	
	public void doPrinting() {
		System.out.println("Plastic 재료로 출력합니다.");
	}
	
	@Override
	public String toString() {
		return "재료는 Plastic입니다.";
	}
	
}
