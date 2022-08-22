package chapter15_stream.inputstream;

// 문자 하나 입력받기

import java.io.IOException;

public class SystemInTest1 {

	public static void main(String[] args) {
		System.out.println("알파벳 하나를 쓰고 Enter키를 누르세요");
		
		int i;
		
		try {
			i = System.in.read();  // 1바이트만 읽어올 수 있음. -> 숫자 또는 알파벳 1글자만 입력됨
			System.out.println("입력값의 유니코드:"+i);
			System.out.println("입력값의 문자:"+(char)i);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
