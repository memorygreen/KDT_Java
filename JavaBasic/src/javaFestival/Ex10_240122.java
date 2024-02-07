package javaFestival;

import java.util.Random;

public class Ex10_240122 {

	public static void main(String[] args) {
		//10번(2024.01.22. 12:31~12:40)
		
		int[] arr = new int[8];
		Random ran = new Random();
		
		
		
		// 갑 넣기 & 출력하기
		System.out.print("배열에 있는 모든 값 : ");
		for(int i = 0; i < arr.length ; i++) {
			
			arr[i] = ran.nextInt(100);
			System.out.print(arr[i] + " ");
		}
		
		int max = 0;
		int min = 100;
		// 최대값 구하기
		for(int i = 0 ; i < arr.length ; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		
		for(int i = 0; i < arr.length ; i++) {
			if(arr[i] < min) {
				min = arr[i];
			}
		}
		
		System.out.println();
		System.out.println("가장 큰 값 : " + max);
		System.out.println("가장 작은 값 : " + min);
		
	}

}
