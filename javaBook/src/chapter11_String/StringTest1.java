package chapter11_String;

public class StringTest1 {

	public static void main(String[] args) {
		String st1 = new String("abc");
		String st2 = new String("abc");
		
		System.out.println(st1 == st2 ); 	  // 주소값 비교이기 때문에 false
		System.out.println(st1.equals(st2));  // 데이터 비교이기 때문에 true
		
		String st3 = "abc";
		String st4 = "abc";
		
		System.out.println(st3 == st4);       // 같은 상수 풀에 생성되기 때문에 true
		System.out.println(st3.equals(st4));  // 데이터 비교이기 때문에 true
		
	}

}
