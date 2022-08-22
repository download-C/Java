package chapter12_generic;

// 392쪽 Powder 클래스 정의하기

public class Powder extends Material{
	public void doPrinting() {
		System.out.println("Powder 재료로 출력합니다.");
	}

	@Override
	public String toString() {
		return "재료는 Powder입니다.";
	}
	
}
