package day05;

import java.util.Scanner;

public class Ex03원하는구구단 {

	public static void main(String[] args) {

	// 1Step - 무조건 2단 2*9까지 출력 해보기
	// 2Step - 2단을 입력받은 단으로 바꾸기
	// 3Step - 입력받은 범위까지 나오게 바꾸기
	
		
	// 선생님 풀이
		
		
//		System.out.println(2 + "*" + 1+ "=" + 2 * 1); //앞에 "*"는 문자열, *는 곱하기 연산자
//		System.out.println(2 + "*" + 2+ "=" + 2 * 2);
//		System.out.println(2 + "*" + 3+ "=" + 2 * 3);
//		System.out.println(2 + "*" + 4+ "=" + 2 * 4);
//		System.out.println(2 + "*" + 5+ "=" + 2 * 5);
//		System.out.println(2 + "*" + 6+ "=" + 2 * 6);
//		System.out.println(2 + "*" + 7+ "=" + 2 * 7);
//		System.out.println(2 + "*" + 8+ "=" + 2 * 8);
//		System.out.println(2 + "*" + 9+ "=" + 2 * 9);

		
		Scanner sc = new Scanner(System.in);
		System.out.println("단 입력 : ");
		int dan = sc.nextInt();
		System.out.print("범위 입력 : ");
		int range = sc.nextInt();
		
		for (int i = 1 ; i <= range ; i++) {
			System.out.println(dan + "*" + i+ "=" + dan * i); //앞에 "*"는 문자열, *는 곱하기 연산자
			
		}
		
	// 자영풀이
//	Scanner sc = new Scanner(System.in);
	System.out.print("단 입력 : ");
	int num1 = sc.nextInt();
	
	System.out.print("범위 입력 : ");
	int num2 = sc.nextInt();
	
	for(int i=1;i<=num2;i++) {
		System.out.printf("%d x %d = %d%n", num1, i, num1 *i);
	}
	
	}

}
