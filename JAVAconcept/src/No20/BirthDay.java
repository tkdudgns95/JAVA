package No20;

public class BirthDay {
	/* ���� ���� ������(access modifier)�� ��������(information hiding)
	 * 
	 * ���� ���� ������(access modifier)
	 * Ŭ���� �ܺο��� Ŭ������ ��� ����, �޼���, �����ڸ� ����� �� �ִ��� ���θ� �����ϴ� Ű����.
	 * private: ���� Ŭ���� ���ο����� ���� ����(�ܺ� Ŭ����, ��� ������ Ŭ���������� ���� �Ұ�)
	 * �ƹ��͵� ����(default): ���� ��Ű�� ���ο����� ���� ����(��� ����� ��Ű���� �ٸ��� ���� �Ұ�)
	 * protected: ���� ��Ű���� ��� ������ Ŭ�������� ���� �����ϰ� �� �� �ܺο����� ���� �� �� ����
	 * public: Ŭ������ �ܺ� ��𼭳� ���� �� �� ����
	 * 
	 * get()/ set() �޼���
	 * private���� ����� ��� ���� (�ʵ�)�� ���� ����, ������ �� �ִ� �޼��带 public���� ����
	 * get()�޼��常 �����Ǵ� ��� read-only �ʵ�
	 * ��Ŭ�������� �ڵ����� ������
	 * 
	 * ��������
	 * private���� ������ ��� ������ public �޼��尡 �����Ǹ� ���� ���������� ������ public���� �����Ǿ��� ������
	 * private�϶� �� ������ ���� ������ public �޼��忡�� ���� �� �� �ִ�.
	 * 
	 */
	private int day;
	private int month;
	private int year;
	
	private boolean isValid;
	
	public int getDay() {
		return day;
	}
	
	public void setDay(int day) {
		this.day = day;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		if ( month <1 || month >12)
		{
			isValid = false;
		}
		
		else {
			isValid = true;
			this.month = month;
		}	
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}
	
	public void showDate()
	{
		if(isValid) {
			System.out.println( year + "�� " + month +"�� " +day +" �� �Դϴ�.");
		}
		else {
			System.out.println("��ȿ���� ���� ��¥�Դϴ�.");
		}
	}
	
	public boolean getIsValid() {
		return isValid;
	}
}
