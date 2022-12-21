package No24;

public class Employee {
	/* ���� �ν��Ͻ����� �������� ����ϴ� ���� ����(static ����)
	 * 
	 * �������� ����ϴ� ������ �ʿ��� ���
	 * ���� �ν��Ͻ��� �����ϴ� ���� ���� �ʿ��� ���
	 * �л����� ���ο� �й� ����
	 * ī��ȸ�翡�� ī�带 ���� �߱��Ҷ����� ���ο� ī�� ��ȣ�� �ο�
	 * ȸ�翡 ����� �Ի��� ������ ���ο� ����� �ʿ�.
	 * 
	 * static ���� ����� ����ϱ�
	 * �ν��Ͻ��� ������ �� ��������� ������ �ƴ�, ó�� ���α׷��� �޸𸮿� �ε��� �� �޸𸮸� �Ҵ�
	 * Ŭ���� ����, �������������(vs. �ν��Ͻ� ����)
	 * �ν��Ͻ� ������ ������� ��� �����ϹǷ� Ŭ���� �̸����� ���� ����.
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
