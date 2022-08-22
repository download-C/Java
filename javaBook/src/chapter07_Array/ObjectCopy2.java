package chapter07_Array;

// 214쪽 객체 배열의 얕은 복사 (배열복사시 중간에 처음 배열을 수정하면 copy한 배열도 함께 수정됨)

public class ObjectCopy2 {

	public static void main(String[] args) {
		Book[] bookArray1 = new Book[3];
		Book[] bookArray2 = new Book[3];
		
		bookArray1[0] = new Book("태백산맥", "조정래");
		bookArray1[1] = new Book("데미안", "헤르만 헤세");
		bookArray1[2] = new Book("어떻게 살 것인가", "유시민");
		System.arraycopy(bookArray1, 0, bookArray2, 0, 3);
		
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
