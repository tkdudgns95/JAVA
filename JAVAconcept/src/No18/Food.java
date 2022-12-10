package No18;

public class Food {
	/* ������ ���� �ϱ�
	 * �����ڸ� �����ؼ� ����� �� �ִ�
	 * Ŭ������ �����ڸ� ���� �����ϸ� �⺻ ������(default constructor)�� �������� ����
	 * �����ڸ� ȣ���ϴ� �ڵ�(client �ڵ�)���� ���� ������ �� �ʿ信 ���� ȣ���ؼ� ����� �� ����.
	 */
	public String orderNumber;
	public String phoneNumber;
	public String address;
	public String orderdate;
	public int ordertime;
	public int price;
	public String menuNumber;
	
	public Food() {
		
	}
	
public Food(String orderNumber, String phoneNumber, String address, String orderdate, int ordertime, int price, String menuNumber) {
		
		this.orderNumber = orderNumber;
		this.phoneNumber = phoneNumber;
		this.address = address;
		this.orderdate = orderdate;
		this.ordertime = ordertime;
		this.price = price;
		this.menuNumber = menuNumber;
	}
	public String showFoodInfo() {
		
		return "�������� ��� �ֹ��� ���Խ��ϴ�. \n�ֹ� ���� ��ȣ : " + orderNumber + "\n�ֹ� �ڵ��� ��ȣ :" + phoneNumber
				+ "\n�ֹ� �� �ּ� : " + address + "\n�ֹ� ��¥ : " + orderdate + "\n�ֹ� �ð� : " + ordertime +"\n�ֹ� ���� : " + price +"\n�޴� ��ȣ :" + menuNumber;
		
	}
}
