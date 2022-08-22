package chapter11_Object;

import java.util.Objects;

class MyDate {
	int day;
	int month;
	int year;
	
	public MyDate(int day, int month, int year) {
		this.day = day;
		this.month = month;
		this.year = year;
	}
	


	@Override
	public int hashCode() {
		return Objects.hash(day);
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof MyDate)) {
			return false;
		}
		MyDate other = (MyDate) obj;
		return day == other.day && month == other.month && year == other.year;
	}

}

public class MyDateTest {

	public static void main(String[] args) {
		MyDate date1 = new MyDate(9, 18, 2004);
		MyDate date2 = new MyDate(9, 18, 2004);
		System.out.println("==== 데이터 비교 ====");
		System.out.println(date1.equals(date2));
		System.out.println("==== 해시코드 재정의 후 비교 ====");
		System.out.println(date1.hashCode());
		System.out.println(date2.hashCode());
	}

}
