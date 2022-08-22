package polymorphism;

// 259쪽 다형성 테스트하기

//class Animal {
//	void move() {
//		System.out.println("동물이 움직입니다.");
//	}
//}
//
//class Human extends Animal {
//	@Override
//	void move() {
//		System.out.println("사람이 두 발로 걷습니다.");
//	}
//}
//
//class Tiger extends Animal {
//	@Override
//	void move() {
//		System.out.println("호랑이가 네 발로 걷습니다.");
//	}
//}
//
//class Eagle extends Animal {
//	@Override
//	void move() {
//		System.out.println("독수리가 하늘을 납니다.");
//	}
//}
//
//
//
//public class AnimalTest {
//	
//	public void moveAnimal(Animal x) {
//		x.move();
//	}
//
//	public static void main(String[] args) {
//		 
//		AnimalTest test = new AnimalTest();
//		test.moveAnimal(new Animal());
//		test.moveAnimal(new Human());
//		test.moveAnimal(new Tiger());
//		test.moveAnimal(new Eagle());
//	}
//
//}
