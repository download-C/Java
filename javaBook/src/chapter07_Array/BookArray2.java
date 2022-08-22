package chapter07_Array;

import java.util.Scanner;

// 209쪽 도서관 객체 배열 만들기(3)

public class BookArray2 {

	public static void main(String[] args) {
		Book[] library = new Book[5];
		int i=0;
		
		library[0]=new Book("태백산맥", "조정래");
		library[1]=new Book("데미안", "헤르만 헤세");
		library[2]=new Book("어떻게 살 것인가", "유시민");
		library[3]=new Book("토지", "박경리");
		library[4]=new Book("어린왕자", "생택쥐페리");	
	
		for(i=0; i<library.length; i++) {
			library[i].showInfo();
		}
		System.out.println();
		
//		for(i=0; i<library.length; i++) {
//			System.out.println("library["+i+"]의 주소값: "+library[i]);
//		}
//		
		// 사용자가 책 제목을 입력하면 있는지 출력
		Scanner sc = new Scanner(System.in);
		System.out.println("검색하고자 하는 책의 이름을 입력하세요");
		String title= sc.nextLine();
		
		// 스캐너 잘 되는지 확인
//		System.out.println("입력하신 책의 제목은 <"+title+">입니다");
		
		// 책의 제목이 일치하는지 여부를 확인하기 위해 boolean 타입을 넣어주고 일치하는지 확인
		boolean isBook = false;
		for(i=0; i<library.length; i++) {
			if( title.equals(library[i].getBookName()) ) {		
				isBook=true;
				break;
			} 
		}	
		
		// 책 제목이 있는지 확인한 뒤 isBook이 true일 경우 정보 출력, false일 경우는 책이 없음을 출력
		if(isBook) 	 {
			System.out.println("검색하신 책 <"+title+">이/가 있습니다.");
			System.out.println("검색하신 "+title+"의 저자는 <"+library[i].getAuthor()+">입니다");
		} else System.out.println("검색하신 책이 없습니다");
		
		
		
		
	}
	
}


