package No11;

import java.util.Scanner;

public class DoWhileTest {

	public static void main(String[] args) {
		/* while���� ������ ���� üũ�ϰ� �ݺ� ������ �ȴٸ�, do-while��
		 * ���ǰ� ������� ������ �� �� �ϰ� ���� ������ üũ.
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
