package chapter07_Array;

import java.util.ArrayList;

public class DogArrayList {
	
	public static void main(String[] args) {
	
		ArrayList<Dog> dog = new ArrayList<Dog>();
		
//		dog.add(new Dog("멍멍이1","진돗개"));
//		dog.add(new Dog("멍멍이2","요크셔테리어"));
//		dog.add(new Dog("멍멍이3","푸들"));
//		dog.add(new Dog("멍멍이4","허스키"));
//		dog.add(new Dog("멍멍이5","슈나우저"));
		
		String[] dogName = { "멍멍이1", "멍멍이2", "멍멍이3", "멍멍이4", "멍멍이5" };
		String[] dogType = { "진돗개","요크셔테리어","푸들","허스키","슈나우저" };
		
		for(int i=0; i<dogName.length; i++) {
			dog.add(new Dog(dogName[i], dogType[i]));
			System.out.println(dog.get(i));
		}
		
//		for(int n=0; n<dog.size(); n++) {
//			Dog d = dog.get(n);
//			System.out.println(d.showDogInfo());
//		}
//		
//		
		System.out.println("=======================================");
		for(int i=0; i<dog.size(); i++) {
			dog.add(new Dog(dogName[i], dogType[i]));
		}
		for(Dog dogs: dog) {
			System.out.println(dogs.showDogInfo());
			 
		
		}
	
	}
	
}
