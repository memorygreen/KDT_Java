package javaFestival;

import java.util.Scanner;

public class Ex17_240122 {

	public static void main(String[] args) {
		// 17번 (2024.01.22. 17:13~17:20)
		
		Scanner sc = new Scanner(System.in);
		
		
		int[] arr = new int[10];
		
		for(int i = 0; i < arr.length ; i++) {
			System.out.print(i+1 + "번째 정수 입력>>");
			arr[i] = sc.nextInt();
			
		}
		
		//출력
		System.out.println("3의 배수 : ");
		for (int i = 0; i < arr.length; i++) {
			
			if(arr[i] % 3 == 0) {
				System.out.print(arr[i] + " ");
			}
		}

	}

}
