package No07;

import java.util.Scanner;

public class Condition {
	
	public static void main(String[] args) {
		/* ���� ������
		 * ���ǽ��� ����� true(��)�� ���� false(����)�� ��쿡 ���� �ٸ� ����� �����
		 * if(���ǹ�)�� ������ ǥ���� �� ����� �� ����
		 * ���ǽ�? ���1:���2; ���ǽ��� ���̸� ���1, ���ǽ��� �����̸�
		 * ��� 2�� ���õȴ�. ex) int num = (5 > 3)? 10 : 20;
		 * 
		 */
		int max;
		System.out.println("�� ���� �Է� �޾Ƽ� �� ū ���� ����ϼ���\n");
		
		Scanner scanner = new Scanner(System.in);// ǥ���Է�
		System.out.println("�Է� 1:");
		int num1 = scanner.nextInt();
		System.out.println("�Է� 2:");
		int num2 = scanner.nextInt();
		
		max = (num1 > num2)? num1 : num2; // true�� num1 ��� false�� num2 ���
		System.out.println(max);
		
		
		
	}

}
