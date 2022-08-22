package chapter12_Collection.treemap;

import chapter12_Collection.Member;

public class MemberTreeMapTest {

	public static void main(String[] args) {
		MemberTreeMap mtm = new MemberTreeMap();
		
		Member mPark = new Member(1003, "박서훤");
		Member mLee = new Member(1001, "이지원");
		Member mHong = new Member(1004, "홍길동");
		Member mSon = new Member(1002, "손민국");
		
		mtm.addMember(mPark);
		mtm.addMember(mLee);
		mtm.addMember(mHong);
		mtm.addMember(mSon);
		
		mtm.showAllMember();
		
		mtm.removeMember(1003);
		
		mtm.showAllMember();
	}

}
