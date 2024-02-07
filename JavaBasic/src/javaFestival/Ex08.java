package javaFestival;

import java.util.Scanner;

public class Ex08 {

	public static void main(String[] args) {
		// 8번 2024.01.22. 12:26~12:29
		
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 입력 : ");
		int num = sc.nextInt();
		int result = 0;
		if(num % 10 >=5) {
			result =  ((num / 10)+1) *10;
			
		}else {
			result = num / 10 *10;
		}
		
		System.out.print("반올림수 : " + result);
		
		

	}

}
