package javaFestival;

import java.util.Scanner;

public class Ex11_240122 {

	public static void main(String[] args) {
		// 11번 (2024.01.22. 12:41~12:44)
		
		Scanner sc = new Scanner(System.in);
		System.out.print("첫번째 정수를 입력하세요>>");
		int num1 = sc.nextInt();
		System.out.print("두번째 정수를 입력하세요>>");
		int num2 = sc.nextInt();
		boolean result = isDivide(num1, num2);

		System.out.println("결과 확인 : " + result);
		
	}

	private static boolean isDivide(int num1, int num2) {
		
		if(num1 % num2 == 0) {
			return true;
		}else {
			
			return false;
		}
	}

}
