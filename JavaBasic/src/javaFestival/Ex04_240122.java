package javaFestival;

import java.util.Scanner;

public class Ex04_240122 {

	public static void main(String[] args) {
		// 4번 2024.01.22. 08:48~08:56
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("총금액 입력 : ");
		int num = sc.nextInt();

		System.out.println("잔돈 : ");
		
		
		int cnt10000 = num / 10000;
		System.out.println("10000원 : " + cnt10000 +"개");
		
		int cnt5000 = num % 10000 / 5000;
		System.out.println("5000원 : " + cnt5000 +"개");
		int cnt1000 = num %  5000 / 1000;
		System.out.println("5000원 : " + cnt1000 +"개");
		int cnt500 = num % 1000 / 500;
		System.out.println("5000원 : " + cnt500 +"개");
		int cnt100 = num % 500 / 100;
		System.out.println("5000원 : " + cnt500 +"개");
		
		
	}

}
