package No02;

public class Variable {
	public static void main(String[] args) {

		/* 프로그램에서는 항상 변하는 값을 나타낼 필요가 있음(ex 성적, 합계, 게임 레벨, 회원 주소 등)
		 * 표현하려는 수에 맞는 데이터 타입(자료형)을 이용하여 변수를 선언.
		 * 표현하려는 자료가 숫자, 문자, 문자열등 다양하므로 그에 맞는 자료형을 사용.
		 * 
		 * 변수 이름은 영문자(대문자, 소문자)나 숫자를 사용할 수도 있고, 특수문자 중에는 $와 _만 사용 (ex. count100, _master)
           변수 이름의 시작은 숫자로 할 수 없음 ( ex. 27days(X), 1abc(X))
           자바에서 이미 사용하고 있는 예약어는 사용할 수 없음 (while, break 등)
           변수 이름은 프로그램내에서 사용되는 것이므로 그 용도에 맞고 가독성이 좋게 만드는것이 중요 ex) int numberOfStudent;
           
           변수를 선언하면 해당되는 자료형의 크기 만큼 메모리가 할당
           변수는 할당된 메모리를 가리키는 이름
           int level = 10; // 4바이트 정수형 메모리가 level 이라는 이름으로 할당 됨
		   
		 * 
		 */
		int age, count;
		age = 10;
		
		int level = 10000;
		System.out.println(age);
		System.out.println(level);

		byte bnum = 127; // -128에서 +127 표현가능 
		
		System.out.println(bnum);
		
		// int num = 1234567890;
		long lNum = 12345678900L; // 숫자의 뒤에 알파벳 L 또는 l 을 써서 long 형임을 표시 함
		System.out.println(lNum);
		
		
	}
}
