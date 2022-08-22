package chapter09_cooperation;
	// 180�� ��ȥ�� �ڵ� �ý� Ŭ���� �����ϱ�

public class Taxi {
	String taxiNumber;
	int cost;	 
	
	 public Taxi(String taxiNumber) {
		 this.taxiNumber = taxiNumber;
	 }
	
	 public void take(int cost) {
		 this.cost += cost;		
	 }
	 
	 public void showInfo() {
		 System.out.println(taxiNumber+"�� �ý��� ������ "+cost+"���Դϴ�" );
	 }
	 
	
}
