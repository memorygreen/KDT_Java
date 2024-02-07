package javaFestival;

import java.util.Iterator;
import java.util.Scanner;

public class final_240123 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("일한시간을 입력하세요 : ");
		
		int h = sc.nextInt();
		
		if(h > 8) {
			int sum = (int)(5000 * 8 + (h-8) * 1.5 * 5000);
			System.out.println("총 임금은 " + sum + "원 입니다.");
		}

	}
}
