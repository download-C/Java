package cardCompany;

// 197�� �������� 6��

public class Card {
	static int serialNum;
	int cardID;
	
	Card() {
		serialNum++;
		cardID = serialNum;
	}

}
