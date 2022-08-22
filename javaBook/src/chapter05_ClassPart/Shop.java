package chapter05_ClassPart;

public class Shop {
	
	long orderNumber;
	String orderID;
	String orderDate;
	String orderName;
	String orderProductNumber;
	String orderAdress;
	
	public static void main(String[] args) {
		// 152�� �� ȥ�� �ڵ�
		// Q2. ���θ� �ֹ� �������� Ŭ����, �ν��Ͻ�, ���
		
		Shop s = new Shop();
		s.orderNumber = 201803120001L;
		s.orderID = "abc123";
		s.orderDate = "2018�� 3�� 12��";
		s.orderName = "ȫ���";
		s.orderProductNumber = "PD0345-12";
		s.orderAdress = "����� �������� ���ǵ��� 20����";
		
		System.out.println("�ֹ� ��ȣ : "+s.orderNumber);
		System.out.println("�ֹ��� ���̵� :"+ s.orderID);
		System.out.println("�ֹ� ��¥ : "+s.orderDate);
		System.out.println("�ֹ��� �̸� : "+s.orderName);
		System.out.println("�ֹ� ��ǰ ��ȣ : "+s.orderProductNumber);
		System.out.println("��� �ּ� : "+s.orderAdress);
				
	}

}
