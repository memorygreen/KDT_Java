package javaFestival;

import java.util.Scanner;

public class Ex30_240122 {

	public static void main(String[] args) {
		// 30번 (2024.01.22. 19:34~)
		
		System.out.println("==== 알파벳 빈도수 구하기====");
		System.out.print("입력>>");
		
		Scanner sc = new Scanner(System.in);
		String str = sc.next().trim().toLowerCase();
		
		char[] list = str.toCharArray();
		
		
		//알파벳 담을 배열 만들기
		char[] alpha = new char[26];
		for(int i = 97 ; i <= 122 ; i++) {
			alpha[i - 97] = (char)i;
		}
		
		
		
		
		// 알파벳 나오게
		for(int i = 97, j = 0; i < alpha.length ; i++, j++) { //97~122
			System.out.print(alpha[i - 97] + ": ");
			
			if(alpha[i - 97] == list[j]) {
				int cnt = 0;
				cnt++;
				System.out.print(cnt);
				System.out.println();
			}else if (alpha[i - 97] != list[j]) {
				System.out.println(0);
				System.out.println();
			}
		}
			
			
			
//			for(int j = 0 ; ; j++) {
//				
//			}
//		}
//		
//		for(int j = )
		

	}

}
