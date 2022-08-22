package chapter12_Collection.treemap;

import java.util.Iterator;
import java.util.TreeMap;

import chapter12_Collection.Member;

public class MemberTreeMap{
	// key로 int, value로 Member를 가지는 TreeMap 타입의 객체 생성
	private TreeMap<Integer, Member> treemap;
	
	// MemberTreeMap 객체를 생성하면 TreeMap 타입의 객체 생성
	public MemberTreeMap() {
		treemap = new TreeMap<>();
	}
	
	// Member의 정보를 입력하는 void형 메서드
	public void addMember(Member member) {
		treemap.put(member.getMemberID(), member);
	}
	
	// memberID를 검색했을 때 있을 경우 삭제하는 boolean형 메서드
	public boolean removeMember(int memberID) {
		if(treemap.containsKey(memberID)) {
			treemap.remove(memberID);
			return true;
		} else {
			System.out.println(memberID+"가 없습니다.");
			return false;
		}
	}	
	
	// 회원 정보를 호출하는 void형 메서드
	// 1. Integer 타입의 Iterator 객체 생성 (객체의 키 값을 iterator() 메서드로 설정함)
	// 2. 값이 있을 경우 
	public void showAllMember() {
		Iterator<Integer> ir = treemap.keySet().iterator();
		while(ir.hasNext()) {
			int key = ir.next();
			Member member = treemap.get(key);
			System.out.println(member);
		}	
		System.out.println();
	}
	
}
