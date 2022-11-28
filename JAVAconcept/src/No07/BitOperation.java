package No07;

public class BitOperation {
	
	public static void main(String[] args) {
		/* ~ ��Ʈ�� ����(1�� ����) ex) a = ~a;
		 * & ��Ʈ ���� AND       ex) 1 & 1 1��ȯ �� �ܴ� 0
		 * | ��Ʈ ���� OR        ex) 0|0 0 ��ȯ �� �ܴ� 1
		 * ^ ��Ʈ ���� XOR       ex) �� ���� ��Ʈ�� ���� �ٸ� ��쿡 1�� ��ȯ
		 * << ���� shift        ex) a << 2 ���� a�� 2��Ʈ ��ŭ �������� �̵�.
		 * >> ������ shift      ex) a >> 2 ���� a�� 2��Ʈ ��ŭ ���������� �̵�.
		 * >>> ������ shift     ex) >> ������ ����, ä������ ��Ʈ�� ��ȣ�� ������� 0��
	 	 * 
		 */
		int num1 = 5;
		int num2 = 10;
		
		System.out.println( num1 | num2);
		System.out.println( num1 & num2);
		System.out.println( num1 ^ num2);
		System.out.println( ~num1 );
		
		System.out.println(num1 << 2);
		System.out.println(num1 <<= 2);
		System.out.println(num1 >> 1);
		
	}
}
