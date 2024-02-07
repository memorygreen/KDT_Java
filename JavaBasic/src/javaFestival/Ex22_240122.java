package javaFestival;

public class Ex22_240122 {

	public static void main(String[] args) {
		// 22번(2024.01.22. 18:09~18:16)
		
		
		// 1트실패
//		for (int i = 1; i <= 5; i++) {
//			for (int j = 1; j <= i; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//
//			for (int j = 1; j <= 5 - i; j++) {
//				System.out.print("0");
//			}
//			System.out.println();
//
//		}

//		
		//2트(2024.01.22. 18:17~18:20)
//		0000* 5-1
//		000** 5-2
//		00*** 5-3
//		0**** 5-4
//		***** 5-5

		
//		//1행
//		for (int j = 1; j <= 5-1; j++) {
//			System.out.print("0");
//		}
//		for (int j = 1; j <= 1; j++) {
//			System.out.print("*");
//		}
//		
//		//2행
//		for (int j = 1; j <= 5-2; j++) {
//			System.out.print("0");
//		}
//		for (int j = 1; j <= 2; j++) {
//			System.out.print("*");
//		}
//		
//		//3행
//		for (int j = 1; j <= 5-3; j++) {
//			System.out.print("0");
//		}
//		for (int j = 1; j <= 3; j++) {
//			System.out.print("*");
//		}
//		 
//		//4행
//		for (int j = 1; j <= 5-4; j++) {
//			System.out.print("0");
//		}
//		for (int j = 1; j <= 4; j++) {
//			System.out.print("*");
//		}
//		
//		//4행
//		for (int j = 1; j <= 5-5; j++) {
//			System.out.print("0");
//		}
//		for (int j = 1; j <= 5; j++) {
//			System.out.print("*");
//		}
		
		//for문 전체!!!
		for(int i =1 ; i <=5 ; i++) {
			for (int j = 1; j <= 5-i; j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}System.out.println();
		}
		
	}

}
