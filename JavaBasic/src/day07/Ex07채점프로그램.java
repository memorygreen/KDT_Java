package day07;

import java.util.Scanner;

public class Ex07채점프로그램 {

	public static void main(String[] args) {

		// 사용자가 입력한 답이 저장될 배열
		int[] input = new int[5];

		// 실제 정답 배열
		int[] answer = { 1, 4, 3, 2, 1 };

		// 쌤풀이
		Scanner sc = new Scanner(System.in);

		System.out.println("==채점하기==");
		System.out.println("답을 입력하세요");

		// 자영 : 입력하기 - 0~4번째(길이:5) 풀어서 써보기
//		System.out.print(0 + 1 + "번답 >> ");
//		input[0] = sc.nextInt();
//		
//		System.out.print(1 + 1 + "번답 >> ");
//		input[1] = sc.nextInt();
//		
//		System.out.print(2 + 1 + "번답 >> ");
//		input[2] = sc.nextInt();
//		
//		System.out.print(3 + 1 + "번답 >> ");
//		input[3] = sc.nextInt();
//		
//		System.out.print(4 + 1 + "번답 >> ");
//		input[4] = sc.nextInt();

		// 패턴 발견 -> for 문으로
		for (int i = 0; i < input.length; i++) {
			System.out.print(i + 1 + "번답 >> ");
			input[i] = sc.nextInt();

		}

		// 출력하기
//		System.out.print("입력한 답은 : ");
//		for(int i = 0 ; i < input.length; i++) {
//			System.out.print(input[i] + " ");
//		}

		// 채점하기

		// 자영 : hint1 : 같은 위치끼리 비교
		// hint2 : 20점씩 누적해서 더하기

		// 쌤풀이

		System.out.println();
		System.out.println("정답 확인");

		int sum = 0; // 총점을 저장할 변수
		
		
		//인덱스 0
//		if (input[0] == answer[0]) {
//			System.out.println("0");
//			sum += 20;
//		} else {
//			System.out.println("X");
//		}
//		
//		//인덱스1
//		if (input[1] == answer[1]) {
//			System.out.println("0");
//			sum += 20;
//		} else {
//			System.out.println("X");
//		}
		
		//for문으로 작성하기
		for(int i = 0 ; i < input.length ; i++ ) {
			if (input[i] == answer[i]) {
				System.out.print("0 ");
				sum += 20;
			} else {
				System.out.print("X ");
			}
		}System.out.print("총점 : " + sum);

		
		
		// 자영풀이(채점 부분)
//		System.out.println();
//		System.out.println("정답 확인");
//		int cnt = 0;
//		for(int i = 0 ; i < input.length;i++) {
//		
//			if(input[i] == answer[i]) {
//				cnt++;
//				System.out.print("O" + " ");
//			}else {
//				System.out.print("X" + " ");
//			}
//			
//		}System.out.println(" 총점 : " + cnt * 20);

		// 자영 풀이
//		Scanner sc = new Scanner(System.in);
//
//		System.out.println("==채점하기==");
//		System.out.println("답을 입력하세요");
//
//		for (int i = 0; i < input.length; i++) {
//			System.out.print(i + 1 + "번답 >>");
//			int num = sc.nextInt();
//			input[i] = num;
//		} System.out.print("입력한 답은 : ");
//		for (int i = 0; i < input.length; i++) {
//			System.out.print(input[i] + " ");
//		}

	}

}
