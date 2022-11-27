package No06;

public class Logical {

	public static void main(String[] args) {
		/* > 왼쪽 항이 크면 참을, 아니면 거짓을 반환 ex) num > 3
		 * < 오른쪽 항이 크면 참, 아니면 거짓을 반환 ex) num < 3
		 * >= 왼쪽 항이 오른쪽 항보다 크거나 같으면 참, 아니면 거짓을 반환 ex) num >= 3
		 * <= 오른쪽항이 왼쪽항보다 크거나 같으면 참, 아니면 거짓을 반환 ex) num <= 3
		 * == 두 개의 항의 값이 같으면 참, 아니면 거짓을 반환 ex) num == 3
		 * != 두 개의 항이 다르면 참, 아니면 거짓을 반환 ex) num != 3
		 * 
		 * &&(논리 곱) 두 항이 참인 경우에만 결과 값이 참이다. 그렇지 않은 경우는 거짓.
		 * ex) booleanval = (5 > 3) && (5 > 2);
		 * 
		 * ||(논리 합) 두 항 중 하나의 항만 참이면 결과 값은 참이다. 두 항이 모두 거짓이면
		 * 결과 값은 거짓이다. ex) booleanval = (5 > 3) || (5 < 2);
		 * 
		 * !(부정) 단항 연산자이다. 참인 경우는 거짓으로 바뀌고, 거짓인 경우는 참으로 바뀐다.
		 * booleanval =! (5 > 3)
		 */
		int num1 = 10;
		int i = 2;
		
		//boolean value = ( (num1 = num1 + 10) < 10)&& ( (i = i+2) < 10 );
		// 앞에 항이 false가 나왔으므로 뒷쪽 항은 연산하지 않아서 i는 2가 나온것이다.
		
		boolean value = ( (num1 = num1 + 10) > 10) || ( (i = i+2) < 10 );
		// 앞에 항이 true가 나왔으므로 뒷쪽 항은 연산하지 않아 i는 2가 나온 것이다.
		
		System.out.println(value);
		System.out.println(num1);
		System.out.println(i);
		
		boolean flag = !(num1 > 9); // 결과는 참이지만 !(부정)연산으로 인해 flase 출력
		System.out.println(flag);

	}

}
