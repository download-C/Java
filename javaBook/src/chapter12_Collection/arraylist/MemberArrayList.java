package chapter12_Collection.arraylist;

import java.util.ArrayList;
import java.util.Iterator;

import chapter12_Collection.Member;  // 다른 패키지에 있는 메서드 사용을 위해 import

public class MemberArrayList {
	// ArrayList 선언
	private ArrayList<Member> arraylist;

	// 객체 생성 시 Member 타입의 ArrayList 생성
	public MemberArrayList() {
		arraylist = new ArrayList<Member>();
	}
	
	// ArrayList에 회원을 추가하는 메서드
	public void addMember(Member member){
		arraylist.add(member);
	}
	
	// for문으로 ArrayList 안에 해당 아이디를 가진 회원을 삭제하는 메서드
/*	public boolean removeMember(int memberID) {
*		for(int i=0; i<arraylist.size(); i++) {
*			Member member = arraylist.get(i);
*			int tempId = member.getMemberId();
*			if(tempId == memberID) {
*				System.out.println(i+"번에서 "+member.getMemberName()
*						+" 회원님의 아이디 "+memberID+"를 찾아 삭제합니다.");
*				System.out.println();
*				arraylist.remove(i);
*				return true;
*			}
		}															*/
	// 422쪽 While문으로 Iterator 라이브러리의 hasNext()와 next()를 이용하여 수정하기
	public boolean removeMember(int memberID) {
		Iterator<Member> ir = arraylist.iterator();		// Iterator 반환
		while(ir.hasNext()) {							// 요소가 있는 동안
		Member member = ir.next();						// 다음 회원 반환
			int tempId = member.getMemberID();			
			if(tempId==memberID) {						// 회원 아이디가 매개변수와 일치할 경우
				arraylist.remove(member);				// 해당 회원 삭제
				return true;							// true 반환
			}
		}
		
		// 반복문이 끝날 때까지 해당 아이디를 찾지 못한 경우
		System.out.println(memberID+"가 존재하지 않습니다.");
		return false;
	}
	
	// 전체 회원의 아이디와 이름을 출력하는 메서드.
	public void showAllMember() {
		for(Member member: arraylist) {
			System.out.println(member);
		}
		System.out.println();
	}
	
	public void insertMember(int index, Member member) {
			System.out.println(index+"번 자리에 데이터를 추가합니다.");
			System.out.println();
			arraylist.add(index-1, member);
	}
	
	
}
