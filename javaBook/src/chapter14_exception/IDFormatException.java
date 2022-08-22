package chapter14_exception;

public class IDFormatException extends Exception{
	public IDFormatException(String message) {
		super(message); // Exception 클래스에서 메세지 생성자, 멤버변수, 메서드가 있기 때문에 
						// super(message)를 사용하여 예외 상황 메세지를 생성자에서 입력 받음.
	}
}
