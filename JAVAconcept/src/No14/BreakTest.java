package No14;

public class BreakTest {

	public static void main(String[] args) {
		/* break�� ����ϱ�
		 * ���ΰ� �ִ� ����� ����� ���� ������ ���(switch�� ������ ���)
		 * �ݺ��������� �ַ� ���ǹ�(if)�� ���� ����ϸ� ���ǿ� �ش�Ǵ� ��� �ݺ� ������ ���߰�,
		 * �ݺ��� �ܺη� ������ �̵�
		 * ���� �ݺ����� ��ø�Ǿ� �ִ� ��쿣 break���� ���ԵǾ� �ִ� �ݺ����� ��������. 
		 */
		int sum = 0;
		int num = 1;
		
		for(num = 1; sum <= 100; num++) {
			
			sum += num;
			
			if ( sum >= 100)
				break;
		}
		
		System.out.println(sum);
		System.out.println(num);
		
	}

}
