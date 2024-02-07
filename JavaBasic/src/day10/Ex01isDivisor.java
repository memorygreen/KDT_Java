package day10;

import java.util.Scanner;

public class Ex01isDivisor {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("첫번째 정수 : ");
		int num1 = sc.nextInt();
		System.out.print("두번째 정수 : ");
		int num2 = sc.nextInt();

		boolean result = isDivisor(num1, num2); // (x) boolean타입!
		System.out.println(result);
	}
	
	//쌤풀이
	private static boolean isDivisor(int num1, int num2) {
		if(num1 % num2 == 0) {
			return true;
		}else {
			return false;
		}
	}
	
	
	//자영 풀이
	private static boolean isDivisor2(int num1, int num2) {
		if (num1 % num2 == 0) {// (x) boolean타입!
			return true;
		} else {

			return false;
		}
	}

}
