package chapter11_String;

public class StringEqualsEx {

	public static void main(String[] args) {
		String strVal1 = new String("신민철");
		String strVal2 = "신민철";
		
		// ==는 인스턴스의 주소가 같은지 확인
		if(strVal1==strVal2) { 
			System.out.println("같은 String 객체 참조");
		} else {
			System.out.println("다른 String 객체 참조");
		}
		
		// String.eqauls()는 내용이 같은지 확인
		if(strVal1.equals(strVal2)) { 
			System.out.println("같은 문자열을 가리킴");
		} else {
			System.out.println("다른 문자열을 가리킴");
		}
	}

}
