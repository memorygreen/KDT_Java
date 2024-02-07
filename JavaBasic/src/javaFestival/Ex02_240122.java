package javaFestival;

import java.util.Scanner;

public class Ex02_240122 {

	public static void main(String[] args) {
		// 2번 2024.01.22 08:40~08:44
		Scanner sc = new Scanner(System.in);
		
		System.out.print("일한시간을 입력하세요 : ");
		int time = sc.nextInt();
		
		int pay = 0;
		if(time > 8) {
			pay = (int)((time - 8) * 5000 * 1.5 + 8 * 5000);
		}else {
			pay = time * 5000;
		}
		System.out.println("총 임금은 " + pay + "원 입니다.");
	}

}
