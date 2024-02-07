package day09;

import java.util.Scanner;

public class selfStudy {

	public static void main(String[] args) {

		// Java Festival 12번 (13분/20점)

		Scanner sc = new Scanner(System.in);

		// 1 6 11 16 21
		// 2 7 12 17 22
		// 3 8 13 18 23
		// 4 9 14 19 24
		// 5 10 15 20 25

		int n = sc.nextInt();

		int[][] array = new int[n][n];

//		홀수열 ++
//		짝수열 --

		int cnt = 1;

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {

				if (j % 2 == 0) {
					array[j][i] = cnt;
					cnt++;

				} else {

				}
			}
		}
		// 차근차근

		array[0][0] = cnt;
		cnt++;
		array[1][0] = cnt;
		cnt++;
		array[2][0] = cnt;
		cnt++;
		array[3][0] = cnt;
		cnt++;
		array[4][0] = cnt;

		array[4][1] = 1;
		cnt++;
		array[3][1] = 1;
		cnt++;
		array[2][1] = 1;
		cnt++;
		array[1][1] = 1;
		cnt++;
		array[0][1] = 1;
		cnt++;

		for (int i = 0; i < array.length; i++) {

			if (i % 2 == 0) { // 짝수열
				for (int j = array.length - 1; j >= 0; j--) {
					array[j][0] = cnt;
					cnt++;
				}
			} else { // 홀수열
				for (int j = 0; j < array.length; j++) {
					array[j][0] = cnt;
					cnt++;
				}
			}

		}

//		array[0][2] = cnt;
//		cnt++;   
//		array[1][2] = cnt;
//		cnt++;   
//		array[2][2] = cnt;
//		cnt++;   
//		array[3][2] = cnt;
//		cnt++;   
//		array[4][2] = cnt;
//		
//		array[4][3] = 1;
//		cnt++;   
//		array[3][3] = 1;
//		cnt++;   
//		array[2][3] = 1;
//		cnt++;   
//		array[1][3] = 1;
//		cnt++;   
//		array[0][3] = 1;
//		cnt++;
//		
//		array[4][4] = 1;
//		cnt++;   
//		array[3][4] = 1;
//		cnt++;   
//		array[2][4] = 1;
//		cnt++;   
//		array[1][4] = 1;
//		cnt++;   
//		array[0][4] = 1;
//		cnt++;

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {

				System.out.println(array[i][j] + " ");
			}
		}
		System.out.println();
	}

}
