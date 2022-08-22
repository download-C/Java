package chapter07_Array;

// 208쪽 도서관 객체 배열 만들기(2)

public class BookArray {

	public static void main(String[] args) {
		Book[] library = new Book[5];
		
		for(int i=0; i<library.length; i++) {
			System.out.println(library[i]);
		}
		

	}

}
