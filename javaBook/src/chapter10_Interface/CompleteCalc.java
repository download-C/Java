package chapter10_Interface;

// 317쪽 계산기 클래스 만들기

public class CompleteCalc extends Calculator {

	@Override
	public int times(int num1, int num2) {
		return num1*num2;
	}

	@Override
	public int divide(int num1, int num2) {
		if(num2 != 0) {
			return num1/num2;
		} else {
			return ERROR;  // 인터페이스 안의 상수는 final static이 생략되어 있어 클래스를 통한 호출 없이 바로 사용 가능.
		}
	}
	
	public void showInfo() {
		System.out.println("Calc 인터페이스를 구현하였습니다.");
	}

	@Override
	public int square(int num) {
		// TODO Auto-generated method stub
		return num*num;
	}
	
	public void description() {
		super.dercription();
	}
	

}
