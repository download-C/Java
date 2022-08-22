package chapter10_bookshelf;

public class bookShelf extends Shelf implements Quere {
	// 상위클래스 Shelf의 인스턴스 shelf로 객체 생성 후 그 안애 title을 차례로 넣음
	@Override
	public void enQueue(String title) {
		shelf.add(title);
	}
	
	// 
	@Override
	public String deQueue() {
		return shelf.remove(0);
	}

	@Override
	public int getSize() {
		// TODO Auto-generated method stub
		return getCount();
	}

}
