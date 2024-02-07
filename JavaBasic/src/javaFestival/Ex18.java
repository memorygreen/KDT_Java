package javaFestival;

import java.util.Random;

public class Ex18 {

	public static void main(String[] args) {
		
		//18번 
		// 중복없이 숫자를 뽑는 로또 프로그램을 만드시오.
		// 행운의 숫자 : 3
		
		
		Random ran = new Random();
		
		int[] arr = new int[45];
			
		for(int i = 0 ; i < arr.length ; i++ ) {
			arr[i] = i+1;
		}
		
		for(int i = 1 ; i <= 6 ; i++) {
			
			int num = ran.nextInt(45)+1; //1. 랜덤수를 뽑는다
//			System.out.println(num);
			if(ran.nextInt(45)+1 == num){
				int num2 = ran.nextInt(45)+1;
				System.out.println("행운의 숫자 중복: " + num2);
			} else {
				System.out.println("행운의 숫자 : " +num);
			}
			
			
			
		}

		
		
		
		
		
		//1트 ( 중복 돼서 실패)09:07~
//		for(int i = 1 ; i <= 6 ; i++) {
//			
//			System.out.print("행운의 숫자 : ");
//			System.out.println(ran.nextInt(45)+1);
//		}
		
	}

}
