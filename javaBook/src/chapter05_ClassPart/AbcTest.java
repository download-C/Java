package chapter05_ClassPart;

class Abc {
	
	int a;
	char b;
	String s;

	Abc() {}  		// ����Ʈ ������
	
	Abc(int a) {}	// �Ű� ������ ���� �Է��� ������
	
	Abc(int a, char b, String s) { // �����ε�(������ �̸��� ������ �Ű������� �ٸ��� ������ �ٸ� �޼���� �ν�)
		this.a = a;
		this.b = b;
		this.s = s;
	} 
	
	void methodA() {
		System.out.println("I'm methodA");
	}
	
	String methodB() {
		return "I'm methodB";
	}
}

public class AbcTest {
	
	public static void main(String[] args) {
		
		Abc abc1 = new Abc();					// �����ڱ� ���� �Է��� ����Ʈ ������ 
			abc1.a = 1;
			abc1.s = "ABC";
			
		Abc abc2 = new Abc(1);					// �Ű������� �� ���� ������ ȣ���Ͽ� ��ü ����
			abc2.methodA(); // I'm methodA
			System.out.println( abc2.methodB() );	// String Ÿ���� ������ return�ϱ� ������ print�� �־��־�� ���
		
		Abc abc3 = new Abc(10, 'a', "ABC");		// �Ű������� �� ���� ������ ȣ���Ͽ� ��ü ����
			abc3.methodA();
			System.out.println(abc3.a+" "+abc3.b+" "+abc3.s);		
		
	}


	
	
}
