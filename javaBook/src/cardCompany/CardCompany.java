package cardCompany;

// 197�� �������� 6��

public class CardCompany {
	String name;
	Card card;
	int cardNum;
	
	private CardCompany() {
		
	}
	
	private static CardCompany cc = new CardCompany();

	public static CardCompany getCc() {
		return cc;
	}
	
	Card createCard() {
		return new Card();
	}

	
	
	
	
}
