package No10;

public class WhileTest {

	public static void main(String[] args) {
		/* �־��� ���ǿ� �´� ����(true)������ ���๮�� �ݺ������� �����ϴ� ���
		 * ���ǿ� ���� ������ �ݺ��ϴ� ������ ���߰� ��
		 * ������ �ַ� �ݺ� Ƚ���� ���� ���� ����� ���� true, false �Ǵ� ��
		 * ��) �޸��� �ڵ���, ���� Ƚ����ŭ ���ư��� �����, Ư�� �µ����� �����Ǵ� ��������
		 * 
		 */
		int num = 1;
		int sum = 0; // ���������� �ڵ����� �ʱ�ȭ�� �ȵǹǷ� ���� 0���� �ʱ�ȭ�ؾ� ��.
		
		while(num <= 10) {
			sum += num;
			num++;
		}
		System.out.println(sum);
		System.out.println(num); 
	}

}
