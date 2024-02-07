package javaFestival;

import java.util.Scanner;

public class Ex05_240122 {

	public static void main(String[] args) {
		// 5번 2024.01.22. 11:08~11
		Scanner sc = new Scanner(System.in);
		System.out.print("행 개수 : ");
		int num = sc.nextInt();
		
		for(int i = 1 ; i <= num ; i++) {
			for(int j = 1 ; j <= i ; j++) {
				System.out.print("*");
			}System.out.println();
		}
	}

}
