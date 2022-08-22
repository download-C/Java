package chapter11_Object;

class Student{
	int studentID;
	String name;
	
	public Student(int studentID, String name) {
		this.studentID = studentID;
		this.name = name;
	}

	@Override
	public String toString() {
		return name+", "+studentID;
	}
	
	// Source를 통해 자동으로 재정의한 hasCode()와 equals()


	@Override
	public int hashCode() {
		return studentID;
	}

/*	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return Objects.equals(name, other.name) && Objects.equals(studentID, other.studentID);
	} */



	@Override  // 개발자가 직접 재정의한 equals 메서드
	public boolean equals(Object obj) {  //equals() 메서드가 원래 들어있는 클래스의 타입이 매개변수로 들어옴
		if(obj instanceof Student) {	 //equals()에 들어온 변수의 타입이 Stduent가 맞는지 확인
			Student std = (Student)obj;	 //obj 인스턴스를 Student 타입으로 다운캐스팅
			if(this.studentID == std.studentID) { // 학번이 같으면 같은 학생으로 인식하도록 재정의
				return true;
			} else return false;
		} return false;
	}
	
	
}

public class EqualsTest {

	public static void main(String[] args) {
		Student s1 = new Student(100, "최다운");
		Student s2 = s1;
		Student s3 = new Student(100, "최다운");
		
		if(s1 == s2 ) { // ==로 비교하기
			System.out.println("s1과 s2의 주소는 같습니다.");
		} else {
			System.out.println("s1과 s2의 주소는 다릅니다.");
		}
		
		if(s1.equals(s2)) { // equals()로 비교하기
			System.out.println("s1과 s2는 동일합니다.");
		} else {
			System.out.println("s1과 s2는 다릅니다.");
		}
		
		if(s1 == s3) { //==로 비교하기
			System.out.println("s1과 s3의 주소는 같습니다.");
		} else {
			System.out.println("s1과 s3의 주소는 다릅니다.");
		}
		
		if(s1.equals(s3)) { // equals()로 비교하기
			System.out.println("s1과 s3는 동일합니다.");
		} else {
			System.out.println("s1과 s3는 다릅니다.");
		}
		
		System.out.println("==== 해시코드 재정의 후 비교 ====");
		System.out.println("s1의 hashCode: "+s1.hashCode());
		System.out.println("s3의 hashCode: "+s3.hashCode());
		System.out.println();
		System.out.println("s1의 실제 주소값: "+System.identityHashCode(s1));
		System.out.println("s2의 실제 주소값: "+System.identityHashCode(s3));
		 
	}

}
 