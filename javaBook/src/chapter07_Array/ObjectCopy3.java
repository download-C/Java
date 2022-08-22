package chapter07_Array;

// 216쪽 객체 배열의 깊은 복사 (미리 각 배열마다 디폴트 생성자를 만들어두면 첫 번째 배열을 수정해도 복사한 배열의 값은 변하지 않음)

public class ObjectCopy3 {

	public static void main(String[] args) {
		Book[] bookArray1 = new Book[3];
		Book[] bookArray2 = new Book[3];
		
		bookArray1[0] = new Book("태백산맥", "조정래");
		bookArray1[1] = new Book("데미안", "헤르만 헤세");
		bookArray1[2] = new Book("어떻게 살 것인가", "유시민");
		
		bookArray2[0] = new Book();
		bookArray2[1] = new Book();
		bookArray2[2] = new Book();
		
		
		for(int i=0; i<bookArray2.length; i++) {
			bookArray2[i].setBookName(bookArray1[i].getBookName());
			bookArray2[i].setAuthor(bookArray1[i].getAuthor());
		}
		
		for(int i=0; i<bookArray2.length; i++) {
			bookArray2[i].showInfo();
		}
		
		bookArray1[0].setBookName("나목");
		bookArray1[0].setAuthor("박완서");
		
		System.out.println("===bookArray1===");
		for(int i=0; i<bookArray1.length; i++) {
			bookArray1[i].showInfo();
		}
		
		System.out.println("===bookArray2===");
		for(int i=0; i<bookArray2.length; i++) {
			bookArray2[i].showInfo();
		}

	}

}
