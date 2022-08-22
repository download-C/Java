package chapter05_ClassPart;

public class LibraryTest {

	public static void main(String[] args) {
		// Book Ŭ������ ����ϱ�
		
		Book b1 = new Book();  // Book  Ŭ������ ��ü �����ϱ�
		//b1.title = "ȫ�浿";
		//b1.author = "���";
		//b1.price = 1000;
		b1.setTitle("ȫ�浿");
		b1.setAuthor("���");
		b1.setPrice(1000);

		Book b2 = new Book();
		//b2.title = "�鼳����";
		//b2.author = "�̻�";
		//b2.price = 2000;
		b2.setTitle("�鼳����");
		b2.setAuthor("�̻�");
		b2.setPrice(2000);
		
		
		System.out.println(b1.getTitle()+", "+b1.getAuthor()+", "+b1.getPrice());
		System.out.println(b2.getTitle()+", "+b2.getAuthor()+", "+b2.getPrice());

	}

}
