package chapter12_Collection.hashmap;

import java.util.HashMap;
import java.util.Iterator;

import chapter12_Collection.Member;

public class MemberHashMap2 {
	private HashMap<Integer, Member> hashmap;
	
	// MemberHaspMap 타입의 객체를 생성하면 자동으로 HashMap 생성
	public MemberHashMap2() {
		hashmap = new HashMap<>();
	}
	
	// key 값에 int 타입인 memberID, value값에 Member 타입인 member 넣기
	public void addMember(Member member) {
		hashmap.put(member.getMemberID(), member);
	}
	
	// 배열에서 해당 key값을 찾아 삭제
	public boolean removeMember(int memberID) {
		if(hashmap.containsKey(memberID)) {
			hashmap.remove(memberID);
			return true;
		} 
		System.out.println(memberID+"가 없습니다.");
		return false;
	}
	
	public void showAllMember() {
		Iterator<Integer> ir = hashmap.keySet().iterator();
		while(ir.hasNext()) {
			int key = ir.next();
			Member member = hashmap.get(key);
			System.out.println(member);
		}
		System.out.println();
	}
}	
