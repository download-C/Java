package selfCoding;

public class Cafe {
	String cafeName;
	String menu;
	int cost;
		
	public void setCafeName(String cafeName) {
		this.cafeName = cafeName; 
		
		
		
	}
	
	public void setMenu(String menu) {
		this.menu = menu;
		if( cafeName.equals("��Ÿ����") ) {	
			switch(menu) {
				case "�Ƹ޸�ī��" -> cost = 4000;
				case "ī���" -> cost = 4500;
				case "���̽�����" -> cost = 5000;
				case "���ν����" -> cost = 3500;
			}
		} 
		
		else if(cafeName.equals("Ŀ�Ǻ�")) {
			switch(menu) {
				case "�Ƹ޸�ī��" -> cost = 3500;
				case "ī���" -> cost = 4500;
				case "���̽�����" -> cost = 5000;
				case "���ν����" -> cost = 3500;
			} 					
		} else {}
		
	}
	
	public void showInfo() {
		System.out.println(cafeName+"�� "+menu+" ������ "+cost+"���̴�.");
		
	}

}
