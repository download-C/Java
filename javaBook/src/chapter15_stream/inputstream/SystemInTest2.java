package chapter15_stream.inputstream;

import java.io.IOException;

// 516쪽 문자 여러 개를 입력받기

public class SystemInTest2 {

	public static void main(String[] args) {
		System.out.println("원하는 단어를 쓰고 Enter키를 누르세요.");
		
		int i;
		try {
			while(( i = System.in.read()) != -1) { // \n, -1은 엔터키를 의미함.
				System.out.print((char)i);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
