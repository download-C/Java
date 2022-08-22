package chapter11_Object;

class Book {
	int bookNumber;
	String bookTitle;
	
	public Book(int bookNumber, String bookTitle) {
		this.bookNumber = bookNumber;
		this.bookTitle = bookTitle;
	}

	@Override
	public String toString() {
		return bookNumber+", "+bookTitle;
	}
	
}

public class toStringEx {
	public static void main(String[] args) {
		Book b1 = new Book(200, "개미");
		
		System.out.println(b1);
		System.out.println(b1.toString());
		
	}
}


