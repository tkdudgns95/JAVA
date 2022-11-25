package No04;

public class Character {

	public static void main(String[] args) {
		
		/* 어떤 문자를 컴퓨터 내부에서 표현하기 위해 특정 정수 값을 정의
		 * A -> 65(인코딩) 65 -> A (디코딩)
		 * 
		 *  인코딩(encoding): 문자가 숫자로 변환 되는 것.
		 *  디코딩(decoding): 숫자에서 다시 문자로 변환되는 것.
		 *  ASKII CODE:알파벳과 숫자 특수 문자등을 1바이트에 표현하는데 사용하는 문자세트
		 *  UNICODE: 전 세계 표준으로 만든 문자 세트
		 *  UTF-8: 1바이트에서 4바이트까지 다양하게 문자를 표현할 수 있음
		 *  UTF-16: 2바이트로 문자를 표현
		 *  
		 * 문자세트: 각 문자를 얼마로 표현할 것인지 코드 값을 모아둔 것을
		 * 문자세트(character set)라고 함.
		 * (ex, ASKII, euc-kr, UTF-8, UTF-16)
		 * 
		 * 자바는 문자를 나타내기 위해 전세계 표준인 UNICODE를 사용한다.
		 * UTF-16 인코딩을 사용(모든 문자를 2바이트로 표시)
		 * 
		 * 문자를 위한 데이터 타입 char ch='A';
		 * 내부적으로 숫자로 표현되므로 숫자를 넣어도 문자가 출력될 수 있다.
		 * char ch2 = 66;
		 * 
		 * 
		 */
		char ch1 = 'A';
		System.out.println(ch1);
		System.out.println((int)ch1);
		
		char ch2 = 66;
		System.out.println(ch2);
		System.out.println((char)ch2);
		
		int ch3 = 67;
		System.out.println(ch3);
		System.out.println((char)ch3);
		
		char han = '한';
		char ch = '\uD55C'; // 음수는 사용할 수 없음
		
		System.out.println(han);
		System.out.println(ch);
	}

}
