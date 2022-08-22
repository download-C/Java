package chapter11_String;

// 주민번호의 문자 수 확인하기

public class StringLengthEx {

	public static void main(String[] args) {
		String ssn = "7309241230123";
		int length = ssn.length();
		if(length==13) {
			System.out.println("주민번호 자리수가 맞습니다.");
		} else {
			System.out.println("주민번호 자리수가 맞지 않습니다.");
		}
	}

}
