package chapter02_Variable2;

public class ImplictConversion {

	public static void main(String[] args) {
		// ������ �� ��ȯ
		
		byte bNum = 10;
		int iNum = bNum; //byte���� �� ū �ڷ������� �ڵ� �� ��ȯ
		
		System.out.println(bNum);
		System.out.println(iNum);
		
		int iNum2 = 20;
		float fNum = iNum2;
		
		System.out.println(iNum2);
		System.out.println(fNum);
		
		
		double dNum;
		dNum = fNum + iNum;  //1. int�� �� ū �ڷ����� float�� ��ȯ 2. float�� �� ū �ڷ����� double�� ��ȯ
		System.out.println(dNum);
		

	}

}
