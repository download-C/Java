package chapter09_cooperation;
	// 177�� ���� Ŭ���� �����ϱ�

public class Bus {
	String busNumber;		// ���� ��ȣ
	int passangerCount;		// 
	int money;
	
	public Bus(String busNumber) {  // String �Ű������� ���� ������
		this.busNumber = busNumber;
	}
	
	public void take(int money) {
		this.money += money;
		passangerCount++;
	}
	
	public void showInfo( ) {
		System.out.println(busNumber+"�� ������ �°��� "+passangerCount+"���̰�, ������ "+money+"���Դϴ�.");
	}

}
