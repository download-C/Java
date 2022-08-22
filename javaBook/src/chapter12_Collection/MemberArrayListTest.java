package chapter12_Collection;

import chapter12_Collection.arraylist.MemberArrayList;

public class MemberArrayListTest {

	public static void main(String[] args) {
		// MemeberArrayList 객체 생성을 배열 생성 -> Member 객체 자동 생성
		MemberArrayList mal = new MemberArrayList();
		
		// 회원 아이디와 이름을 갖고 있는 Member 타입의 객체 생성
		Member mLee = new Member(1001, "이지원");
		Member mSon = new Member(1002, "손민국");
		Member mPark = new Member(1003, "박서훤");
		Member mHong = new Member(1004, "홍길동");
		Member mChoi = new Member(1010, "최다운");
		
		//addMember()를 통해 회원 정보(아이디, 이름) 하나씩 추가 
		mal.addMember(mLee);
		mal.addMember(mSon);
		mal.addMember(mPark);
		mal.addMember(mHong);
		
		// 모든 회원의 정보 출력
		mal.showAllMember();
		
		// 이름이 "홍길동"인 사람의 ID를 찾아서 삭제
		mal.removeMember(mHong.getMemberID());
		
		// 모든 회원의 정보 출력
		mal.showAllMember();
		
		// 해당 인덱스에 값을 추가하는 메서드 사용
		mal.insertMember(1, mChoi);
		mal.showAllMember();
		
	}

}
