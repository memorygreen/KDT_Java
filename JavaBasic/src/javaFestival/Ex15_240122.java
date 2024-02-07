package javaFestival;

import java.util.Scanner;

public class Ex15_240122 {

	public static void main(String[] args) {
		// 15번 (2024.01.22. 16:34~16:39)
		Scanner sc = new Scanner(System.in);
		System.out.print("n 입력 : ");
		int n = sc.nextInt();
		
		int cnt = 0;
		int sum = 1; 
		for (int i = 1; i <= n; i++) {

			sum = sum + cnt;
			cnt++;
			System.out.print(sum + " ");
		}
		
//		1
//		1+1
//		1+1+2+
//		1+1+2+3
		

	}

}
