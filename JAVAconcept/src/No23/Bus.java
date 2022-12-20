package No23;

/* 버스 타고 학교 가는 학생의 과정을 객체 지향 프로그래밍으로 구현해보기 
 */
public class Bus {
	
	int busNumber;
	int passengerCount;
	int money;
	
	public Bus(int busNumber) {
		this.busNumber = busNumber;
	}
	
	public void take(int money) {
		this.money += money;
		passengerCount ++;
		
	}
	
	public void showBusinfo() {
		
		System.out.println(busNumber + "번의 승객 수는 " + passengerCount + "명이고, 수입은 " + money + "원입니다.");
	}
}
