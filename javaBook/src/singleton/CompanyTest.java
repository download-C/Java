package singleton;

// 195�� ������ �ּҰ� ���ϱ�

public class CompanyTest {

	public static void main(String[] args) {
		// Company�� static �ν��Ͻ��� �ֱ� ������ �����ڸ� �߰��� ���� �� ��� 
		// Company.getInstance(������ �ν��Ͻ��� �ҷ����� �޼���)�� �ҷ��ͼ� ������ ��.
		Company myCompany1 = Company.getInstance();
		Company myCompany2 = Company.getInstance();
		
		System.out.println(myCompany1);
		System.out.println(myCompany2);
		System.out.println(myCompany1==myCompany2);
		// myCompany1�� myCompany2�� static���� ������ �ϳ��� �ν��Ͻ�(instance)�� �����ϱ� ������ �ּҰ��� ����

	}

}
