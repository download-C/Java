package selfCoding;

// 197�� �������� 5��

public class CafeTest {

	public static void main(String[] args) {
		Person kim = new Person("��");
		Cafe star = new Cafe();
		star.setCafeName("��Ÿ����");
		kim.goCafe(star);
		star.setMenu("ī���");
		
		kim.showInfo();
		star.showInfo();
		System.out.println();
		
		Person lee = new Person("��");
		Cafe bean = new Cafe();
		bean.setCafeName("Ŀ�Ǻ�");
		lee.goCafe(bean);
		bean.setMenu("ī���");
		
		lee.showInfo();
		bean.showInfo();
		System.out.println();
		
		

	}

}
