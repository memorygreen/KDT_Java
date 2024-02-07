package javaFestival;

import java.util.Scanner;

public class Ex04Bonus_240122 {

	public static void main(String[] args) {
		// 보너스4번 (2024.01.22 17:33~17:39)
		
		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int[5];
		
		for(int i = 0; i < arr.length ; i++) {
			System.out.print(i + "번째 별의 수 : ");
			arr[i] = sc.nextInt();
		}
		
		for(int i = 0 ; i < arr.length ; i++ ) {
			System.out.print((arr[i] + " : "));
			for(int j = 1 ; j <= arr[i] ; j++) {
				System.out.print("*");
			} System.out.println();
		}
				
				
	}

}
