package No16;

public class FunctionTest {
	/* 함수란(function)
	 * 하나의 기능을 수행하는 일련의 코드
	 * 구현된(정의된) 함수는 호출하여 사용하고 호출된 함수는
	 * 기능이 끝나면 제어가 반환됨.
	 * 함수로 구현된 하나의 기능은 여러 곳에서 동일한 방식으로 호출하여 사용될 수 있다.
	 * 
	 * 메서드(method)
	 * 객체의 기능을 구현하기 위해 클래스 내부에 구현되는 함수
	 * 멤버 함수(member function)이라고도 함
	 * 메서드를 구현함으로써 객체의 기능이 구현됨.
	 * 메서드의 이름은 그 객체를 사용하는 객체(클라이언트)에 맞게 짓는 것이 좋음.
	 */
	
	public static int addNum(int num1, int num2) {
		
		int result;
		result = num1 + num2;
		return result;
	}
	
	public static void sayHello(String greeting) {
		System.out.println(greeting);
	}
	
	public static int calcSum() 
	{
		int sum = 0;
		int i;
		
		for(i = 0; i<=100; i++ ) {
			
			sum += i;
		}
		
		return sum;
		
	}
	public static void main(String[] args) {
		
		int n1 = 10;
		int n2 = 20;
		
		int total = addNum(n1, n2);
		System.out.println(total);
		
		sayHello("안녕하세요");
		
		total = calcSum();
		System.out.println(total);
		
	}
}
