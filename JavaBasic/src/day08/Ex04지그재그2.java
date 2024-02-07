package day08;

import java.util.Iterator;

public class Ex04지그재그2 {

	public static void main(String[] args) {

		// 1 10 11 20 21
		// 2 9 12 19 22
		// 3 8 13 18 23
		// 4 7 14 17 24
		// 5 6 15 16 25

		int[][] array = new int[5][5];

		
		// 쌤풀이/////////////////////
		
		int cnt = 1;
		
		// 0열 : 행 0~4 증가
//		array[0][0] = cnt;
//		cnt++;
//		array[1][0] = cnt;
//		cnt++;
//		array[2][0] = cnt;
//		cnt++;
//		array[3][0] = cnt;
//		cnt++;
//		array[4][0] = cnt;
//		cnt++;
		
//		// 1열 (4행->0행 거꾸로 숫자가 들어옴)
//		array[4][1] = cnt;
//		cnt++;
//		array[3][1] = cnt;
//		cnt++;
//		array[2][1] = cnt;
//		cnt++;
//		array[1][1] = cnt;
//		cnt++;
//		array[0][1] = cnt;
//		cnt++;
		
//		// 0열  -> for문
//		for(int j = 0 ; j < array.length; j++) {///array.length == 5
//			array[j][0] = cnt;
//			cnt++;
//		}
		
//		//1열 ->for문
//		for(int j = array.length - 1 ; j >= 0; j--) {//array.length - 1 == 4
//			array[j][1] = cnt;
//			cnt++;
//		}
//		
//		// 2열  ->for문
//		for(int j = 0 ; j < array.length; j++) {///array.length == 5
//			array[j][2] = cnt;
//			cnt++;
//		}
//		
//		//3열 ->for문
//		for(int j = array.length - 1 ; j >= 0; j--) {//array.length - 1 == 4
//			array[j][3] = cnt;
//			cnt++;
//		}
//		
//		// 4열  ->for문
//		for(int j = 0 ; j < array.length; j++) {///array.length == 5
//			array[j][4] = cnt;
//			cnt++;
//		}
		
		// 전체 for문 (i == 열)
		for (int i = 0 ; i < array.length ; i++){ //행과 열의 길이가 같으니 array.length 가능
			
			if ( i % 2 == 0) {
				
				for(int j = 0 ; j < array.length; j++) {///array.length == 5
					array[j][i] = cnt;
					cnt++;
				}
				
			}else {
				
				for(int j = array.length - 1 ; j >= 0; j--) {//array.length - 1 == 4
					array[j][i] = cnt;
					cnt++;
				}
				
			}
			
			
		}
		
		// 자영 풀이1****************************************//

		int num = 1;
		// 열0
//		array[0][0] = 1;
//		array[1][0] = 2;
//		array[2][0] = 3;
//		array[3][0] = 4;
//		array[4][0] = 5;

		// 열1
//		array[4][1] = 6;
//		array[3][1] = 7;
//		array[2][1] = 8;
//		array[1][1] = 9;
//		array[0][1] = 10;

		// 열2
//		array[0][2] = 11;
//		array[1][2] = 12;
//		array[2][2] = 13;
//		array[3][2] = 14;
//		array[4][2] = 15;

		// 열3
//		array[0][3] = 20;
//		array[1][3] = 19;
//		array[2][3] = 18;
//		array[3][3] = 17;
//		array[4][3] = 16;

		// 열4
//		array[0][4] = 21;
//		array[1][4] = 22;
//		array[2][4] = 23;
//		array[3][4] = 24;
//		array[4][4] = 25;

		// 열0
//		for (int j = 0; j < array.length; j++) {
//			array[j][0] = num;
//			num++;
//		}
//		
//		// 열1
//		for (int j = array.length - 1; j >= 0; j--) {
//			array[j][1] = num;
//			num++;
//		}
//		
//		// 열2
//		for (int j = 0; j < array.length; j++) {
//			array[j][2] = num;
//			num++;
//		}
//		
//		// 열3
//		for (int j = array.length - 1; j >= 0; j--) {
//			array[j][3] = num;
//			num++;
//		}
//		
//		// 열4
//		for (int j = 0; j < array.length; j++) {
//			array[j][4] = num;
//			num++;
//		}

		// for문으로 감싸기
		// 전체 for문 감싸기
//		for (int i = 0; i < array.length; i++) {
//			if (i % 2 == 0) {
//				for (int j = 0; j < array.length; j++) {
//					array[j][i] = num;
//					num++;
//				}
//			} else {// i % 2 == 1
//				for (int j = array.length - 1; j >= 0; j--) {
//					array[j][i] = num;
//					num++;
//				}
//			}
//		}

		// 확인용 출력
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length; j++) {
				System.out.print(array[i][j] + "\t");
			}
			System.out.println();
		}

//		////////////////////////////////////////// 자영풀이2
//		// 1 10 11 20 21
//		// 2 9 12 19 22
//		// 3 8 13 18 23
//		// 4 7 14 17 24
//		// 5 6 15 16 25
//
////		[0][0]
////		num = num +10;
////		[0][1]
////		num++;
//
////		array[i][j];
//
//		int[][] array2 = new int[5][5];
//		int num2 = 1;
//
//		for (int i = 0; i < array.length; i++) {
//
//			// 행 홀짝
//			// 행 홀수인경우->감소
//			if (i % 2 == 1) {
//				for (int j = 0; j <array.length; j++) {
//					// 열 짝수
//					if (j % 2 == 0) {//[][j]열 짝수
//						array[i][j] = num2;
//						num2 = num2 + 7;
//					} else {//[][j]열 홀수 j % 2 == 1
//						array[i][j] = num2;
//						num2 = num2 + 3;
//					}
////				num2 = num2 - 10;
//				} 
//				
//				
//			// 행 짝수인 경우->증가
//			} else {
//				
//				for (int j = 0; j < array.length; j++) {
//					// 열 짝수
//					if (j % 2 == 0) {//[][j]열 짝수
//						array[i][j] = num2;
//						num2 = num2 + 7;
//					} else {//[][j]열 홀수 j % 2 == 1
//						array[i][j] = num2;
//						num2 = num2 + 3;
//					}
//				}
//			}
////			num2 = num2 -20 ;
//		}

		// 확인용 출력
//		System.out.println();
//		System.out.println();
//		System.out.println("////////////풀이2//////////");
//
//		for (int i = 0; i < array.length; i++) {
//			for (int j = 0; j < array.length; j++) {
//				System.out.print(array[i][j] + "\t");
//			}
//			System.out.println();
//		}

	}

}
