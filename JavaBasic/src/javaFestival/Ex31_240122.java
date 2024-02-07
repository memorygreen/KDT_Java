package javaFestival;

import java.util.Scanner;

public class Ex31_240122 {

	public static void main(String[] args) {
		// 31번(2024.01.22. 19:30~19:34)
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("입력 : ");
		int N = sc.nextInt();
		
		int cnt = 1;
		for(int i = 1 ; i <=N ; i++) {
			cnt = cnt * i;
		}
		System.out.println("출력 : " + cnt);

		
	}

}
