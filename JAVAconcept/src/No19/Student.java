package No19;

public class Student {
	/* 클래스 형으로 변수를 선언
	 * 기본 자료형은 사용하는 메모리의 크기가 정해져 있지만, 참조 자료형은 클래스에 따라 다름
	 * 참조 자료형을 사용할 때는 해당 변수에 대해 생성하여야 함.
	 * (String 클래스는 예외적으로 생성하지 않고 사용할 수 있음)
	 * 
	 */
	int studentId;
	String studentName;
	
	Subject korea;
	Subject math;
	
	Student(int studentId, String studentName) {
		this.studentId = studentId;
		this.studentName = studentName;
		
		korea = new Subject();
		math = new Subject();
	}
	
	public void setKoreaSubject( String name, int score) {
		korea.subjectName = name;
		korea.score = score;
	}
	
	public void setMathSubject (String name, int score) {
		
		math.subjectName = name;
		math.score = score;
	}
	
	public void showScoreInfo() {
		int total = korea.score + math.score;
		System.out.println(studentName + "학생의 총점은" + total + "점 입니다.");
	}
}
