package day06;

import java.util.Scanner;

public class Ex04다이어트 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		//쌤풀이
		// 현재 몸무게 입력받기
		System.out.print("현재몸무게 : ");
		int nowKg = sc.nextInt();
		
		// 목표 몸무게 입력받기
		System.out.print("목표몸무게 : ");
		int goalKg = sc.nextInt();
		
		int week = 1;//주차
		
		while(nowKg > goalKg) {
			
			System.out.println(week + "주차 감량 몸무게 : ");
			//감량 몸무게 입력받기
			int minusKg = sc.nextInt();
					
			nowKg = nowKg - minusKg;
			week++;
		}
		System.out.println(nowKg + "Kg 달성!! 축하합니다.");
		
		
		//자영 풀이
		System.out.println("자영풀이");
		
		System.out.print("현재몸무게 : ");
		int currentWeight = sc.nextInt();
		
		System.out.print("목표몸무게 : ");
		int goalWeight = sc.nextInt();
				
		int cnt = 0;		
		
		while (currentWeight > goalWeight) {
			cnt++;
			System.out.print(cnt + "주차 감량 몸무게 : ");
			int minus = sc.nextInt();
			currentWeight = currentWeight - minus;
			
		}System.out.println(currentWeight + "kg 달성!! 축하합니다!");
	}

}
