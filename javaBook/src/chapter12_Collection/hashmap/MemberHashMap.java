package chapter12_Collection.hashmap;

import java.util.HashMap;
import java.util.Iterator;

import chapter12_Collection.Member;

public class MemberHashMap {
	private HashMap<Integer, Member> hashmap;
	
	MemberHashMap() {
		hashmap = new HashMap<>();
	}
	// MeberHashMap 타입의 객체 생성 시 memberID를 키로 하는 멤버 정보(아이디, 이름) 추가
	public void addMember(Member member) {
		hashmap.put(member.getMemberID(), member);
	}
	
	// memberID를 검색해서 있을 경우 해당 데이터 지우기
	public boolean removeMember(int memberID) {
		if(hashmap.containsKey(memberID)) {
			hashmap.remove(memberID);
			return true;
		} 
		System.out.println(memberID+"가 없습니다.");
		return false;
	}
	
	// 멤버 정보 출력
	// Iterator 객체 생성하여 keySet을 차례대로 불러온 뒤, 
	// 그 값의 다음 값이 있을 경우 다음 값을 가져와서 멤버 정보 출력
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
