package chapter12_generic;

public class Water {
	public void doPrinting() {
		System.out.println("Water 재료로 출력합니다.");
	}
	
	@Override
	public String toString() {
		return "재료는 Water입니다.";
	}
}
