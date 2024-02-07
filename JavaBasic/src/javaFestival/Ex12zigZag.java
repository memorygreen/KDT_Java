package javaFestival;

import java.util.Scanner;

public class Ex12zigZag {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("원하는 정수를 입력하세요 : ");
		int n = sc.nextInt();
		int[][] arr = new int[n][n];

		int cnt = 1;
		// 0열 ->1씩 증가
//		arr[0][0] = cnt;
//		cnt++;
//		arr[1][0] = cnt;
//		cnt++;
//		arr[2][0] = cnt;
//		cnt++;
//		arr[3][0] = cnt;
//		cnt++;
//		arr[4][0] = cnt;
//		cnt++;

		// 0열
//		for (int j = 0; j < arr.length; j++) {
//			arr[j][0] = cnt;
//			cnt++;
//		}
		// 1열
//		arr[4][1] = cnt;
//		cnt++;
//		arr[3][1] = cnt;
//		cnt++;
//		arr[2][1] = cnt;
//		cnt++;
//		arr[1][1] = cnt;
//		cnt++;
//		arr[0][1] = cnt;
//		cnt++;

		// 1열
//		for (int j = arr.length - 1; j >= 0; j--) {
//			arr[j][1] = cnt;
//			cnt++;
//		}
		
		// 전체 for문
		for (int i = 0; i < arr.length; i++) {

			// 짝수열

			if (i % 2 == 0)
				for (int j = 0; j < arr.length; j++) {
					arr[j][i] = cnt;
					cnt++;
				}
			// 홀수열
			else if (i % 2 == 1) {

				for (int j = arr.length - 1; j >= 0; j--) {
					arr[j][i] = cnt;
					cnt++;
				}
			}
		}//for문 끝!
		
		//출력
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				System.out.print(arr[i][j] + " ");
				}
			System.out.println();
			
		}//for문 끝!

	}

}
