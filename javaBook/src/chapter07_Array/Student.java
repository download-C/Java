package chapter07_Array;

import java.util.ArrayList;

public class Student {
	int studentID;
	String name;
	ArrayList<Subject> subjectList;
		
	// 생성자 만들기
	public Student(int studentID, String name) {
		this.studentID = studentID;
		this.name = name;
		subjectList = new ArrayList<Subject>(); // ArrayList 생성하기
	}
	
	public void addSubject(String subjectName, int Score) {
		Subject subject = new Subject();
		subject.setSubjectName(subjectName);
		subject.setScore(Score);
		subjectList.add(subject);
		
	}
	
	public void showStudentInfo() {
		// 총점을 구하는 int 변수 total 선언 및 초기화
		int total = 0;
		
		//향상된 for문으로 ArrayList<Subject> subjectList 출력하기
		for(Subject s: subjectList ) {
		
		// 총점 더하는 수식
		total += s.getScore();
		 
		System.out.println("학생 "+name+"의 "+s.getSubjectName() +" 과목 성적은 "+s.getScore()+"점입니다." );
		}
		System.out.println("학생 "+name+"의 총점은 "+total+"입니다.");
	}

}
