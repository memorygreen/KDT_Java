package javaFestival;

import java.util.Scanner;

public class Ex30 {

	public static void main(String[] args) {

		// 30번 (2024.01.23. 08:40~)

//		Scanner sc = new Scanner(System.in);
//		System.out.print("입력>>");
//		String str = sc.next();
//		char[] ch = str.toCharArray();
//
//		char[] alpha = new char[26];
//		for(int i = 97 ; i <= 122 ; i++) {
//			alpha[i-97] = (char) i;
//		}
//			
//		for (int j = 0; j < ch.length; j++) {
//				for (int i = 0; i < alpha.length; i++) {
//				int cnt = 0;
//				System.out.print(alpha[i] + " : ");
//				if (alpha[i] == ch[j]) {
//					cnt++;
//				}
//				System.out.print(cnt);
//			}
//			System.out.println();
//			}

		Scanner sc = new Scanner(System.in);
		System.out.println("==== 알파벳 빈도수 구하기 ====");
		System.out.print("입력>>");
		String str = sc.next().trim().toLowerCase();
		char[] ch = str.toCharArray();

		int[] alpa = new int[26];
		// ch = { aabbccc }

		for (int i = 0; i < ch.length; i++) {
			for (int j = 97; j <= 122; j++) {
				if (ch[i] == j) {// a
					alpa[j - 97] = +1;
				}
			}
		}

		for (int i = 0, j = 97; i < ch.length || j <= 122; i++, j++) {
			System.out.println((char) j + " : " + alpa[i]);
		}

	}

}
