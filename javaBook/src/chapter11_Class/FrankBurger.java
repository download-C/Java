package chapter11_Class;

public class FrankBurger {
	String name;    		// 주문하는 사람 이름
	String burger;			// 햄버거 이름
	String drink;			// 음료
	String sideMesu;		// 감튀 등 사이드메뉴
		
	public FrankBurger() {}
	
	// 단품만 먹을 때
	public FrankBurger(String name, String burger) {
		this.name = name;
		this.burger = burger;
	}
	
	// 세트 메뉴 먹을 때
	public FrankBurger(String name, String burger, String drink, String sideMesu) {
		this.name = name;
		this.burger = burger;
		this.drink = drink;
		this.sideMesu = sideMesu;
	}

}
