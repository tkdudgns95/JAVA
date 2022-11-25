package No03;

public class Variable2 {

	public static void main(String[] args) {
		
		/* 실수는 정수 보다 정밀하기 때문에 정수와는 다른 방식으로 표현 필요.
		 * float 크기: 4바이트, double 크기: 8바이트
		 * 지수부와 가수부로 표현 함.
		 * 정규화: 가수가 밑수보다 작은 한자리까지 가수로 표현되는 것.
		 * 
		 * 컴퓨터에서는 밑수가 2이므로 정규화를 하게되면, 가수부분의 첫 번째 자리 숫자는
		 * 항상 1임, 예) 0.2표현 0.4X2(-1승) 정규화 하면 1.6X2(-3승)
		 * 
		 *  자바에서 실수의 기본 타입은 double을 사용한다.
		 * 
		 * 
		 */
		
		double dnum = 3.14;
		float fnum = 3.14f; //float 값 저장을 위해 f 또는 F를 붙임
		
		System.out.println(dnum);
		System.out.println(fnum);
	}

}
