package chapter11_Wrappe;

public class TestBoxing {

	public static void main(String[] args) {
		
		Integer num1 = new Integer(100);
		int num2 = 200;
		int sum = num1+num2; // 객체 타입인 num1이 rum.intValue(num1)로 언박싱됨
		Integer num3 = num2;
		
		System.out.println("num1: "+num1); 
		System.out.println("num2: "+num2);
		System.out.println("num3: "+num3);
	}

}
