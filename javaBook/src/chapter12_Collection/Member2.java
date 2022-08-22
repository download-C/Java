package chapter12_Collection;

// 436쪽 Comparator 인터페이스 구현하기

import java.util.Comparator;
import java.util.Objects;

public class Member2 implements Comparator<Member2>{
	private int memberID;
	private String memberName;
	
	public Member2(int memberID, String memberName) {
		this.memberID = memberID;
		this.memberName = memberName;
	}

	public int getMemberID() {
		return memberID;
	}

	public void setMemberID(int memberID) {
		this.memberID = memberID;
	}

	public String getMemberName() {
		return memberName;
	}

	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}

	@Override
	public String toString() {
		return memberName+" 회원님의 아이디는 "+memberID+"입니다.";
	}
	
	// memberID의 중복성 여부 확인
	@Override
	public int hashCode() {
		System.out.println("아이디 "+memberID+"의 해시코드값이 중복됩니다.");
		return Objects.hash(memberID);
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof Member2)) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		Member2 other = (Member2) obj;
		System.out.println("아이디 "+memberID+"는 이미 존재하는 아이디입니다.");
		return memberID == other.memberID;
	}
	
	@Override
	public int compare(Member2 mem1, Member2 mem2) {
		return (mem2.getMemberID()-mem1.getMemberID());
	}
	
}
