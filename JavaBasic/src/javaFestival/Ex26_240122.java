package javaFestival;

import java.util.Scanner;

public class Ex26_240122 {

	public static void main(String[] args) {
		// 26번(2024.01.22. 19:16~19:20)
		
		Scanner sc = new Scanner(System.in);
		System.out.print("첫 번째 숫자 입력>>");
		int n1 = sc.nextInt();
		System.out.print("두 번째 숫자 입력>>");
		int n2 = sc.nextInt();
		
		
		int num_1 = n1 * (n2 % 10);
		int num_10 = n1 * (n2 % 100 / 10);
		int num_100 = n1 * (n2 % 1000 / 100);
		System.out.println(num_1);		
		System.out.println(num_10);		
		System.out.println(num_100);		
		
		System.out.println(num_1 + num_10 * 10 + num_100 * 100);

	}

}
