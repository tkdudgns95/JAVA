package No05;

public class Constant {

	public static void main(String[] args) {
		/* 상수는 변하지 않는 수이다.
		 * 원주률 3.14, 1년 12개월 등
		 * fianl 예약어를 사용하여 선언한다.
		 * 상수를 사용하면 변하지 않는 값을 반복하여 사용할 때 의미있는 문자로 인식하기 쉽고,
		 * 변하더라도 선언한 부분만 변경하면 되므로 여러부분을 수정할 필요가 없음.
		 */
		
		final int MAX_NUM = 100;
		final int MIN_NUM;
		
		MIN_NUM = 0;
		
		// MAX_NUM = 20;
		
		System.out.println(MAX_NUM);
		System.out.println(MIN_NUM);
		
	}

}
