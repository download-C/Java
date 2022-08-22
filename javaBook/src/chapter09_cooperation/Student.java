package chapter09_cooperation;

import java.util.Scanner;

//178�� ������ ����ö Ÿ�� -> �ڵ� ���� �ʿ��� ������ �޼��� �������ϱ�

public class Student {
	String studentName;	// �л��� �̸�
	int grade;			// �л��� �г�
	int money;  		// �л��� ������ �ִ� ��
	
	public Student(String studentName) {
		this.studentName = studentName;
	};
	
	public Student(String studnetName, int money) {
		this.studentName = studnetName;
		this.money = money;
	}
	
	public Student(String studnetName, int money, int cost) {
		this.studentName = studnetName;
		this.money = money;
	}
	

	public void takeBus(Bus bus) {	// Bus bus = new Bus(); Bus Ŭ������ ���� bus �ν��Ͻ� ����
		bus.take(1000);				// bus �ν��Ͻ��� ���� Bus Ŭ������ take �޼��忡 int money = 1000 �Է�
		this.money -= 1000;			// Student Ŭ������ money ���� ���� ����� 1000�� ����
	
	} 
	
	public void takeSubway(Subway subway) {		// Subway subway = new Subway(); -> Subway Ŭ������ ���� subway �ν��Ͻ� ����
		subway.take(1500);						// subway �ν��Ͻ��� �̿��� Subway Ŭ������ take �޼��忡 int money = 1500 �Է�
		this.money -= 1500;						// Student Ŭ������ money�� ����ö ��� 1500�� ����
	}
	
	public void takeTaxi(Taxi taxi) {			// Taxi taxi = new Taxi(); -> Taxi Ŭ������ ���� taxi �ν��Ͻ� ����
												// taxi �ν��Ͻ��� �̿��� Taxi Ŭ������ take �޼��忡 int cost = taxi.cost �Է�.
		this.money -= taxi.cost;				// Student Ŭ������ money�� �ý� ���(taxi.cost) ����

	}

	
	public void showInfo() {
		System.out.println(studentName+"���� ���� ���� "+money+"���Դϴ�.");
	}
	
	public void showInfo(Taxi taxi) {
		System.out.println(studentName+"���� ���� ���� "+taxi.cost+"���Դϴ�.");
	}
	

	public static void main(String[] args) {
		
		// 1. 5000���� ������ �ִ� James�� 100�� ������ Ž.
		Student studentJames = new Student("James", 5000);
		Bus bus100 = new Bus("100��");
		studentJames.takeBus(bus100);
		studentJames.showInfo();
		bus100.showInfo();
		System.out.println();
		
		// 2. 3000���� ������ �ִ� Kim�� 100�� ������ Ž.
		Student studentKim = new Student("kim", 3000);
		studentKim.takeBus(bus100);
		studentKim.showInfo();
		bus100.showInfo();
		System.out.println();
		
		// 3. 10000���� ������ �ִ� Tomas�� ����ö 2ȣ���� Ž.
		Student studentTomas = new Student("Tomas", 10000);
		Subway greenSubway = new Subway("2ȣ��");
		studentTomas.takeSubway(greenSubway);
		studentTomas.showInfo();
		greenSubway.showInfo();
		System.out.println();			

		// 180�� ���� �ڵ� Edward�� �ýø� Ÿ�� �ýú�� 10000��.
		Student studentEdward = new Student("Edward");	
		Taxi taxi = new Taxi("2580");
		taxi.cost = 10000;
		studentEdward.takeTaxi(taxi);
		studentEdward.showInfo();
		taxi.showInfo();	
		System.out.println();
		
		// 180�� ���� �ڵ� 30000���� ������ �ִ� Alice�� �ýø� Ž. �ýú�� �Է� �ޱ�.
		Taxi taxi2 = new Taxi("3591");
		System.out.println(taxi2.taxiNumber+"�� �ý��� ����� �Է��ϼ���");
		Student studentAlice = new Student("Alice", 30000);
		Scanner sc = new Scanner(System.in);		
		taxi2.cost = sc.nextInt();
		studentAlice.takeTaxi(taxi2);
		studentAlice.showInfo();
		taxi2.showInfo();		
		System.out.println();
	}

}









