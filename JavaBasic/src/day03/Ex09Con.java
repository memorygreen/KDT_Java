package day03;

import java.util.Scanner;

public class Ex09Con {

	public static void main(String[] args) {

	    // 사용자로부터 정수를 입력 받아
	    // 만약, 짝수라면 -> "짝수입니다" 출력
	    // 홀수라면 -> "홀수입니다" 출력
	      
		// 1. 입력받기 위한 도구 Scanner 생성
		Scanner sc = new Scanner(System.in);

		// 2. 출력 문구 "정수 입력 : "
		System.out.print("정수 입력 : ");

		// 3. 입력 받은 정수를 int num 에 저장
		int num = sc.nextInt(); //자영 : sc를 꼭 써주자!!!!

		// 4. 만약, num이 짝수라면? (판단 로직)
	    // -> "짝수입니다" 출력
		if(num % 2 == 0) {
			System.out.println("짝수입니다");

		// 5. 홀수라면 -> "홀수입니다" 출력
		}else {
			System.out.println("홀수입니다");
		}
		
	}

}
