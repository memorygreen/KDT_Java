package javaFestival;

import java.util.Scanner;

public class Ex01_240122 {

	public static void main(String[] args) {
		// 1번 08:34~08:39
		Scanner sc = new Scanner(System.in);
		System.out.print("현재몸무게 : ");
		int kgNow = sc.nextInt();
		System.out.print("목표몸무게 : ");
		int kgGoal = sc.nextInt();

		int cnt = 1;
		while(kgNow > kgGoal) {
			System.out.print(cnt + "주차 감량 몸무게 : ");
			cnt++;
			int kgMinus = sc.nextInt();
			kgNow -= kgMinus;
			
		}System.out.println(kgNow + "kg 달성!! 축하합니다!");
		
		
		
	}

}
