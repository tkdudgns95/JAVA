package No12;

public class ForTest {

	public static void main(String[] args) {
		/* for문
		 * 초기화, 조건체크, 증감 순으로 수행된다.
		 * 특정 수의 범위, 횟수와 관련하여 반복되는 경우 주로 사용
		 * 배열과 함께 많이 사용된다.
		 * 
		 */
		int count = 1;
		int sum = 0;
		
		for(int i=0; i<10; i++, count++) {
	 
			sum += count;
		}
		System.out.println(sum);
		
		int num = 1;
		int total = 0;
		
		while( num <= 10) {
			total += num++;
			num++;
		}
		
		System.out.println(total);
	}
}
