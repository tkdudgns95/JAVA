package No28;

public class TwoDimensionTest {
	/* 2차원 배열
	 * 이차원 이상으로 구현 된 배열
	 * 평면 (이차원 배열) 이나 공간(삼차원 배열)을 활용한 프로그램 구현
	 */
	public static void main(String[] args) {
		
		int[][] arr = {{1,2,3}, {1,2,3,4}};
		
		int i,j;
		
		for(i = 0; i<arr.length; i++) {
			
			for(j=0; j<arr[i].length; j++) {
				
				System.out.println(arr[i][j] + ",");
			}
			System.out.println("\t" + arr[i].length);
		}
	}

}
