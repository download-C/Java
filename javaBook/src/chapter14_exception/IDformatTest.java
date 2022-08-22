package chapter14_exception;

public class IDformatTest {
	private String userID;
	
	public String getID() {
		return userID;
	}
	
	public void setUserID(String userID) throws IDFormatException {
		if(userID==null) {
			throw new IDFormatException("아이디는 null일 수 없습니다");
		} else if(userID.length()<8 || userID.length()>20) {
			throw new IDFormatException("아이디는 8글자 이상 20글자 이하로 쓰세요");
		}
		
		this.userID = userID;
	}
	
	public static void main(String[] args) {
		IDformatTest test = new IDformatTest();
		
		String userID = null;  // 아이디가 null인 경우 가정하여 테스트하기
		try {
			test.setUserID(userID);
		} catch (IDFormatException e) {
			System.out.println(e.getMessage());
		}
		
		userID = "1234567"; // 아이디가 8자 이하인 경우 가정하여 테스트하기
		try {
			test.setUserID(userID);
		} catch (IDFormatException e) {
			System.out.println(e.getMessage()); 
		}
	}

}
