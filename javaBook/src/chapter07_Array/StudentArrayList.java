package chapter07_Array;

import java.util.ArrayList;

// 225쪽 나 혼자 코딩

public class StudentArrayList {

	public static void main(String[] args) {
		
		ArrayList<Student> st = new ArrayList<Student>();
		st.add(new Student(921007, "최다운"));
		st.add(new Student(931008, "김다은"));
		st.add(new Student(961028, "정인혜"));
		
		for(Student date: st) {
			date.showStudentInfo();
		}
		
	}

}
