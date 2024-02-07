package javaFestival;

import java.util.Scanner;

public class Ex19_240122 {

	public static void main(String[] args) {
		// 19번(2024.01.22. 17:41~17:44)
		
		Scanner sc = new Scanner(System.in);
		System.out.println("단수입력 : ");
		int dan = sc.nextInt();
		System.out.println("어느 수까지 출력 : ");
		int num = sc.nextInt();
		
		System.out.println(dan + "단");
		
		for(int i = 1 ; i <= num ; i++) {
			System.out.printf("%d*%d=%d\n", dan, i, dan*i);
		}

	}

}
