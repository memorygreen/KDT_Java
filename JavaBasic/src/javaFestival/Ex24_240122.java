package javaFestival;

import java.util.Scanner;

public class Ex24_240122 {

	public static void main(String[] args) {
		// 24번 (2024.01.22. 19:01~19:06)
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("N 입력 >>");
		int N = sc.nextInt();
		System.out.print("X 입력 >>");
		int X = sc.nextInt();
		
		int[] arr = new int[N];
		
		
		System.out.println();
		
		//정수 입력
		for(int i = 0 ; i < arr.length ; i++) {
			System.out.print(i+1 + "번째 정수 입력>>");
			arr[i] = sc.nextInt();
		}
		
		//출력
		System.out.print("결과>>");
		for(int a : arr) {
			if(a < X) {
				System.out.print(a + " ");
			}
		}
	}

}
