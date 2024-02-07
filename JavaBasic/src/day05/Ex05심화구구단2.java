package day05;

public class Ex05심화구구단2 {

	public static void main(String[] args) {
		
		
		// 쌤풀이
		
//		System.out.print(2 + "단 : ");
//		System.out.print(2 + "*" + 1 + "=" + 2 * 1 + " ");
//		System.out.print(2 + "*" + 2 + "=" + 2 * 2 + " ");
//		System.out.print(2 + "*" + 3 + "=" + 2 * 3 + " ");
//		System.out.print(2 + "*" + 4 + "=" + 2 * 4 + " ");
//		System.out.print(2 + "*" + 5 + "=" + 2 * 5 + " ");
//		System.out.print(2 + "*" + 6 + "=" + 2 * 6 + " ");
//		System.out.print(2 + "*" + 7 + "=" + 2 * 7 + " ");
//		System.out.print(2 + "*" + 8 + "=" + 2 * 8 + " ");
//		System.out.print(2 + "*" + 9 + "=" + 2 * 9 + " ");
		
		
		//step2
//		System.out.print(2 + "단 : ");
//		for(int j = 1; j <= 9 ; j++) {
//			System.out.print(2 + "*" + j + "=" + 2 * j + " ");
//		}System.out.println();
//		
//		System.out.print(3 + "단 : ");
//		for(int j = 1; j <= 9 ; j++) {
//			System.out.print(3 + "*" + j + "=" + 3 * j + " ");
//		}System.out.println();
//		
//		System.out.print(4 + "단 : ");
//		for(int j = 1; j <= 9 ; j++) {
//			System.out.print(4 + "*" + j + "=" + 4 * j + " ");
//		}System.out.println();
//		
//		
//		System.out.print(5 + "단 : ");
//		for(int j = 1; j <= 9 ; j++) {
//			System.out.print(5 + "*" + j + "=" + 5 * j + " ");
//		}System.out.println();
		
		//step3
		for(int i = 2; i <= 9; i++) {
			System.out.print(i + "단 : ");
			for (int j = 1; j <= 9 ; j++) {
				System.out.print(i + "*" + j + "=" + i * j + " ");
			} System.out.println();
			
		}
		
		
		
		// 자영 풀이
//		for(int i = 2 ; i <= 9 ; i++) {
//			System.out.print(i + "단 : " + " ");
//			for(int j = 1 ; j <= 9 ; j++) {
//				System.out.print(i + "*" + j + "=" +  i * j + " ");
//			}
//			System.out.println();
//			
//		}
		
	}

}
