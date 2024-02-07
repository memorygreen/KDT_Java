package day12;

import java.util.Scanner;

public class Ex14zigZag {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("원하는 정수를 입력하세요 : ");
		int n = sc.nextInt();
		int[][] arr = new int[n][n];

		int cnt = 1;

//		arr[0][0] = cnt;
//		cnt++;
//		arr[0][1] = cnt;

//		//짝수행
//		for(int j = 0; j < arr.length ; j++) {
//			arr[0][j] = cnt;
//			cnt++;
//		}

//		arr[1][4] = cnt;
//		cnt++;
//		arr[1][3] = cnt;

//		// 홀수행
//		for(int j = arr.length - 1; j >= 0 ; j--) {
//			arr[1][j] = cnt;
//			cnt++;
//		}

		for (int i = 0; i < arr.length; i++) {
			
			//짝수행
			if (i % 2 == 0) {
				for (int j = 0; j < arr[i].length; j++) {
					arr[i][j] = cnt;
					cnt++;
				}
			}
			//홀수행
			else if(i % 2 == 1){
				for (int j = arr[i].length - 1; j >= 0; j--) {
					arr[i][j] = cnt;
					cnt++;
				}
			}
		}
		
		//출력
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				System.out.print(arr[i][j] + "\t");
			}System.out.println();
		}
		

	}

}
