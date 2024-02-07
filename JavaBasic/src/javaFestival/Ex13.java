package javaFestival;

import java.util.Arrays;

public class Ex13 {

	public static void main(String[] args) {

		// Java Festival 13번(15분/25점)
		// 아래와 같이 학생들의 성적정보가 문자열로 선언되어 있을 때 각 성적 별 학생 수를 출력하시오

		// 결과화면
		// A : 3명
		// B : 1명
		// C : 2명
		// D : 4명
		// F : 1명

		String score = "A,A,B,C,D,A,C,D,D,D,F";
		// 배열에 넣기
		String[] scores = score.split(","); // split 메서드! 기호를 기준으로 잘라줄 수 있다!!

		// 배열 출력1(확인용)
//		for (int i = 0; i < scores.length; i++) {
//
//			System.out.print(scores[i] + " ");
//		}
//		System.out.println();
		
		// 배열 출력2(확인용)
//		for (String s : scores) {
//			System.out.print(s + " ");
//		}System.out.println();

		// 배열 출력3(확인용)
//		System.out.println(Arrays.toString(scores));
		
		
		int cntA = 0;
		int cntB = 0;
		int cntC = 0;
		int cntD = 0;
		int cntF = 0;
		
		for (int i = 0; i < scores.length; i++) {
			if(scores[i].equals("A")) {
				cntA++;
			}else if(scores[i].equals("B")) {
				cntB++;
			}else if(scores[i].equals("C")) {
				cntC++;
			}else if(scores[i].equals("D")) {
				cntD++;
			}else {
				cntF++;
			}
			

		}			
		System.out.println("A : " + cntA + "명");
		System.out.println("B : " + cntB + "명");
		System.out.println("C : " + cntC + "명");
		System.out.println("D : " + cntD + "명");
		System.out.println("F : " + cntF + "명");
		

		
		
	}

}
