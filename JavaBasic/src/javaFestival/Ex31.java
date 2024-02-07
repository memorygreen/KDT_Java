package javaFestival;

import java.util.Scanner;

public class Ex31 {

	public static void main(String[] args) {

		// Java Festival 31번 (35분/45점)

		Scanner sc = new Scanner(System.in);
		System.out.print("입력 : ");
		int num = sc.nextInt();

		int pacto = 1;
		for (int i = 1; i <= num; i++) {
			pacto = pacto * i;
		}
		System.out.print("출력 : " + pacto);

	}
}
