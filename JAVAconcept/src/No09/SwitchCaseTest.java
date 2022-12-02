package No09;

import java.util.Scanner;

public class SwitchCaseTest {

	public static void main(String[] args) {
		/* if - else if - else ���� ����� �� �����ϰ� ���ŷο� �κ��� ������ ���� ����
		 * �� ������ Ư�� ���̳� ���ڿ��� ��� ���
		 * break���� ����Ͽ� �� ������ �����Ǹ� switch ������ ������������ ��
		 * �ڹ� 14���� �� �� �������� ǥ������ ���� ��(break ������� ����.)
		 */
		Scanner scanner = new Scanner(System.in);
		int month = scanner.nextInt();
		
		int day;
		switch(month) {
		
		/* case 1: case 3: case 5: case 7 : case 8: case 10: case 12:
			day = 31;
			break;
		case 2: day = 28;
			break;
		
		case 4: day = 30;
			break;
		
		case 6: day = 30;
			break;
		
		case 9: day = 30;
			break;
			
		case 11: day = 30;
			break;
			
		default:
			System.out.println("�������� �ʴ� ���Դϴ�.");
			day = -1;
			*/
		
		case 1,3,5,7,8,10,12 ->
			day = 31;
		case 2 ->
			day = 28;
		case 4, 6, 9, 11 ->
			day = 30;
		default -> {
			System.out.println("�������� �ʴ� ���Դϴ�.");
			day = -1;
			}
		}
		
		System.out.println(month + "����" + day + "�� �Դϴ�.");
	}

}