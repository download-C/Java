package singleton;

// 194�� Company Ŭ���� �����ϱ�

public class Company {
	
	private Company() {}
	
	private static Company instance = new Company();  
	// Company Ŭ������ �̿��� instance��� �̸��� �ν��Ͻ� ����. 
	// static�� �ٿ� Company�� �̿��� �߰����� �ν��Ͻ� ���� ����
	
	public static Company getInstance() {
		if(instance == null) {
			instance = new Company();
		}
		return instance;
	}
	
}
