package No17;

public class Student {
	
	public int studentID;
	public String studentName;
	public String address;
	
	public void showStudentInfo() {
		System.out.println( studentID + "�й� �л��� �̸��� " + studentName + " �̰�, �ּҴ� " + address + "�Դϴ�.");
				
	}
	public String getStudentName() { // �� void �� �޼ҵ�� return�� �ʼ��̴�.
		return studentName;
	}
	
	public void setStudentName(String name) {
		studentName = name;
	}
	
}
