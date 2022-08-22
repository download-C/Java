package chapter11_String;

public class StringCharAtEx2 {
	
	public static void main(String[] args) {
		
		String ssn = "921007-2222222";
		
		char sex = ssn.charAt(7);
		
		switch(sex) {
		case '1', '3': System.out.println("남자입니다.");
		case '2', '4': System.out.println("여자입니다.");
		default : System.out.println("주민번호가 잘못되었습니다.");
		}
	}
}
