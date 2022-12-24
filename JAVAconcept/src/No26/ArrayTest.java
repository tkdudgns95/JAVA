package No26;

public class ArrayTest {
	/* 자료를 순차적으로 한꺼번에 관리하는 방법 배열(array)
	 * 배열이란?
	 * 동일한 자료형의 순차적 구조
	 * 인덱스 연산자[]를 이용하여 빠른 참조가 가능
	 * 물리적 위치와 논리적 위치가 동일
	 * 배열의 순서는 0부터 시작
	 * 자바에서는 객체 배열을 구현한 ArrayList를 많이 활용함
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
