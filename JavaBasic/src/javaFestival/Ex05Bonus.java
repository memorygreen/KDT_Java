package javaFestival;

import java.util.Scanner;

public class Ex05Bonus {

	public static void main(String[] args) {
		// 보너스5번(2024.01.22. 18:21~18:36)

		Scanner sc = new Scanner(System.in);

		int[] arr = new int[5];
		for (int i = 0; i < arr.length; i++) {
			System.out.print(i + 1 + "번째 수 입력 : ");
			int num = sc.nextInt();
			arr[i] = num;
		}

		System.out.println("정렬 후");

		int temp = 0;

//		for (int j = 0; j < arr.length - 1; j++) {
//			if (arr[j] > arr[j + 1]) {
//				temp = arr[j];
//				arr[j] = arr[j + 1];
//				arr[j + 1] = temp;
//			}
//		}
//
//		for (int j = 0; j < arr.length - 2; j++) {
//			if (arr[j] > arr[j + 1]) {
//				temp = arr[j];
//				arr[j] = arr[j + 1];
//				arr[j + 1] = temp;
//			}
//		}
//
//		for (int j = 0; j < arr.length - 3; j++) {
//			if (arr[j] > arr[j + 1]) {
//				temp = arr[j];
//				arr[j] = arr[j + 1];
//				arr[j + 1] = temp;
//			}
//		}
//
//		for (int j = 0; j < arr.length - 1; j++) {
//			if (arr[j] > arr[j + 1]) {
//				temp = arr[j];
//				arr[j] = arr[j + 1];
//				arr[j + 1] = temp;
//			}
//		}
//
//		for (int j = 0; j < arr.length - 1; j++) {
//			if (arr[j] > arr[j + 1]) {
//				temp = arr[j];
//				arr[j] = arr[j + 1];
//				arr[j + 1] = temp;
//			}
//		}

		// for문 (
//		for (int i = 1; i < arr.length - 1; i++) {
//			for (int j = 0; j < arr.length - 1 - i; j++) {
//				if (arr[j] > arr[j + 1]) {
//					temp = arr[j];
//					arr[j] = arr[j + 1];
//					arr[j + 1] = temp;
//				}
//			}
//		}

//		
//		0 1
//		1 2
//		2 3
//		3 4	=  <arr.length-1
//
//		0 1
//		1 2
//		2 3 =  <arr.length-2
//		
//		0 1
//		1 2 =  <arr.length-3
//
//		0 1 = a <arr.length-4

		// 풀이 보고 다시 (~18:53)
		for (int i = 1; i < arr.length; i++) {
			for (int j = 0; j < arr.length - i; j++) {
				if (arr[j] > arr[j + 1]) {
					temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
		
		// 출력
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

	
	}

}
