package day06;

import java.util.Random;
import java.util.Scanner;

public class Ex05PlusGame {

	public static void main(String[] args) {

		// 난수(랜덤 숫자)뽑는 방법
		Random ran = new Random();// ctrl + shift + o : 자동 import

//		int num1 = ran.nextInt(100) + 1; // int 범위 : -27억~0~+27억
		// nextInt() 소괄호 안에 숫자 범위 지정 가능
		// ex. ran.nextInt(10) =>0~9//+1 하면 1씩 증가
		// ex. ran.nextInt(10)+1 => 1~10

//		System.out.println(num1);

//		int num2 = ran.nextInt(100) + 1;
//		System.out.println(num2);

		Scanner sc = new Scanner(System.in);

		// 쌤 풀이
		
		//문제 뽑는 부분
		int num1 = ran.nextInt(100) + 1;
		int num2 = ran.nextInt(100) + 1;
		int answer = num1 + num2;

		while (true) {
			System.out.println("==Plus Game==");
			System.out.print(num1 + "+" + num2 + "=");
			int result = sc.nextInt();

			if (answer == result) {
				System.out.println("Success");
				
				//정답일 경우에 문제 새로 뽑기
				num1 = ran.nextInt(100) + 1;
				num2 = ran.nextInt(100) + 1;
				answer = num1 + num2;
				
			} else {
				System.out.println("Fail");

			}
			
			//성공실패 여부 상관없이 물어봄
			System.out.println("계속 하시겠습니까? >>");
			String next = sc.next();
			//대문자 N이나 소문자 n을 만나면 while문 빠져나가서 입력이 안됨
			if (next.equals("N") || next.equals("n")) {
				System.out.println("게임을 종료합니다.");
				break;
			} 

		}

		// 난이도 업

//		int num3 = ran.nextInt(100) + 1;
//		int num4 = ran.nextInt(100) + 1;
//		int answer2 = num3 + num4;

		// 자영 혼자 풀어보기
//		while (true) {
//
//			if (answer == result) {
//				System.out.println("Success");
//
//				break;
//
//			} else {
//				System.out.println("Fail");
//				System.out.print("계속하시겠습니까>>");
//				String fail = sc.next();
////				System.out.println(fail);
////				if (name == "Y") {
//				System.out.print(num1 + "+" + num2 + "=");
//				result =  sc.nextInt();
//			}

//		}System.out.print("계속하시겠습니까?>>");
//		String success = sc.next();
//		System.out.print("새 문제 : " + num3 + "+" + num4 + "=");

		// 자영 풀이

//		System.out.println("==Plus Game==");
//		System.out.print("두 수의 합을 예측해주세요. : ");
//		int predict = sc.nextInt();
//		
//		//Success , Fail 출력하기
//		if (num1 + num2 == predict) {
//			System.out.println("Success");
//		}else { //자영 else를 안 만들었다
//			System.out.println("Fail");
//		}

		// 자영 혼자 반복 게임 만들기

//		System.out.print("두 수의 합을 예측해주세요. : ");
//		int predict = sc.nextInt();
//		while(num1 + num2 == predict) {
//			System.out.println("반복문 만드는중");
//			System.out.println("==Plus Game==");
//			if (num1 + num2 != predict) {
//				System.out.print("두 수의 합을 예측해주세요. : ");
//				System.out.println();
//				System.out.println("Fail");
//				predict = sc.nextInt();
//			}
//			System.out.println("Success");
//		}

	}
}
