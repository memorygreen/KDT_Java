package javaFestival;

import java.util.Scanner;

public class Ex06Bonus_240122 {

	public static void main(String[] args) {
		// 보너스6번 (2024.10.22. 19:25~19:30)
		Scanner sc = new Scanner(System.in);
		System.out.print("밑을 입력하세요>>");
		int base = sc.nextInt();
		System.out.print("지수를 입력하세요>>");
		int n = sc.nextInt();
		int result = powerN(base, n);
		
		System.out.println("결과 확인 : " + result);
		

	}
	public static int powerN(int base, int n) {
		int cnt = 1;
		for(int i = 1 ; i <= n ; i++ ) {
			cnt = cnt * base;
		}
		return cnt;
	}
	

}
