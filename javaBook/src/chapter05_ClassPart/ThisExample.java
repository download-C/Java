package chapter05_ClassPart;


class BirthDay {
	int year;
	int month;
	int day;


	public void setYear(int year) {
		this.year = year;
	}
	public void printThis() {
		System.out.println(this);
	}

}

public class ThisExample {

	public static void main(String[] args) {
		// 170�� this ����ϱ�
		
		BirthDay bday = new BirthDay();
		bday.setYear(2000);
		System.out.println(bday);
		bday.printThis();
		
		

	}
}

