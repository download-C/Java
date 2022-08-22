package chapter06_ClassAndObject;

// 172�� this�� �ٸ� ������ ȣ���ϱ�

class Person {
	
	String name;
	int age;
	
	Person() {
		this( "�̸� ����", 1 );
	}
	
	Person( String name, int age ) {
		this.name = name;
		this.age = age;
	}
	
	
	Person returnItSelf() {		// �ݵ�� �ڽ��� �����ִ� Ŭ����(Person)�� �ڷ������� ��� ��.
		return this;			// -> teturnItSelf() ��� �޼��带 ����ϸ� �ڱ� �ڽ��� �ּҰ�(this)�� ��ȯ��.
	}
	
}

public class CallAnotherConst {

	public static void main(String[] args) {
		Person noName = new Person();
		System.out.println( noName.name );
		System.out.println( noName.age );
		
		Person p = noName;
		System.out.println(noName);
		System.out.println(p.returnItSelf());
		
		Person p2 = noName.returnItSelf();
		System.out.println(p2.returnItSelf());
	}

}
