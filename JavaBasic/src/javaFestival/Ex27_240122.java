package javaFestival;

import java.util.Scanner;

public class Ex27_240122 {

	public static void main(String[] args) {
		// 27번(2024.01.22. 19:21~19:25)
		
		Scanner sc = new Scanner(System.in);
		System.out.println("=== 채점하기 ====");
		System.out.println("채점결과를 입력하세요.");
		String str = sc.next();
		char[] list = str.toCharArray();
		
		int sum = 0;
		int cnt = 1;
		
		for(int i = 0 ; i < list.length;  i++) {
			if(list[i] == 'o') {
				sum += cnt;
				cnt++;
			}else if(list[i] == 'x') {
				cnt = 1;
				
			}
		}
		System.out.println(sum);

	}

}
