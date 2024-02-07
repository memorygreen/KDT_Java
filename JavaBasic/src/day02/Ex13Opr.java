package day02;

import java.util.Scanner;

public class Ex13Opr {

	public static void main(String[] args) {

		// 두개의 정수를 입력 받아 두 수 의 더하기, 빼기 곱하기, 나누기(몫) 결과값을 출력하세요

		// 문제정의
		// 1. 입력 받기 위한 도구 Scanner 를 만들자
		Scanner sc = new Scanner(System.in);

		// 2. 사용자에게 "첫 번째 정수 입력 : " 문구 출력
		System.out.print("첫 번째 정수 입력 : ");

		// 3. 입력받은 정수를 변수 num1 에 저장
		int num1 = sc.nextInt();

		// 4. 사용자에게 " 두번째 정수 입력 : " 문구 출력
		System.out.print("두 번째 정수 입력 : ");

		// 5. 입력받은 정수를 변수 num2에 저장
		int num2 = sc.nextInt();

		// 6. "두 수의 더하기 : " 문구와 함께
		// 두 수를 더한 값을 출력
		// 한 줄 복사 : Ctrl + Alt + 위/아래 방향키
		// 7. ~ 9. 6.을 비슷하게
		System.out.println("두 수의 더하기 : " + (num1 + num2)); // 자영 틀림!! 뒤에 괄호로 먼저 묶어야함!!
		System.out.println("두 수의 빼기 : " + (num1 - num2));
		System.out.println("두 수의 곱하기 : " + num1 * num2);
		System.out.println("두 수의 나누기(몫) : " + num1 / num2);
		
		
		long num3 = 3000000000L; 
//		long num3 = (long)3000000000; //이미 벗어나고 선언됨
		
		float num5 = 7.0f; //double을 명시해서 넣는다
		float num6 = 7.0f;
		
	}

}
