package staticex;

// 187�� serialNum�� get(), set() �޼��� ����ϱ�

public class Student2 {

	private static int serialNum=1000;
	int studentID;
	String StudentName;
	int grade;
	String address;
	
	public Student2() {
		serialNum++;
		studentID = serialNum;
	}
	
	
	public String getStudentName() {
		return StudentName;
	}


	public void setStudentName(String name) {
		StudentName = name;
	}


	public static int getSerialNum() {
		int i = 10;
		return serialNum;
	}


	public static void setSerialNum(int serialNum) {
		Student2.serialNum = serialNum;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}   

}
