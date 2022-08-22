package chapter05_ClassPart;


public class MyDate {
	
	private int day;
	private int month;
	private int year;
	

	
	
	public int getDay() {
		return day;
	}
	public void setDay(int day) {
		if(month == 2) {
			if(day < 1 || day> 28) {
				
			} 
		} else {
			this.day = day;
		}		
	}
	
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	
	public MyDate(int mday, int mmonth, int myear) {
		day = mday;
		month = mmonth;
		year = myear;

	}
	
	public boolean isValid( ) {
		
		
		if(month==2) {
			if(day < 1 || day > 28) {
			}
		return false;
			
		} else {
			
		}	
		return true;
		
	}
		

	
}
