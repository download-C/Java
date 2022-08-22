package chapter11_String;

public class splitEx {

	public static void main(String[] args) {
		String str = "홍길동 김길동 고길동";
		String[] splitStr = str.split(" ");
		for(String name: splitStr) {
			System.out.println(name);
		}
		System.out.println();
		String str2 = "홍길동a김길동b고길동c";
		String[] splitStr2 = str2.split("[a-z]");
		for(String name: splitStr2) {
			System.out.println(name);
		}
	}

}
