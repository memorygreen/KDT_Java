package javaFestival;

import java.util.Scanner;

public class Ex15 {

	public static void main(String[] args) {

		
		Scanner sc = new Scanner(System.in);
		System.out.print("n 입력 : ");
		int n = sc.nextInt();
		
		int cnt = 1;
//		cnt += 1;//2
//		cnt += 2;//4
//		cnt += 3;//7
//		cnt += 4;//11
//		
		for(int i = 1 ; i <= n ; i++) {
			cnt += i;
			System.out.print(cnt + " ");
		}
		
		
		
	}

}
