package chapter08_inheritance;

public class superClassTest {

	public static void main(String[] args) {
		
		Sub sub = new Sub();
		
System.out.println();
		
		System.out.println(sub.valueSuper);
		System.out.println(sub.valueSub);
		
System.out.println();
		
		sub.methodSub();
		sub.methodSuper();

System.out.println();		
		
		Super s1 = new Sub(); // 자동 형 변환 (업캐스팅)
		
System.out.println();

		s1.valueSuper = 500;
		//s1.valuseSub = 600;
		s1.methodSuper();
		//s1.methodSub();
		//sub = (Sub)s1;		  // 수동 형 변환 (다운캐스팅)
		
		//Sub s2 = (Sub)(new Super()); 업캐스팅 없는 다운캐스팅은 메모리가 적어서 불가능
		
System.out.println();		
		
		if(sub instanceof Sub) {
			System.out.println("sub은 Sub 타입");
		}
		if(sub instanceof Super) {
			System.out.println("sub는 Super 타입");
		}
		if (s1 instanceof Sub) {
			System.out.println("s1는 Sub 타입");
		}
		if (s1 instanceof Super) {
			System.out.println("s1는 Super 타입");
		} 
		if(sub instanceof Object ) {
			System.out.println("sub은 Object 타입");
		}
		
	}

}


class Super {
	int valueSuper = 200;
	Super() {
		System.out.println("Super 디폴트 생성자");
	}
	
	Super(int valueSuper) {
		this.valueSuper = valueSuper;
		System.out.println("Super 매개변수 생성자");
	}
	
	void methodSuper() {
		System.out.println("재정의된 Super 메서드");
	}
}

class Sub extends Super {
	int valueSub = 300;
	
	Sub() {
		System.out.println("Sub 디폴트 생성자");
	}
	 	 
	Sub(int valueSub) {
		this.valueSub = valueSub;
		System.out.println("Sub 매개변수 생성자");
	}
	
	void methodSub() {
		System.out.println("Sub 메서드");
	}
		
	@Override
	void methodSuper() {
		super.methodSuper();
	}

	
}