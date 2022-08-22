package chapter11_String;

// 주민번호 뒷자리 첫 번째 숫자로 성별 구분하기

public class StringCharAtEx {
	public static void main(String[] args) {
		String ssn = "010624-1230123";
		char sex = ssn.charAt(7); // ssn이라는 데이터에 들어간 인덱스7번의 값
		switch(sex) {
			case '1','3': System.out.println("남자입니다.");
				break;
			case '2','4': System.out.println("여자입니다");
				break;
			default: System.out.println("주민번호가 잘못되었습니다.");
		}
		
		
		
	}
}
