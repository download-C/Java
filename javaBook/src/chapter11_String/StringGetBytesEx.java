package chapter11_String;

import java.io.UnsupportedEncodingException;

// String을  byte[]로 변환

public class StringGetBytesEx {

	public static void main(String[] args) {
		String str = "안녕하세요";
		
		// 기본 문자셋으로 인코딩 및 디코딩
		// 인코딩
		byte[] bytes1 = str.getBytes();
		System.out.println("bytes1.length: "+bytes1.length);
		// 디코딩
		String str1 = new String(bytes1);
		System.out.println("bytes1 -> str1: "+str1);
		
		try {
			// "안녕하세요"를 EUC-KR로 인코딩 및 디코딩
			byte[] bytes2 = str.getBytes("EUC-KR");
			System.out.println("bytes2.length: "+bytes2.length);
			// 디코딩 할 때는 인코딩했던 문자셋을 적어줘야함.
			String str2 = new String(bytes2, "EUC-KR");
			System.out.println("bytes2 -> str2: "+str2);
			
			// "안녕하세요"를 UTF-8로 인코딩 및 디코딩
			byte[] bytes3 = str.getBytes("UTF-8");
			System.out.println("bytes3.length: "+bytes3.length);
			// 디코딩 할 때는 인코딩했던 문자셋을 적어줘야함.
			String str3 = new String(bytes3, "UTF-8");
			System.out.println("bytes3 -> str3: "+str3);
			
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}

	}

}
