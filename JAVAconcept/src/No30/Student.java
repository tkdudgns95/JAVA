package No30;
/* ArrayList를 활용한 간단한 성적 산출 프로그램
 */
import java.util.ArrayList;

public class Student {
	
	int studentId;
	String studentName;
	
	ArrayList<Subject> subjectList;
	
	
	Student(int studentId, String studentName) {
		
		this.studentId = studentId;
		this.studentName = studentName;
		
		subjectList = new ArrayList<>();
	}
	
	public void addSubject(String name, int point ) {
		
		Subject subject = new Subject();
		subject.setName(name);
		subject.setScorePoint(point);
		
		subjectList.add(subject);
	}
	
	
	
	public void showScoreInfo() {
		int total = 0;
		
		for( Subject subject : subjectList) {
			
			total += subject.getScorePoint();
			System.out.println(studentName + "학생의 " + subject.getName() + "과목의 성적은 " + subject.getScorePoint() + "입니다.");
		}
		System.out.println(studentName + "학생의 총점은" + total + "점 입니다.");
	}
}










