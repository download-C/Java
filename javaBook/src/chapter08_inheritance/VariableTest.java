package chapter08_inheritance;

class Parent {
	String x = "parent";
	
	void jump() {
		System.out.println("1배 점프");
	}
}

class Child extends Parent {
	String x = "child";
	
	void method() {
		String x = "local";
		System.out.println(super.x);
	}
	
	void child() {
		System.out.println(x);
	}
	
	@Override
	void jump() {
		System.out.println("2배 점프");
	
	}
}

public class VariableTest {

	public static void main(String[] args) {
		Child c = new Child();
		c.method();
		c.child();
		c.jump();
		
		Parent p = new Parent();
		p.jump();
		
		Parent p1 = new Child(); // 메모리에 올라간 가상메서드 
		p1.jump();   			 // 2배 점프
		
		Child c1 = (Child)p1;    // 수동형변환 = 다운캐스팅 
		c1.jump();
	}

}
