package javaFestival;

import java.util.Random;
import java.util.Scanner;

public class Ex29_240122 {

	public static void main(String[] args) {
		// 29번 (2024.01.22. 19:51~19:55)

		Random ran = new Random();
		int num1 = ran.nextInt(10);
		int num2 = ran.nextInt(10);

		System.out.print(num1 + " + " + num2 + " = ");

		Scanner sc = new Scanner(System.in);

		for (int i = 1; i <= 5; i++) {

			int pre = sc.nextInt();
			if (num1 + num2 == pre) {
				System.out.println("SUCCESS!");
			} else if (num1 + num2 != pre) {
				System.out.println("Fail...");
			}
		}
		System.out.println("GAME OVER!");

	}

}
