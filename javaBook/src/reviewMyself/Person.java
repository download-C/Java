package reviewMyself;

public class Person {

	String name;
	String menu;
	int money;
	Cafe cafe;
	
	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}
	

	public Person(String name) {
		super();
		
	}
	
	public String getMenu() {
		return menu;
	}

	public void setMenu(String setMenu) {
		this.menu = setMenu;
	}

	public void goCafe(Cafe cafe) {
		this.cafe = cafe;
	}


	public void showInfo() {
		System.out.println(name+"씨는 "+cafe+"에 가서 "+menu+"를 주문했다.");
		System.out.println(menu+"의 가격은 "+money+"원이다.");
	}
	
}
