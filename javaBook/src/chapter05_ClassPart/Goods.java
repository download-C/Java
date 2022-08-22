package chapter05_ClassPart;

public class Goods {
	
	String name; 		// ��ǰ��
	String code;		// ��ǰ�ڵ�(���ĺ��� �� �� �ֱ� ������ String���� ����)
	int soldNum;		// �ȸ� ������ ��
	int stockNum;		// ���� ������ ��
	
	public Goods() {}

	public Goods(String name, String code, int soldNum, int stockNum) {
		super();
		this.name = name;
		this.code = code;
		this.soldNum = soldNum;
		this.stockNum = stockNum;
	}

	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getCode() {
		return code;
	}



	public void setCode(String code) {
		this.code = code;
	}



	public int getSoldNum() {
		return soldNum;
	}



	public void setSoldNum(int soldNum) {
		this.soldNum = soldNum;
	}



	public int getStockNum() {
		return stockNum;
	}



	public void setStockNum(int stockNum) {
		this.stockNum = stockNum;
	}
	
	

	
	
}
