package javaFestival;

import java.util.Scanner;

public class Ex20_240123 {

	public static void main(String[] args) {

		//보고 따라하기
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자입력>>");
		int num = sc.nextInt();
		
		int[] arr = new int[7];
		
		int a = 64;
		
		for(int i = 0 ; i < arr.length ; i++) {
			if(num >= a) {
				arr[i] = 1;
				num = num - a;
				
			}
//			else {
//				arr[i]=0;
//			}
			
			a = a /2 ;
			
		}
		
		
		for(int i = 0 ; i < arr.length ; i++) {
			System.out.print(arr[i] + " ");
		}
		
		sc.close();
	}

}
