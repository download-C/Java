package chapter15_stream.inputstream;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamTest1 {

	public static void main(String[] args) {
		FileInputStream fis = null;
		
		try {
			fis = new FileInputStream("input.txt");
			System.out.println(fis.read());
			System.out.println(fis.read());
			System.out.println(fis.read());
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fis.close();	// 열린 스트림은 finally 블록에서 닫음.
			} catch (IOException e) {
				e.printStackTrace();
			} catch (NullPointerException e) { // 스트림이 null인 경우
				System.out.println(e);
			}
		}
	
	}

}
