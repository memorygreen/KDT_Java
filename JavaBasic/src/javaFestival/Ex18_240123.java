package javaFestival;

import java.util.Random;

public class Ex18_240123 {

	public static void main(String[] args) {
		// 18번(2024.01.23. 13:55~14:00)
		
		Random ran = new Random();
		
		int [] arr = new int[6];
		for(int i = 0 ; i < arr.length ; i ++) {
			System.out.print("행운의 숫자 : ");
			arr[i] = ran.nextInt(45)+1;
			for(int j = 1 ; j < i-1 ; j++) {
				if(arr[i] == arr[j]) {
					i--;
				}
				
				
			}System.out.println(arr[i]);
		}


	}

}