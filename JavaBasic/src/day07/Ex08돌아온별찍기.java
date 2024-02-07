package day07;

public class Ex08돌아온별찍기 {

	public static void main(String[] args) {

		int[] star = { 3, 4, 4, 2, 1 };
		
		
		//쌤 풀이
		// 1. 인덱스 0 개수 만큼 별 찍어보기
		// 2. for문에 넣기
		
		// 인덱스 0
//		System.out.print(star[0] + " : ");
//		for(int j = 1 ; j <= star[0] ; j ++) {
//			System.out.print("*");
//		}System.out.println();
//		
//		// 인덱스 1
//		System.out.print(star[1] + " : ");
//		for(int j = 1 ; j <= star[1] ; j ++) {
//			System.out.print("*");
//		}System.out.println();
//		
//		// 인덱스 2
//		System.out.print(star[2] + " : ");
//		for(int j = 1 ; j <= star[2] ; j ++) {
//			System.out.print("*");
//		}System.out.println();
//		
//		//인덱스 3
//		System.out.print(star[3] + " : ");
//		for(int j = 1 ; j <= star[3] ; j ++) {
//			System.out.print("*");
//		}System.out.println();
//		
//		//인덱스 4
//		System.out.print(star[4] + " : ");
//		for(int j = 1 ; j <= star[4] ; j ++) {
//			System.out.print("*");
//		}System.out.println();
		
		// for문으로 감싸기
		for(int i = 0 ; i < star.length ; i++) {
			System.out.print(star[i] + " : ");
			for(int j = 1 ; j <= star[i] ; j ++) {
				System.out.print("*");
			}System.out.println();
		}
		
		
//		// 자영 풀이
//		for(int i = 0 ; i < star.length;i++) {
//			System.out.print(star[i] + " : ");
//			for(int j = 1 ; j <= star[i]; j++) {
//				System.out.print("*");
//			}System.out.println();
//		}
		// 쌤 힌트(자영 혼자 풀고나서 힌트 들음) 첫줄 별 반복부터 해봐라!! 
		
		//star[0] : 3
//		System.out.print(star[0] + " : ");
//		System.out.print("*");
//		System.out.print("*");
//		System.out.print("*");
//		
//		System.out.println();
//
//		//star[1] : 4
//		System.out.print(star[1] + " : ");
//		System.out.print("*");
//		System.out.print("*");
//		System.out.print("*");
//		System.out.print("*");
//		System.out.println();
//		
//		//star[2] : 4
//		System.out.print(star[2] + " : ");
//		System.out.print("*");
//		System.out.print("*");
//		System.out.print("*");
//		System.out.print("*");
//		System.out.println();
//		
//		//star[3] : 2
//		System.out.print(star[3] + " : ");
//		System.out.print("*");
//		System.out.print("*");
//		System.out.println();
//		
//		//star[4] : 1
//		System.out.print(star[4] + " : ");
//		System.out.print("*");
//		System.out.println();
		
		
	}

}
