package chapter15_stream.inputstream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamTest1 {

	public static void main(String[] args) {
						//OutputStream은 파일이 없을 경우 자동으로 생성
		try(FileOutputStream fos = new FileOutputStream("output.txt")) { 
			fos.write(65);  // A
			fos.write(66);  // B
			fos.write(67);  // C
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("출력이 완료되었습니다.");
	}

}
