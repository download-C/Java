package chapter05_ClassPart;

public class GoodsTest {

	public static void main(String[] args) {
		// ���� �Ǹ� �� ��� ���� ���α׷�
		
		Goods p1 = new Goods("�Ｚī�޶�", "111111", 10, 3);
		Goods p2 = new Goods("�����е�", "222222", 5, 2);
		
		Goods p3 = new Goods();
		p3.setCode("�����е�");
		System.out.println(p3.getCode());
	
		
		System.out.println(p1.getName()+"("+p1.getCode()+")"+" �ȸ�����:"+p1.getSoldNum()+", �����:"+p1.getStockNum());
		System.out.println(p2.getName()+"("+p2.getCode()+")"+" �ȸ�����:"+p2.getSoldNum()+", �����:"+p2.getStockNum());



	}

}

