package No26;

public class ArrayTest {
	/* �ڷḦ ���������� �Ѳ����� �����ϴ� ��� �迭(array)
	 * �迭�̶�?
	 * ������ �ڷ����� ������ ����
	 * �ε��� ������[]�� �̿��Ͽ� ���� ������ ����
	 * ������ ��ġ�� ���� ��ġ�� ����
	 * �迭�� ������ 0���� ����
	 * �ڹٿ����� ��ü �迭�� ������ ArrayList�� ���� Ȱ����
	 */

	public static void main(String[] args) {
		
		int[] arr = new int[] {1,2,3,4,5,6,7,8,9,10};
		int total = 0;
		
//		for(int i = 0, num=1; i<arr.length; i++) {
//			arr[i] = num++;
//		}
		
		for( int num : arr ) {
			total += num;
		}
		
		System.out.println(total);
	}

}
