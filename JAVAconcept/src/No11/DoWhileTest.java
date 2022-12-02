package No11;

import java.util.Scanner;

public class DoWhileTest {

	public static void main(String[] args) {
		/* while문은 조건을 먼저 체크하고 반복 수행이 된다면, do-while은
		 * 조건과 상관없이 수행을 한 번 하고 나서 조건을 체크.
		 */
		Scanner scanner = new Scanner(System.in);
		int input;
		int sum = 0;
		
		do {
			input = scanner.nextInt();
			sum += input;
		} while(input !=0);
		
		System.out.println(sum);
		
	/*input = scanner.nextInt();
		
		while(input != 0) {
			
			sum += input;
			input = scanner.nextInt();
		} */
		
		System.out.println(sum);
	}

}
