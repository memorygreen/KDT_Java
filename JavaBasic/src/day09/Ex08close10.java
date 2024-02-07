package day09;

import java.util.Scanner;

public class Ex08close10 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("첫번째 정수 : ");
		int num1 = sc.nextInt();
		System.out.print("두번째 정수 : ");
		int num2 = sc.nextInt();

		System.out.println("10에 가까운 수 : " + close1(num1, num2));
		System.out.println("10에 가까운 수 : " + close2(num1, num2));

	}

	// 쌤풀이1
	private static int close1(int num1, int num2) {

		// 어떤 수가 더 10에 가까운지 판별 (절댓값 구하기)
//		int a = 10 - num1;
//		int b = 10 - num2;
//
//		if (a < 0) {
//			a = a * (-1); // a *= (-1);
//		}
//		if (b < 0) {
//			b = b * (-1); // a *= (-1);
//	} // 거리가 다 양수로 바뀜!
		
		// 절댓값 구하는 메소드로 구하기
		int a = Math.abs(10 - num1);
		int b = Math.abs(10 - num2);
			

		if (a < b) {
			return num1;
		} else if (b < a) {
			return num2;
		} else {
			return 0;
		}

	}

	// 자영 풀이
	public static int close2(int num1, int num2) {
		int num1_abs = 0;
		int num2_abs = 0;

		if (num1 > 10) {
			num1_abs = (-1) * (10 - num1);
		} else {
			num1_abs = 10 - num1;
		}

		if (num2 > 10) {
			num2_abs = (-1) * (10 - num2);
		} else {
			num2_abs = 10 - num2;
		}

		if (num1_abs == num2_abs) {
			return 0;
		} else {
			return num1_abs > num2_abs ? num2 : num1;
		}

	}

}
