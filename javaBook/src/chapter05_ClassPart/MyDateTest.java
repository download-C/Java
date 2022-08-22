package chapter05_ClassPart;

public class MyDateTest {

	public static void main(String[] args) {
		// 166�� MyDate Ŭ���� �׽�Ʈ
		
//		MyDatePublic datePublic = new MyDatePublic();
//		datePublic.day = 31;		// 2������ 28~29�ϱ����ۿ� ���µ� 31�� ���� ������ �߻����� ����.
//		datePublic.month = 2;
//		datePublic.year = 2022;
//			
//		System.out.println(datePublic.year+"�� "+datePublic.month+"�� "+datePublic.day+"��");
//		
//		MyDate date = new MyDate();
//		
//		date.setYear(2022);
//		date.setMonth(2);
//		date.setDay(31);
//		
//		System.out.println(date.getYear()+"�� "+date.getMonth()+"�� "+date.getDay()+"��");
			
		
		
		MyDate date1 = new MyDate(30, 2, 2000);
		if(date1.isValid() ) {
			System.out.println("��ȿ�� ��¥�Դϴ�.");
		} else {
			System.out.println("��ȿ���� ���� ��¥�Դϴ�.");
		}
		
		MyDate date2 = new MyDate(2, 10, 2006);
		if(date2.isValid() ) {
			System.out.println("��ȿ�� ��¥�Դϴ�.");
		} else {
			System.out.println("��ȿ���� ���� ��¥�Դϴ�.");
		}
		
		
	}

}
