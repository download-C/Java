package chapter12_Collection.hashmap;

import chapter12_Collection.Member;

public class MemberHashMapTest {

	public static void main(String[] args) {
		MemberHashMap mhm = new MemberHashMap();
		Member mLee = new Member(1001, "이지원");
		Member mHong= new Member(1004, "홍길동");
		Member mPark = new Member(1003, "박서훤");
		Member mSon = new Member(1002, "손민국");
	
		mhm.addMember(mSon);
		mhm.addMember(mPark);
		mhm.addMember(mHong);
		mhm.addMember(mLee);
		
//		mhm.removeMember(1004);
		mhm.showAllMember();
		
	}

}
