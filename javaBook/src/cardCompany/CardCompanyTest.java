package cardCompany;

//197�� �������� 6��

public class CardCompanyTest {

	public static void main(String[] args) {
		
		CardCompany cc = CardCompany.getCc(); // static getCc�� �̿��� ������ �ν��Ͻ� �����. Ŭ������.getCc�� �� �� ����.
		
		Card c1 = cc.createCard();
		Card c2 = cc.createCard();
		Card c3 = cc.createCard();
		Card c4 = cc.createCard();
			
		System.out.println(c1.serialNum+" "+c2.serialNum+" "+c3.serialNum+" "+c4.serialNum); // 3 3 3
		System.out.println(c1.cardID+" "+c2.cardID+" "+c3.cardID+" "+c4.cardID); // 1 2 3
		
		


	}

}
