package day04;

import java.util.Scanner;

public class Ex02Con {

	public static void main(String[] args) {

		
		// 사용자로부터 점수를 입력 받아
	    // 변수 totalScore에 저장
        // 점수가 90점 이상이면 "A"출력
	    // 80점 이상 90점 미만이면 "B"출력
	    // 70점 이상 80점 미만이면 "C"출력
	    // 60점 이상 70점 미만이면 "D"출력
	    // 60점 미만이면 "F"출력
		

		Scanner sc = new Scanner(System.in);
		System.out.print("점수 입력 : "); //자영아 ln빼자
		int totalScore = sc.nextInt(); // 에러:자영아 변수명 오타 내지말자
		
		if(totalScore >= 90) {
			System.out.println("A");
		} else if(totalScore >= 80) {
			System.out.println("B");
		} else if(totalScore >= 70) {
			System.out.println("C");
		} else if(totalScore >= 60) {
			System.out.println("D");
		} else {
			System.out.println("F");
		}
		
		
	}

}
