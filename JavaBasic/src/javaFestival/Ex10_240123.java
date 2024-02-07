package javaFestival;

import java.util.Random;

public class Ex10_240123 {

	public static void main(String[] args) {
		// 10번(13:46~13:53)
		
		int[] arr = new int[8];
		Random ran = new Random();
		System.out.print("배열에 있는 모든 값 : ");
		
		// 배열에 랜덤 수 생성
		for(int i = 0 ; i < arr.length ; i++) {
			arr[i] = ran.nextInt(100);
			System.out.print(arr[i] + " ");
		}
		
		int max = 0;
		int min = 100;
		//최댓값
		for(int i = 0 ; i < arr.length ; i++) {
			if(arr[i] > max) {
				max = arr[i];
			}
		}System.out.println();
		System.out.print("가장 큰 값 : " + max);
		
		
		//최솟값
		for(int i = 0 ; i < arr.length ; i ++) {
			if(arr[i] < min) {
				min = arr[i];
			}
		}System.out.println();
		System.out.print("가장 작은 값 : " + min);
		
		
		

	}

}
