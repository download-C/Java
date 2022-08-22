package chapter11_String;

import java.io.IOException;

public class KeyboardToStringEx {

	public static void main(String[] args) throws IOException {
		byte[] bytes = new byte[10];
		
		System.out.println("입력: ");
		int readByteNo = System.in.read(bytes);
		
		// bytes 배열 출력, 0번부터 시작, 엔터키를 쳤을 때 들어가는 10, 13 빼기
		// 가나다라 -> byte[0]='ㄱ', byte[1]='ㅏ', byte[2]=10, byte[3]=13, byte[4]='ㄴ', 
		// 			   byte[5]='ㅏ', byte[6]='10', byte[7]='13', byte[8]='ㄷ,' byte[9]='ㅏ'
		String str = new String(bytes, 0, readByteNo-2);
		// ㄱ+ㅏ+10+13 -> "가", ㄴ+ㅏ+10+13-> "나", ㄷ+ㅏ -> X
		System.out.println(str);
	}

}
