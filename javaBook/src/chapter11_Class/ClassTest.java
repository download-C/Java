package chapter11_Class;

public class ClassTest {

	public static void main(String[] args) throws ClassNotFoundException {
	  /* forName() 메서드에 발생할 수 있는 예외 처리
	   이름과 일치하는 클래스가 없을 경우 오류로 처리하지 않고
       ClassNotFoundException으로 처리하고 다른 부분은 그대로 실행 */
		
		Person person = new Person();
		
		// 1. getClass() 메서드 사용하기
		Class pClass1 = person.getClass();
		System.out.println(pClass1.getName());
		
		// 2. 직접 class 파일 대입하기
		Class pClass2 = Person.class;
		System.out.println(pClass2.getName());
		
		// 3. Class.forName() 메서드 사용하기
		Class pClass3 = Class.forName("chapter11_Class.Person");
		System.out.println(pClass3.getName());
		
	}

}
