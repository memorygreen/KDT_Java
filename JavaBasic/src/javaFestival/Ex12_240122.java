package javaFestival;

import java.util.Scanner;

public class Ex12_240122 {

	public static void main(String[] args) {
		// 12번 (2024.01.22. 12:44~12:50)

		Scanner sc = new Scanner(System.in);

		int[][] arr = new int[5][5];

		int cnt = 1;
		
		
		for(int i = 0 ; i < arr.length ; i++) {
		
			for (int j = 0; j < arr.length; j++) {
				arr[j][i] = cnt;
				cnt++;
			}
		}
		
		
		//출력
		for(int i  = 0 ; i < arr.length ;i ++) {
			
			for(int j = 0 ; j < arr.length ; j++) {
				System.out.print(arr[i][j] + " ");
			}System.out.println();
		}

	}
}
