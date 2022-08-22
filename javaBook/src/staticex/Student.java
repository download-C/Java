package staticex;

// 182쪽 static 변수 사용하기

public class Student {
	public static int serialNum = 1000;
	public int studentID;
	public String studentName;
	public int grade;
	public String address;
	
	public String getStudentName( ) {
		return studentName;
	}
	
	public void setStudentName( String name ) {
		studentName = name; 
	}

}
