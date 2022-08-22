package chapter14_exception;

public class PasswordExceptionTest {
	private String userPW;
	
	public String getUserPW() {
		return userPW;
	}
	
	public void setUserPW(String userPW) throws PasswordException {
		
		if (userPW == null) {
			throw new PasswordException("비밀번호는 null일 수 없습니다.");
		} else if (userPW.length() < 5) {
			throw new PasswordException("비밀번호는 5자 이상이어야 합니다.");
		} else if (userPW.matches("[a-zA-Z가-힣]+")) {
			throw new PasswordException("비밀번호는 영어 대소문자와 숫자, 특수문자로 구성되어야 합니다.");
		}
		
		this.userPW = userPW;
	}

	public static void main(String[] args) {
		PasswordExceptionTest test = new PasswordExceptionTest();
		// 비밀번호가 null일 때
		String userPW1 = null;
		try {
			test.setUserPW(userPW1);
		} catch (PasswordException e) {
			System.out.println(e.getMessage());
		}
		// 비밀번호가 5자리 미만일 때
		String userPW2 = "aaa";
		try {
			test.setUserPW(userPW2);
		} catch (PasswordException e) {
			System.out.println(e.getMessage());
		}
		// 비밀번호가 문자로만 이루어져있을 때
		String userPW3 = "가나다라마";
		try {
			test.setUserPW(userPW3);
		} catch (PasswordException e) {
			System.out.println(e.getMessage());
		}
		
		
	}

}
