package chapter12_Collection.hashset;

import chapter12_Collection.Member;

public class MemberHashSetTest {

	public static void main(String[] args) {	
		MemberHashSet mhs = new MemberHashSet(); // MemberHashSet 객체 생성을 통해 HashSet 타입의 생성
		
		Member mLee = new Member(1001, "최다운");
		Member mSon = new Member(1002, "정인혜");
		Member mPark = new Member(1003, "김다은");
		
		mhs.addMember(mLee);
		mhs.addMember(mSon);
		mhs.addMember(mPark);
		mhs.showAllMember();
		
		Member mHong = new Member(1003,"김명진");   // 중복된 아이디에 멤버 타입 변수 넣기 1003
		mhs.addMember(mHong);
		mhs.showAllMember();
		
	}

}
