package No07;

public class BitOperation {
	
	public static void main(String[] args) {
		/* ~ 비트의 반전(1의 보수) ex) a = ~a;
		 * & 비트 단위 AND       ex) 1 & 1 1반환 그 외는 0
		 * | 비트 단위 OR        ex) 0|0 0 반환 그 외는 1
		 * ^ 비트 단위 XOR       ex) 두 개의 비트가 서로 다른 경우에 1을 반환
		 * << 왼쪽 shift        ex) a << 2 변수 a를 2비트 만큼 왼쪽으로 이동.
		 * >> 오른쪽 shift      ex) a >> 2 변수 a를 2비트 만큼 오른쪽으로 이동.
		 * >>> 오른쪽 shift     ex) >> 동일한 연산, 채워지는 비트가 부호와 상관없이 0임
	 	 * 
		 */
		int num1 = 5;
		int num2 = 10;
		
		System.out.println( num1 | num2);
		System.out.println( num1 & num2);
		System.out.println( num1 ^ num2);
		System.out.println( ~num1 );
		
		System.out.println(num1 << 2);
		System.out.println(num1 <<= 2);
		System.out.println(num1 >> 1);
		
	}
}
