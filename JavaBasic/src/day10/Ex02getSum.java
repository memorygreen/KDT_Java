package day10;

import java.util.Scanner;

public class Ex02getSum {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();

		int result = getSum(num);

		System.out.println(num + "의 약수의 합 : " + result);
		getDivisor(num); // 약수를 나열 //return값 없다
	}


	// 쌤풀이 - 약수 합 구하기
	public static int getSum(int num) {
		int sum = 0;
		for (int i = 1; i <= num; i++) {

			if (num % i == 0) {
				sum += i;
			}

		}
		return sum;

	}
	
	// 쌤풀이 - 약수 구하기
	public static void getDivisor(int num) {

		String result = "";
		
		for(int i = 1; i <= num; i++) {
			
			if (num % i ==0) {
				result += i + " ";
			}
		}
		System.out.println(num + "의 약수 : " + result);
		
	}
	// 자영 풀이
	// 입력한 수의 약수 합 구하는 메서드
	public static int getSum2(int num) { // (x)public으로 변경
		int sum = 0;
		for (int i = 1; i <= num; i++) {
			if (num % i == 0) {
				sum = sum + i;
			}
		}
		return sum;
	}
	
	
	// 입력한 수의 약수 구하는 메서드
	public static void getDivisor2(int num) { // (x)return값이 없으니 void //(x)public으로 변경
		System.out.print(num + "의 약수 : ");

		for (int i = 1; i <= num; i++) {
			if (num % i == 0) {
				System.out.print(i + " ");
			}

		}
	}
}
