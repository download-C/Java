package chapter11_String;

// 문자열 대치하기

public class StringReplaceEx {

	public static void main(String[] args) {
		String oldStr = "자바는 객체 지향 언어입니다.";
		String newStr = oldStr.replace("자바", "JAVA");   
		System.out.println(oldStr);
		System.out.println(newStr);
		
		
	}

}
