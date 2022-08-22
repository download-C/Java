package singleton;

// 195쪽 변수의 주소값 비교하기

public class CompanyTest {

	public static void main(String[] args) {
		// Company는 static 인스턴스가 있기 때문에 생성자를 추가로 만들 수 없어서 
		// Company.getInstance(유일한 인스턴스를 불러오는 메서드)를 불러와서 만들어야 함.
		Company myCompany1 = Company.getInstance();
		Company myCompany2 = Company.getInstance();
		
		System.out.println(myCompany1);
		System.out.println(myCompany2);
		System.out.println(myCompany1==myCompany2);
		// myCompany1과 myCompany2는 static으로 지정된 하나의 인스턴스(instance)를 참조하기 때문에 주소값이 같음

	}

}
