package day05;

public class Ex07별찍기 {

	public static void main(String[] args) {
		
		// 쌤풀이
		// 1step - 별 하나 짜리를 반복문으로 5개 찍어보기
		
		//첫번째줄
//		System.out.print("*");
//		System.out.println();

		//두번째줄
//		System.out.print("*");
//		System.out.print("*");
//		System.out.println();
		
		//세번째줄
//		System.out.print("*");
//		System.out.print("*");
//		System.out.print("*");
//		System.out.println();
		
//		//네번째줄
//		System.out.print("*");
//		System.out.print("*");
//		System.out.print("*");
//		System.out.print("*");
//		System.out.println();
		
		//다선번째줄
//		System.out.print("*");
//		System.out.print("*");
//		System.out.print("*");
//		System.out.print("*");
//		System.out.print("*");
//		System.out.println();
		
		// 1step - 별 하나 짜리를 반복문으로 5개 찍어보기
		for(int j = 1; j <= 5 ; j++) {
			System.out.print("*");
		}System.out.println();
		
		// 2step - 각 줄별로 반복문으로 별을 직어보기
		// 첫번째줄
		for(int j = 1; j <= 1 ; j++) {
			System.out.print("*");
		}System.out.println();
		
		// 두번째줄
		for(int j = 1; j <= 2 ; j++) {
			System.out.print("*");
		}System.out.println();
		
		// 세번째줄
		for(int j = 1; j <= 3 ; j++) {
			System.out.print("*");
		}System.out.println();
		
//		// 네번째줄
		for(int j = 1; j <= 4 ; j++) {
			System.out.print("*");
		}System.out.println();
		
		//다섯번째줄
		for(int j = 1; j <= 5 ; j++) {
			System.out.print("*");
		}System.out.println();
		
		// 3step - 패턴을 반복문으로 처리하기
		for(int i = 1; i<= 5; i++) {//몇줄까지
			for(int j = 1; j <= i ; j++) {// 한줄에 몇개
				System.out.print("*");
			} System.out.println();
		}

//		자영 푸는 중(x)
//			for(int i = 1; i<=5 ; i++) {//번째줄
//				System.out.println("*");
//				for(int j = 1;j<=i;j++) { //반복횟수
//					System.out.print("*");
//				}
//			}
		}

}
