package chapter07_Array;

import java.util.ArrayList;

// 230쪽 연습문제 4번

public class DogTest {

	public static void main(String[] args) {
		Dog[] dog = new Dog[5];

//		dog[0] = new Dog("멍멍미1","진돗개");
//		dog[1] = new Dog("멍멍이2","요크셔테리어");
//		dog[2] = new Dog("멍멍이3","푸들");
//		dog[3] = new Dog("멍멍이4","허스키");
//		dog[4] = new Dog("멍멍이5","슈나우저");
		
		// for문을 이용해서 값 추가하기
		String[] dogName = { "멍멍이1", "멍멍이2", "멍멍이3", "멍멍이4", "멍멍이5" };
		String[] dogType = { "진돗개","요크셔테리어","푸들","허스키","슈나우저" };

		for(int n=0; n<dog.length; n++) {
			dog[n] = new Dog(dogName[n], dogType[n]);
			System.out.println(dog[n].showDogInfo());
		}
		System.out.println("=======================================");
		
		for(int i=0; i<dog.length; i++) {
			System.out.println(dog[i].showDogInfo());
		}
		
		System.out.println("=======================================");
		
		for(Dog dogs: dog) {
			System.out.println(dogs.showDogInfo());
		}
		
	}

}
