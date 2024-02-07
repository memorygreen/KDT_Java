package javaFestival;

import java.util.Scanner;

public class Ex25_240122 {

	public static void main(String[] args) {
		// 25번(2024.01.22. 19:07~19:14)
		
		Scanner sc = new Scanner(System.in);
		System.out.print("첫자리 0을 제외한 숫자를 입력해주세요>>");
		String num = sc.next();
		char[] list = num.toCharArray();
		
		sc.close();
		
		int sum = 0;
		for(int i = 0 ; i < list.length ; i++) {
			switch(list[i]) {
			case '1' : sum += 2;break;
			case '2' : sum += 5;break;
			case '3' : sum += 5;break;
			case '4' : sum += 4;break;
			case '5' : sum += 5;break;
			case '6' : sum += 6;break;
			case '7' : sum += 3;break;
			case '8' : sum += 7;break;
			case '9' : sum += 6;break;
			case '0' : sum += 6;break;
			}
			
		}
		
		System.out.println("대시('-')의 총 합 >>" + sum);
	}

}
