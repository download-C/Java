package chapter12_Collection.treeset;

import chapter12_Collection.Member;

public class MemberTreeSetTest {

	public static void main(String[] args) {
		MemberTreeSet mts = new MemberTreeSet();
		Member mPark = new Member(1003, "박서훤");
		Member mLee = new Member(1001, "이지원");
		Member mSon = new Member(1002, "손민국");
		
		// MemberTreeSet 클래스의 addMember() 메서드에서 오류 발생 
		//     -> TreeSet 라이브러리의 add() 메서드에서 오류 발생
		//     -> TreeSet 라이브러리를 사용한 MemberTreeSet 클래스는 정렬을 위해 
		//		  비교 기준(memberID 또는 memberName)을 정해주어야 함.
		mts.addMember(mPark);
		mts.addMember(mLee);
		mts.addMember(mSon);
		mts.addMember(mSon);
		
		mts.showAllMember();
	}

}
