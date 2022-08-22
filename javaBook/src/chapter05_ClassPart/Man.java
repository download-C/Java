package chapter05_ClassPart;

public class Man {
	// 152�� �� ȥ�� �ڵ� 
	// Q1. Ŭ���� ����� ����� ��� (40��, James, ����, ��ȥ, �ڳ� ��)
	
	int age;
	String name;
	boolean isMarried;
	int numberOfChildren;	
	
	public static void main(String[] args) {
		Man m = new Man();
		
		m.setAge(40);
		m.setIsMarried(true);
		m.setName("James");
		m.setNumberOfChildren(3);
				
		System.out.println("���� : "+m.getAge());
		System.out.println("�̸� : "+m.getName());
		System.out.println("��ȥ ���� : "+m.getIsMarried());
		System.out.println("�ڳ� �� : "+m.getNumberOfChildren());
	}	
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}		
	
	public boolean getIsMarried() {
		return isMarried;
	}
	public void setIsMarried(boolean isMarried) {
		this.isMarried = isMarried;
	}
	
	public int getNumberOfChildren() {
		return numberOfChildren;
	}
	public void setNumberOfChildren(int numberOfChildren) {
		this.numberOfChildren = numberOfChildren;
	}
		
}
