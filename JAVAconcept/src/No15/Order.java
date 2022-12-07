package No15;

public class Order {
	
	/* 객체(object)
	 * 의사나 행위가 미치는 대상 (사전적 의미)
	 * 구체적, 추상적 데이터의 단위(학생,회원,생산,주문,배송)
	 * 
	 * 객체지향프로그래밍
	 * 객체를 정의,
	 * 각 객체 제공하는 기능들을 구현
	 * 각 객체가 제공하는 기능들 간의 소통(메세지 전달)을
	 * 통하여 객체간의 협력을 구현 
	 * 
	 * 클래스 코딩하기
	 * 클래스는 대문자로 시작하는 것이 좋음.
	 * java 파일 하나의 클래스는 여러 개가 있을 수 있지만,
	 * public 클래스는 하나이고, public 클래스와 .java파일의 이름은 동일함.
	 * camel notation 방식으로 명명
	 */
	
	int orderId;
	String buyerId;
	String sellerId;
	int productId;
	String orderDate;

}
