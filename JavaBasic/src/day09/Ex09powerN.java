package day09;

import java.util.Scanner;

public class Ex09powerN {
	
	public static void main(String[] args) {
		
		
		// 메소드 예제5: 지수구하기
		Scanner sc = new Scanner(System.in);
		System.out.print("밑 입력 : ");
		int base = sc.nextInt();
		System.out.print("지수 입력 : ");
		int n = sc.nextInt();
		
		int result = powerN(base, n); //int result 라서 자동완성으로 메서드를 생성하면 return 값 int로 알아서 생성됨
		System.out.println("결과 확인 : " + result);
	}
	
	// 쌤풀이 (알쏭달쏭)
	private static int powerN(int base, int n) {

		int num = base;
		for(int i = 0 ; i < n - 1 ; i++) {
			num = num * base; //num *= base;
		}
		return num;
	}

	
	
	//자영 풀이
	private static int powerN2(int base, int n) {
		int result = 1 ;
		for(int i = 1 ; i <= n ; i++) {
			result = result * base; 
			
		}
		
		return result;
	}
	
	

}
