package No08;

public class IfElseIfTest {

	public static void main(String[] args) {
		/* if -else if�� ����ϴ� ��� �ϳ��� ������ ���� �Ǹ� ������ else if �κ���
		 * ������� ����.
		 * 
		 * if -if�� ����ϰ� �Ǹ� ���� �ٸ� ���� ������ �ؼ��Ǿ� ���� �����ϰ� ��
		 */
		int age = 17;
		int charge;
		
		if( age < 8)
		{
			charge = 1000;
			System.out.println("�� ���� �Ƶ��Դϴ�.");
		}
		else if( age < 14)
		{
			charge = 2000;
			System.out.println("�ʵ��л� �Դϴ�.");
		}
		else if( age < 20)
		{
			charge = 2500;
			System.out.println("��, ����л��Դϴ�.");
		}
		else {
			charge = 3000;
			System.out.println("�Ϲ��� �Դϴ�.");
		}
		
		System.out.println("������" + charge + "�Դϴ�.");
		
	}
	

}
