package chapter12_Collection;

import java.util.Objects;

// 407쪽 Member 클래스 구현하기

public class Member implements Comparable<Member> {

	private int memberID;
	private String memberName;
	
	public Member(int memberID, String memberName) {
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
		if (!(obj instanceof Member)) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		Member other = (Member) obj;
		System.out.println("아이디 "+memberID+"는 이미 존재하는 아이디입니다.");
		return memberID == other.memberID;
	}

	@Override
	public int compareTo(Member member) {
		// 오름차순 정렬
		return (this.memberName.compareTo(member.memberName));
	}
}
