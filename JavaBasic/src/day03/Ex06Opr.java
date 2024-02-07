package day03;

import java.util.Scanner;

public class Ex06Opr {

	public static void main(String[] args) {

		// 삼항 연산자
		// 6. 조건 연산자
		// (조건식) ? (실행문1) : (실행문2)
		
		boolean isRainy = false;
		String result = (isRainy) ? "비가 온다" : "비가 오지 않는다";
		System.out.println(result);//비가 오지 않는다
		
		// 10은 짝수인가요 홀수인가요? -> 짝수
		// 9는 홀수
		// (2로 나눴을 때 나머지 0이면 짝수 1이면 홀수)
		
		
		//자영 : 조건문에 숫자10 직접 입력하는 경우
		String isEven1 = (10 % 2 == 0) ? "짝수" : "홀수" ;
		System.out.println(isEven1);//짝수
		
		//자영 : 조건문에 변수 넣는 경우
		int num1 = 9;
		String isEven2 = (num1 % 2 == 0) ? "짝수" : "홀수" ;
		System.out.println(isEven2);//홀수
		
		//자영 : 조건문에 들어갈 숫자를 입력하는 경우
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력하세요 : ");
		int num = sc.nextInt(); //대입연산자, 오른쪽 먼저 실행//. : '안에 있는'
		String isEven = (num % 2 == 0) ? "짝수" : "홀수" ;
		System.out.println(isEven);//짝수
		
	}

}
