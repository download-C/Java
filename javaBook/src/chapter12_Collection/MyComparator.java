package chapter12_Collection;

import java.util.Comparator;

public // Integer 타입의 배열을 내림차순으로 정렬하는 compare() 메서드를 오버라이딩한 클래스 정의하기 
class MyComparator implements Comparator<Integer> {

	@Override
	public int compare(Integer o1, Integer o2) {
		return (o1-o2) * -1;
	}
	
}
