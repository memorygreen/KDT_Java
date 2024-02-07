package javaFestival;

import java.util.Scanner;

public class EX14_240122 {

	public static void main(String[] args) {

		// 14번 (2024.01.22. 14:44~/16:08)

		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력하세요>> ");
		int n = sc.nextInt();

		int[][] arr = new int[n][n];
		int cnt = 1;

		for (int i = 0; i < arr.length; i++) {
			if (i % 2 == 0) {
				for (int j = 0; j < arr[i].length; j++) {
					arr[i][j] = cnt;
					cnt++;
				}
			} else {
				for (int j = arr[i].length - 1; j >= 0; j--) { //자영아 정신차려~~~~
					arr[i][j] = cnt;
					cnt++;
				}
			}

		}

		// 출력
		for (int i = 0; i < arr.length; i++) {
				for (int j = 0; j < arr[i].length; j++) {
					System.out.print(arr[i][j] + " ");
			}System.out.println();
		}

	}

}
