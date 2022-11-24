package No01;

public class BinaryTest {
	public static void main(String[] args) {
		
		/* 0과 1로만 데이터를 저장함
		 * bit(1비트): 컴퓨터가 표현하는 데이터의 최소 단위로 2진수 하나의 값을
		 * 저장할 수 있는 메모리의 크기
		 * byte(바이트): 1byte = 8bit
		 * 
		 * 10진수 9, 10, 11, 12, 13, 14, 15, 16
		 * 2진수 1001, 1010, 1011, 1101, 1110, 1111, 10000
		 * 8진수 11, 12, 13, 14, 15, 16, 17, 20
		 * 16진수 9, A, B, C, D, E, F, 10
		 * 
		 * 한 개의 비트로 나타낼 수 있는 수 : 0, 1 (2개)
		 * 두 개의 비트로 나타낼 수 있는 수: 00, 01, 10, 11(4개)
		 * 세 개의 비트로 나타낼 수 있는 수: 000, 001, 010, 011, 100, 101, 110, 111(8개)
		 * 
		 */
	int num = 10;
	int bNum = 0B1010; // 0B는 2진수
	int oNum = 012;    // 8진수 앞에 0을 붙이면 8진수
	int xNum = 0XA;    // 16진수 0X A는 10
	
	System.out.println(num);
	System.out.println(bNum);
	System.out.println(oNum);
	System.out.println(xNum);
		
	}
}
