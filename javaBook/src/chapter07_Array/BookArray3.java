package chapter07_Array;

import java.util.Scanner;

// 나 혼자 코딩 (책 이름과 저자명을 스캐너로 받기)

public class BookArray3 {

	public static void main(String[] args) {
		int i;
		Book[] library = new Book[5];
		Scanner sc = new Scanner(System.in);
		
		library[0] = new Book();
		library[1] = new Book();
		library[2] = new Book();
		
		for(i=0; i<library.length; i++) {
			System.out.println("등록하고자 하는 "+(i+1)+"번째 책의 제목을 입력하세요");
			library[i].setBookName(sc.nextLine());
			System.out.println("등록하고자 하는 "+(i+1)+"번째 책의 저자를 입력하세요");
			library[i].setAuthor(sc.nextLine());
			System.out.println("책 제목: <"+library[i].getBookName()+">, 저자: <"+library[i].getAuthor()+">)이/가 등록되었습니다.");
//			System.out.println("등록하고자 하는 책의 제목과 작가를 각각 입력하세요");
//			library[i] = new Book(sc.nextLine(), sc.nextLine());
			
		}
		
		for(i=0; i<library.length; i++) {
			System.out.println("입력된 책 정보 ["+(i+1)+"]c : "+library[i].getBookName()+", "+library[i].getAuthor());
		}
		
	}

}
