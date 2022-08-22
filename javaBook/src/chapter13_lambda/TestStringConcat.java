package chapter13_lambda;

public class TestStringConcat {

	public static void main(String[] args) {
		
		// StringConcat 인터페이스를 구현한 StringConcatImpl로 객체 생성
		StringConcatImpl concat1 = new StringConcatImpl();
		String s1 = "HELLO";
		String s2 = "WORLD";
		// 재정의한 메서드 makingString() 호출
		concat1.makeString(s1,s2);
		
		// 함수형 인터페이스로 객체 생성하여 단일 메서드 재정의
		StringConcat concat2 = (s,v) -> System.out.println(s+" "+v);
		// 재정의한 메서드 makingString() 호출
		concat2.makeString(s1, s2);
	}

}
