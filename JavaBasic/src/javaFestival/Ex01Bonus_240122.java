package javaFestival;

import java.util.Scanner;

public class Ex01Bonus_240122 {
	public static void main(String[] args) {
		
		//보너스1번 2024.01.22. 12:19~12:25
		
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.print("A 입력 >>");
			int num1 = sc.nextInt();
			System.out.print("B 입력 >>");
			int num2 = sc.nextInt();
			
			
			if(num1 == 0 && num2 == 0) {
				break;
			}
			System.out.println("결과 >> " + (num1 - num2));
		}
		
		
	}
}
