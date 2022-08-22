package chapter11_Object;

public class StringEquals {

	public static void main(String[] args) {
		String str1 = new String("abc");
		String str2 = new String("abc");
		
		System.out.println(str1 == str2);		// 두 인스턴스의 주소값이 같은지 비교
		System.out.println(str1.equals(str2));  // String 클래스 안의 재정의된 equals() 
												//        -> 문자열이 같은지 비교.
		
		Integer i1 = new Integer(100);
		Integer i2 = new Integer(100);
		
		System.out.println(i1 == i2);			// 두 인스턴스의 주소값이 같은지 비교
		System.out.println(i1.equals(i2));		// Integer 클래스 안의 재정의된 equals() 
												//          -> 정수 값이 같은지 비교.
	} 

}
