package chapter07_Array;

// 206쪽 알파벳 문자와 아스키 코드 값 출력하기

public class charArray {

	public static void main(String[] args) {
		char[] alphabet = new char[26]; 
		char ch = 'A'; 
		int i;

		for(i=0; i<alphabet.length; i++, ch++) {
			alphabet[i] = ch;
		}
		
		for(i=0; i<alphabet.length; i++) {
			System.out.println(alphabet[i]+", "+(int)alphabet[i]);
		}

	}

}
