package No14;

public class ContinueTest {

	public static void main(String[] args) {
		/* �ݺ��� ���ο��� ���ǹ�(if)�� ���� ����ϸ�, ������ �´� ���(true)�̸�
		 * ���� �ݺ��� �� ������ �ٸ� ���๮���� �������� ����. 
		 */
		int num;
		
		for(num = 1; num <=100; num++) {
			
			if( (num % 3) != 0) continue;
			
			System.out.println(num);
		}
	}

}
