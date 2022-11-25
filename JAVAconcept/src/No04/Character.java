package No04;

public class Character {

	public static void main(String[] args) {
		
		/* � ���ڸ� ��ǻ�� ���ο��� ǥ���ϱ� ���� Ư�� ���� ���� ����
		 * A -> 65(���ڵ�) 65 -> A (���ڵ�)
		 * 
		 *  ���ڵ�(encoding): ���ڰ� ���ڷ� ��ȯ �Ǵ� ��.
		 *  ���ڵ�(decoding): ���ڿ��� �ٽ� ���ڷ� ��ȯ�Ǵ� ��.
		 *  ASKII CODE:���ĺ��� ���� Ư�� ���ڵ��� 1����Ʈ�� ǥ���ϴµ� ����ϴ� ���ڼ�Ʈ
		 *  UNICODE: �� ���� ǥ������ ���� ���� ��Ʈ
		 *  UTF-8: 1����Ʈ���� 4����Ʈ���� �پ��ϰ� ���ڸ� ǥ���� �� ����
		 *  UTF-16: 2����Ʈ�� ���ڸ� ǥ��
		 *  
		 * ���ڼ�Ʈ: �� ���ڸ� �󸶷� ǥ���� ������ �ڵ� ���� ��Ƶ� ����
		 * ���ڼ�Ʈ(character set)��� ��.
		 * (ex, ASKII, euc-kr, UTF-8, UTF-16)
		 * 
		 * �ڹٴ� ���ڸ� ��Ÿ���� ���� ������ ǥ���� UNICODE�� ����Ѵ�.
		 * UTF-16 ���ڵ��� ���(��� ���ڸ� 2����Ʈ�� ǥ��)
		 * 
		 * ���ڸ� ���� ������ Ÿ�� char ch='A';
		 * ���������� ���ڷ� ǥ���ǹǷ� ���ڸ� �־ ���ڰ� ��µ� �� �ִ�.
		 * char ch2 = 66;
		 * 
		 * 
		 */
		char ch1 = 'A';
		System.out.println(ch1);
		System.out.println((int)ch1);
		
		char ch2 = 66;
		System.out.println(ch2);
		System.out.println((char)ch2);
		
		int ch3 = 67;
		System.out.println(ch3);
		System.out.println((char)ch3);
		
		char han = '��';
		char ch = '\uD55C'; // ������ ����� �� ����
		
		System.out.println(han);
		System.out.println(ch);
	}

}
