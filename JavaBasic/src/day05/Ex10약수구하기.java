package day05;

import java.util.Scanner;

public class Ex10약수구하기 {

	public static void main(String[] args) {
		// 1step - 1부터 입력받은 수까지 출력
		// 2step - 1부터 입력받은 수까지 입력받은 수를 기준으로 나눠서 나머지 출력
		// 3step - 2step에서 나머지가 0인 녀석들만 출력 (조건문)
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();
		
		System.out.println(num + "의 약수 : ");
		
		// 쌤 풀이
		for(int i = 1; i<= num; i++) {
			if(num % i == 0) {
				System.out.print(i + " ");
			}
			
		}
		
//		// 자영 풀이
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.print("정수 입력 : ");
//		int num = sc.nextInt();
//		
//		for(int i = 1;i<=num;i++) {
//			if(num % i == 0) {
//				System.out.print(i+" ");
//			}
//		}System.out.println();
		
		
		
//		//자영풀이:힌트보고 다시(나머지를 변수에 담아서)
//		System.out.print("정수 입력 : ");
//		int num2 = sc.nextInt();
//
//		for(int i = 1; i <= num2 ;i++) {
//			int namuge = num2 % i;
//			
//			if(namuge == 0) {
//				System.out.print(i+" ");
//			}
//		}System.out.println();
		
	}

}
