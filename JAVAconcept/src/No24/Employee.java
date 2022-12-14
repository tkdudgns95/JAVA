package No24;

public class Employee {
	/* 여러 인스턴스에서 공통으로 사용하는 변수 선언(static 변수)
	 * 
	 * 공통으로 사용하는 변수가 필요한 경우
	 * 여러 인스턴스가 공유하는 기준 값이 필요한 경우
	 * 학생마다 새로운 학번 생성
	 * 카드회사에서 카드를 새로 발급할때마다 새로운 카드 번호를 부여
	 * 회사에 사원이 입사할 때마다 새로운 사번이 필요.
	 * 
	 * static 변수 선언과 사용하기
	 * 인스턴스가 생성될 때 만들어지는 변수가 아닌, 처음 프로그램이 메모리에 로딩될 때 메모리를 할당
	 * 클래스 변수, 정적변수라고도함(vs. 인스턴스 변수)
	 * 인스턴스 생성과 상관없이 사용 가능하므로 클래스 이름으로 직접 참조.
	 */
	private static int serialNum = 1000;
	
	private int employeeId;
	private String employeeName;
	private String department;
	
	public Employee() {
		
		serialNum++;
		employeeId = serialNum;
	}
	
	public static int getSerialNum() {
		int i = 0;
		

		return serialNum;
	}

	public int getEmployeeId() {
		serialNum = 1000;
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	
}
