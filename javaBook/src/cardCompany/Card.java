package cardCompany;

// 197쪽 연습문제 6번

public class Card {
	static int serialNum;
	int cardID;
	
	Card() {
		serialNum++;
		cardID = serialNum;
	}

}
