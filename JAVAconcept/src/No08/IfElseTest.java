package No08;

import java.util.Scanner;

public class IfElseTest {

	public static void main(String[] args) {
		/* if(���ǽ�) {
		 * ���๮; // ���ǽ��� '��'�� ��쿡(���ǿ� �´� ���) ���๮�� �����
		 *       // ���ǽ��� '��'�� �ƴϸ�(���ǿ� ���� �ʴ� ���) ���๮�� ������� ����.
		 *       
		 * if(���ǽ�){
		 * 		���๮1; // ���ǽ��� '��'�� ��쿡 �����
		 * }
		 * 
		 * else{
		 * 		���๮2; // ���ǽ��� '��'�� �ƴ� ��쿡 �����
		 * }
		 * 
		 */
		
		System.out.println("���̸� �Է����ּ���.");
		
		Scanner scanner = new Scanner(System.in);
		int age = scanner.nextInt();
		
		if (age >= 8) {
			System.out.println("�б��� �ٴմϴ�.");
		}
		else {
			System.out.println("�б��� �ٴ��� �ʽ��ϴ�.");
		}
		
		System.out.println("��°� �� ����");
	}

}
