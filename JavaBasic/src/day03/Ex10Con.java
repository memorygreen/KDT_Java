package day03;

import java.util.Scanner;

public class Ex10Con {

	public static void main(String[] args) {

		// 사용자로부터 정수를 입력 받아
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 : "); //자영 틀림 : ln 날리자!!
		int num = sc.nextInt();
		// 3의 배수이면서 5의 배수라면
		// "3과 5의 배수 입니다" 출력
		
		if(num % 3 == 0 && num % 5 == 0) { //비교, 논리연산자 사용 //자영아쉽 : 괄호 안 써도 ㄱㅊ 써도 ㄱㅊ
//		if(num % 15 == 0) { //문제에 있는 말x 결과동일 but 좋은코드x 사람이 판단해서 15의배수 =>컴퓨터가 계산할 수 있도록 다 &&로 풀어써야 좋음!
			System.out.println("3과 5의 배수입니다");

		// 아니라면, "3과 5의 배수가 아닙니다" 출력
		}else {
			System.out.println("3과 5의 배수가 아닙니다");
		}
	}

}
