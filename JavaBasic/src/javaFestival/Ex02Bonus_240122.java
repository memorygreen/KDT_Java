package javaFestival;

import java.util.Scanner;

public class Ex02Bonus_240122 {

	public static void main(String[] args) {
		// 보너스2번 (2024.01.22. 12:50~/14:09

		Scanner sc = new Scanner(System.in);
		
		System.out.print("글자를 입력하세요>>");
		String str = sc.next();
		
		System.out.println(getMiddle(str));
	}

	public static String getMiddle(String str) {

		char[] arr = str.toCharArray();

		if (arr.length % 2 == 0) {
			return arr[arr.length / 2 - 1] + "" + arr[arr.length / 2];
		} else {
			return arr[arr.length / 2]+"";
		}
		
	}

}
