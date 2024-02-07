package javaFestival;

import java.util.Scanner;

public class Ex07_20240122 {
	public static void main(String[] args) {
	//7번 2024.01.22. 11:56~/12:18
	
	Scanner sc = new Scanner(System.in);
	
	System.out.println("행 개수 : ");
	int num = sc.nextInt();
	
	for (int i = num ; i > 0  ; i--) {
		
		for(int j = 1 ; j <= i ; j++) {
			System.out.print("*");
		}System.out.println();
	}
	
}
}