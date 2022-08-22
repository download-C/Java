package chapter10_bookshelf;

public class bookShelfTest {

	public static void main(String[] args) {
		bookShelf bs = new bookShelf();
		bs.enQueue("태백산맥1");
		bs.enQueue("태백산맥2");
		bs.enQueue("태백산맥3");
		System.out.println("배열에 들어간 개수: "+bs.getSize());
		System.out.println(bs.deQueue());
		System.out.println(bs.deQueue());
		System.out.println(bs.deQueue());
		System.out.println("배열에 남은 개수: "+bs.getSize());
		
		
	}

}
