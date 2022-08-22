package chapter11_String;

public class StringBuilderTest {

	public static void main(String[] args) {
		// javaStr 인스턴스에 "Java"라는 문자열 대입
		String javaStr = new String("Java");
		System.out.println("javaStr 문자열 주소: "+System.identityHashCode(javaStr));
		
		// String으로부터 StringBuilder 생성
		StringBuilder buffer = new StringBuilder(javaStr);
		System.out.println("연산 전 buffer 메모리 주소: "+System.identityHashCode(buffer));
		
		// 문자열 3번 추가
		buffer.append(" and");
		buffer.append(" Android");
		buffer.append(" Programming is fun!");
		System.out.println("연산 후 buffer 메모리 주소: "+System.identityHashCode(buffer));
		
		// 원래 javaStr 문자열에 buffer로 추가한 문자열 대입
		javaStr = buffer.toString();
		System.out.println(javaStr);
		System.out.println("바뀐 javaStr 문자열 주소: "+System.identityHashCode(javaStr));
	}

}
