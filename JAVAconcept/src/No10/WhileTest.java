package No10;

public class WhileTest {

	public static void main(String[] args) {
		/* 주어진 조건에 맞는 동안(true)지정된 수행문을 반복적으로 수행하는 제어문
		 * 조건에 맞지 않으면 반복하던 수행을 멈추게 됨
		 * 조건은 주로 반복 횟수나 값의 비교의 결과에 따라 true, false 판단 됨
		 * 예) 달리는 자동차, 일정 횟수만큼 돌아가는 나사못, 특정 온도까지 가동되는 에어컨등
		 * 
		 */
		int num = 1;
		int sum = 0; // 지역변수는 자동으로 초기화가 안되므로 따로 0으로 초기화해야 됨.
		
		while(num <= 10) {
			sum += num;
			num++;
		}
		System.out.println(sum);
		System.out.println(num); 
	}

}
