package chapter07_Array;

import java.util.ArrayList;

//TODO Auto-generated method stub

public class ArrayListEx1 {

	public static void main(String[] args) {
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		
		for(int i=0; i<5; i++) {
			numbers.add(99+i);
		}
		
		System.out.println(numbers.size());
		numbers.remove(2);
		
		
		for(int data: numbers) {
			System.out.println(data);
		}
		
		if(numbers.contains(104)) {
			System.out.println("104가 있습니다.");
		}else {
			System.out.println("104가 없습니다.");
		}
		
		System.out.println(numbers.get(3));
		
		
		
	}	
	 	
}
