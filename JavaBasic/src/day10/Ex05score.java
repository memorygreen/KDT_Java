package day10;

import java.util.Arrays;

public class Ex05score {

	public static void main(String[] args) {

		// Java Festival 13번
		
		// 쌤풀이
		String score = "A,A,B,C,D,A,C,D,D,D,F";
		
		//특정 문자를 기준으로 구분해주는 메서드 .split
		String[] scores = score.split(",");
		
		// for문으로 배열 출력1
		for(int i = 0 ; i < scores.length ; i++) {
			System.out.print(scores[i]+ " ");
		}
		System.out.println();
		
		// for each 문으로 배열 출력2
		for(String s: scores) {
			
			System.out.print(s + " ");
		}
		System.out.println();
		
		// 배열 값 확인3(자영 놓침ㅜㅜ =>설치해야하는듯)
		System.out.println(Arrays.toString(scores));
		
		// 쌤풀이
		// 개수 세기
		int cntA = 0;
		int cntB = 0;
		int cntC = 0;
		int cntD = 0;
		int cntF = 0;
		
		for(int i = 0 ; i < scores.length ; i++) {
			if(scores[i].equals("A")) {
				cntA++;
			} else if(scores[i].equals("B")) {
				cntB++;
			} else if(scores[i].equals("C")) {
				cntC++;
			} else if(scores[i].equals("D")) {
				cntD++;
			} else {
				cntF++;
			}
			
		}	
		//계
		System.out.println();
		System.out.println("A : " + cntA + "명");
		System.out.println("B : " + cntB + "명");
		System.out.println("C : " + cntC + "명");
		System.out.println("D : " + cntD + "명");
		System.out.println("F : " + cntF + "명");
		
		
		
		//자영
		// 개수 세기
//		int cnt_A = 0;
//		int cnt_B = 0;
//		int cnt_C = 0;
//		int cnt_D = 0;
//		int cnt_F = 0;
//		
//		for(int i = 0 ; i < scores.length ; i++) {
//			if(scores[i].equals("A")) {
//				cnt_A++;
//			} else if(scores[i].equals("B")) {
//				cnt_B++;
//			} else if(scores[i].equals("C")) {
//				cnt_C++;
//			} else if(scores[i].equals("D")) {
//				cnt_D++;
//			} else if(scores[i].equals("F")) {
//				cnt_F++;
//			}
//			
//			//출력해서 확인
//			System.out.print(scores[i]+ " ");
//		}
		
//		//계
//		System.out.println();
//		System.out.println("A : " + cnt_A + "명");
//		System.out.println("B : " + cnt_B + "명");
//		System.out.println("C : " + cnt_C + "명");
//		System.out.println("D : " + cnt_D + "명");
//		System.out.println("F : " + cnt_F + "명");
//		
		
	}

}
