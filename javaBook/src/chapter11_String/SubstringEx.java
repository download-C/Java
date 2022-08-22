package chapter11_String;

public class SubstringEx {

	public static void main(String[] args) {
		String str = "{abc[def:ghi]jkl}";
		String subStr = str.substring(5, 12); 
		System.out.println(subStr);
		
		String subStr2 = str.substring(str.indexOf('['), str.indexOf(']')+1);
		System.out.println(subStr2);
	}
}
