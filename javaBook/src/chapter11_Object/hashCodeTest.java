package chapter11_Object;

public class hashCodeTest {

	public static void main(String[] args) {
		String str1 = new String("abc");
		String str2 = new String("abc");
		
		System.out.println("==== String 클래스의 해시코드 비교 ====");
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
		
		Integer i1 = new Integer(100);
		Integer i2 = new Integer(100);
		
		System.out.println("==== Integer 클래스의 해시코드 비교 ====");
		System.out.println(i1.hashCode());
		System.out.println(i2.hashCode());
		
	}

}
