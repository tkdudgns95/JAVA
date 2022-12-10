package No18;

public class Food {
	/* 생성자 정의 하기
	 * 생성자를 구현해서 사용할 수 있다
	 * 클래스에 생성자를 따로 구현하면 기본 생성자(default constructor)는 제공되지 않음
	 * 생성자를 호출하는 코드(client 코드)에서 여러 생성자 중 필요에 따라 호출해서 사용할 수 있음.
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
		
		return "음식점에 배달 주문이 들어왔습니다. \n주문 접수 번호 : " + orderNumber + "\n주문 핸드폰 번호 :" + phoneNumber
				+ "\n주문 집 주소 : " + address + "\n주문 날짜 : " + orderdate + "\n주문 시간 : " + ordertime +"\n주문 가격 : " + price +"\n메뉴 번호 :" + menuNumber;
		
	}
}
