package chapter10_bookshelf;

public interface Quere {
	// 배열의 맨 뒤에 데이터를 차례로 입력
	void enQueue(String title);
	// 배열의 맨 데이터를 앞을 하나 지우고 그 값을 반환
	String deQueue();
	// 현재 Queue에 있는 개수 반환
	int getSize(); 
}
