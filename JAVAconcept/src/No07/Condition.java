package No07;

import java.util.Scanner;

public class Condition {
	
	public static void main(String[] args) {
		/* 삼항 연산자
		 * 조건식의 결과가 true(참)인 경우와 false(거짓)인 경우에 따라 다른 결과가 수행됨
		 * if(조건문)을 간단히 표현할 때 사용할 수 있음
		 * 조건식? 결과1:결과2; 조건식이 참이면 결과1, 조건식이 거짓이면
		 * 결과 2가 선택된다. ex) int num = (5 > 3)? 10 : 20;
		 * 
		 */
		int max;
		System.out.println("두 수를 입력 받아서 더 큰 수를 출력하세요\n");
		
		Scanner scanner = new Scanner(System.in);// 표준입력
		System.out.println("입력 1:");
		int num1 = scanner.nextInt();
		System.out.println("입력 2:");
		int num2 = scanner.nextInt();
		
		max = (num1 > num2)? num1 : num2; // true면 num1 출력 false면 num2 출력
		System.out.println(max);
		
		
		
	}

}
