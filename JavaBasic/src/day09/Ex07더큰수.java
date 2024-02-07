package day09;

import java.util.Scanner;

public class Ex07더큰수 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("첫번째 정수 : ");
		int num1 = sc.nextInt();
		System.out.println("두번째 정수 : ");
		int num2 = sc.nextInt();
		int result = largerNumbers(num1, num2);
		System.out.println("큰 수 확인 : "  + result);
		
	}
	
	// 쌤풀이 (자동완성)
	private static int largerNumbers(int num1, int num2) {
		
		if(num1 == num2) { //(x) 자영 문제를 제대로 안 봤다...
			return 0;
		} else {
			// 삼항연산자
			//     조건식        ? true : false
			return num1 >  num2 ? num1 : num2 ;
		}
	}

	// 자영 풀이(x : 문제를 제대로 안 봤다!)
	public static int largerNumbers2(int num1, int num2) {
		if(num1 > num2) {
			return num1;
		}else {
			return num2;
		}
		
	}
	

}
