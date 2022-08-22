package chapter09_cooperation;
	// 177�� ����ö Ŭ���� �����ϱ�

public class Subway {
	String lineNumber;
	int passangerCount;
	int money;
	
	public Subway(String lineNumber) {
		this.lineNumber = lineNumber;
	}

	public void take(int money) {
		this.money += money;
		passangerCount++;
	}
	
	public void showInfo( ) {
		System.out.println(lineNumber+"ȣ�� �°��� "+passangerCount+"���̰�, ������ "+money+"���Դϴ�.");
	}

}
