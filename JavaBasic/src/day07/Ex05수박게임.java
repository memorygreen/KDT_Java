package day07;

import java.util.Iterator;
import java.util.Scanner;

public class Ex05수박게임 {

	public static void main(String[] args) {

		char[] text = { '수', '박' }; // 자영 : 문자 한글자는 ' '

		// 쌤힌트 힌트
		// 1step - 입력한 숫자만큼 반복문을 만들기
		// 2step - 0부터 입력한 숫자보다 작을때까지 해당 숫자를 출력
		// 예)3->0,1,2 5->0,12,3,4,5
		// 3STEP - 해당 출력하는 숫자를 2로 나눠서 나머지를 출력
		// 4STEP - 그 나머지를 text 배열의 인덱스로 활용
		
		
		//쌤풀이
		Scanner sc = new Scanner(System.in);
		
		System.out.println("==== 수박 게임 Start! ====");
		System.out.print("숫자를 입력해주세요>>");
		int num = sc.nextInt();
		
//		//step1
//		for(int i = 0 ; i < num; i++) {
//			System.out.print(i + " ");
//		}
		
		//step2
//		for(int i = 0 ; i < num; i++) {
//			System.out.print(i % 2 + " ");
//		}
		
		//step4
		for(int i = 0 ; i < num; i++) {
			System.out.print(text[i % 2]);
		}
		
		
		// 힌트 듣고 자영 풀기
//		Scanner sc = new Scanner(System.in);
//		System.out.println("==== 수박 게임 Start! ====");
//		System.out.print("숫자를 입력해주세요>>");
//		int num = sc.nextInt();

//		for (int i = 0; i <= num - 1; i++) {//자영 <num으로 해도 됐는데!!!
////			System.out.print(i % 2);
//			if (i % 2 == 1) {
//				System.out.print(text[1]);
//			} else {
//				System.out.print(text[0]);
//
//			}
//		}

		// 홀짝(나머지)
//		if (num % 2 == 1) {
//				System.out.print(text[0]);
//		} else {
//				System.out.print(text[1]);
//		}

		// for문
//		for(int i = 0;i<text.length ; i++ ) {
//			
//			//홀짝 나머지
//			if (num % 2 == 1) {
//				System.out.print(text[0]);
//		} else {
//				System.out.print(text[1]);
//		}

//	}

		// 자영 푸는중
//		while (num > 0 ) {
//			
//			if(num == 1) {
//				
//			num = num - 1;	
//			
//			}else if(num ==2){
//				System.out.print(text[0]);
//				num = num - 2;	
//			}
//			
//			else if (num > 2) {
//				System.out.print(text[0]);
//				System.out.print(text[1]);
//				num = num - 2;
//			}

//			// 홀짝(나머지)
//			if (num % 2 == 0) {
//				System.out.print(text[1]);
//			} else {
//				System.out.print(text[0]);
//
//			}

		// for
//		for (int i = 0; i < text.length; i++) {
//			
//		}
		// 몫
//		if (num / 2 == 0) {
//
//		} else if (num / 2 == 1) {
//			System.out.print(text[0]);
//			System.out.print(text[1]);
//		} else if (num / 2 == 2) {
//			System.out.print(text[0]);
//			System.out.print(text[1]);
//			System.out.print(text[0]);
//			System.out.print(text[1]);
//		} else if (num / 2 == 3) {
//			System.out.print(text[0]);
//			System.out.print(text[1]);
//			System.out.print(text[0]);
//			System.out.print(text[1]);
//			System.out.print(text[0]);
//			System.out.print(text[1]);
//		} else if (num / 2 == 4) {
//			System.out.print(text[0]);
//			System.out.print(text[1]);
//		}
//		

		// 홀짝(나머지)
//		if (num % 2 == 0) {
//			System.out.println(text[1]);
//		} else {
//			System.out.print(text[0]);
//
//		}

		// =>0, 1

//		if(num == 1) {//1*1+(num % 2)
//			System.out.print(text[0]);
//		}
//		
//		if(num == 2) {//1*2+0
//			System.out.print(text[0]);
//			System.out.print(text[1]);
//		}
//		if(num == 3) {//1*2+1
//			System.out.print(text[0]);
//			System.out.print(text[1]);
//			System.out.print(text[0]);
//		}
//		
//		if(num == 4) {//2*2+0
//			System.out.print(text[0]);
//			System.out.print(text[1]);
//			System.out.print(text[0]);
//			System.out.print(text[1]);
//		}
//		
//		if(num == 5) {//2*2+1
//			System.out.print(text[0]);
//			System.out.print(text[1]);
//			
//			System.out.print(text[0]);
//			System.out.print(text[1]);
//			
//			System.out.print(text[0]);
//		}
//		
//		if(num == 6) {//2*3+0
//			System.out.print(text[0]);
//			System.out.print(text[1]);
//			
//			System.out.print(text[0]);
//			System.out.print(text[1]);
//			
//			System.out.print(text[0]);
//			System.out.print(text[1]);
//		}
//		
//		if(num == 7) {//2*3+1
//			System.out.print(text[0]);
//			System.out.print(text[1]);
//			
//			System.out.print(text[0]);
//			System.out.print(text[1]);
//			
//			System.out.print(text[0]);
//			System.out.print(text[1]);
//
//			System.out.print(text[0]);
//		}

	}
}