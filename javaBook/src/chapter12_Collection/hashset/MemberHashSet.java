package chapter12_Collection.hashset;

import java.util.HashSet;
import java.util.Iterator;
import chapter12_Collection.Member;

public class MemberHashSet {

	private HashSet<Member> hashset; 		 // HashSet 선언
	
	public MemberHashSet() {
		hashset = new HashSet<>();			 // MemberHashSet 타입의 객체 생성과 동시에 HashSet 생성
	}
	
	public void addMember(Member member) {   // HashSet에 Member 타입의 데이터를 넣는 메서드 
		hashset.add(member);
		// ID가 중복되는지 확인 후 넣고 싶으면 Member 클래스에 equals()와 hashcode() 오버라이드 해야 함.
		
	}
	
	public boolean removeMember(int memberID) {		// 매개변수로 들어온 ID를 찾아서 있으면 삭제, 없으면 없다고 출력
		Iterator<Member> ir = hashset.iterator();
		Member member = ir.next();
		int tempID = member.getMemberID();
		if(tempID==memberID) {
			hashset.remove(member);
			return true;
		} else {
			System.out.println(memberID+"가 존재하지 않습니다.");
			return false;
		}
	}
	
	public void showAllMember() {			// 모든 회원들의 정보 출력 
		for(Member member: hashset) {
			System.out.println(member);
		} System.out.println();
	}
}
