package day05;

public class Ex09별찍기3 {

	public static void main(String[] args) {
		
		
		//선생님 풀이
		
		//첫번째줄
		// 첫번째줄 - 공백부분
		for(int j = 1 ;j <=5 ; j++) { //5칸 공백 만드는 코드
			System.out.print(" ");
		} 
		// 첫번째줄 - 별 부분
		for(int j = 1 ; j <= 1 ; j++) {
			System.out.print("*");
		} System.out.println();
		
		// 두번째줄
		for(int j = 1 ;j <=4 ; j++) { 
			System.out.print(" ");
		} 
		for(int j = 1 ; j <= 2 ; j++) {
			System.out.print("*");
		} System.out.println();
		
		// 세번째줄
		for(int j = 1 ;j <=3 ; j++) { //5칸 공백 만드는 코드
			System.out.print(" ");
		} 
		for(int j = 1 ; j <= 3 ; j++) {
			System.out.print("*");
		} System.out.println();
		
		
		// 네번째줄
		for(int j = 1 ;j <=2 ; j++) { //5칸 공백 만드는 코드
			System.out.print(" ");
		} 
		for(int j = 1 ; j <= 4 ; j++) {
			System.out.print("*");
		} System.out.println();
		
		
		// 다섯번째줄
		for(int j = 1 ;j <= 1 ; j++) { //5칸 공백 만드는 코드
			System.out.print(" ");
		} 
		for(int j = 1 ; j <= 5 ; j++) {
			System.out.print("*");
		} System.out.println();
		
	// 쌤정답
		for (int i = 0 ; i <= 4; i++){
			
			for(int j = 1 ;j <= 5 - i ; j++) { 
				System.out.print(" "); //빈공간
			} 
			for(int j = 1 ; j <= 1 + i ; j++) {
				System.out.print("*"); //별
			} System.out.println();
			
		}
		
		
		
//		for(int i = 5, int k = 1; i >= 1,  k >= 5 ; i--, k++) {
//			
//			for(int j = 1 ;j <= i ; j++) { //5칸 공백 만드는 코드
//				System.out.print(" ");
//			} 
//			for(int j = 1 ; j <= k ; j++) {
//				System.out.print("*");
//			} System.out.println();
//		}
		
//		
//		//현빈님 힌트 듣고 다시 도전(x)
//		
//		for(int i = 1; i <= 5 ; i++) {
//			
////			int k = 6 - j;
////			
//			for(int j = 1 ; (6-j) >= 1 ; j++) { //5칸 공백 만드는 코드
//				System.out.print(" ");
//			} 
//			for(int j = 1 ; j <= 5 ; j++) {
//				System.out.print("*");
//			} System.out.println();
//	
//		}
//		
//		
//		//공백찍기
//		//(6 - i-j >=1, i++, j--)
//		
//		
//		for(int i = 5;i>=1;i--) {
//
//			for(int k = 1 ; k<=i ; k++) {
//				System.out.print("&");
//			}System.out.println();	
//		}
//		
		
//		//별찍기
//		for(int i = 1;i<=5;i++) {
//			for(int j = 1 ; j<=i ; j++) {
//				System.out.print("*");
//			}System.out.println();	
//		}
//		
////		
//		System.out.print("&");
//		System.out.print("&");
//		System.out.print("&");
//		System.out.print("&");
//		System.out.print("&");
//		System.out.print("*");
//		System.out.println();
//		
//		System.out.print("&");
//		System.out.print("&");
//		System.out.print("&");
//		System.out.print("&");
//		System.out.print("*");
//		System.out.print("*");
//		System.out.println();
//		
		
		
//		//1try
//		System.out.println();
//		for(int i = 1 ; i <=5 ; i ++) {
//			for(int j = 1 ; j <= i ; j++) {
//				for(int k = 5 ; k >= 1 ; k--) {
//					System.out.print(" ");
//				}System.out.print("*");
//				
//			}System.out.println();	
//		}
//		
//		//2try
////		System.out.println();
////		for(int i = 1 ; i <=5 ; i ++) {
////			for(int k = 5 ; k >= 1 ; k--){
////				System.out.print(" ");
////				for(int j = 1 ; j <= i ; j++) {
////					System.out.print("*");
////				}
////			}System.out.println();	
////		}
//		
//		//3try
//		System.out.println();
//		for(int i = 1 ; i <=5 ; i ++) {
//
//			for(int j = 1 ; j <= i ; j++) {
//				System.out.print("*");
//			}System.out.println();	
//		}
//		
//		//4try
//		System.out.println();
//		for(int i = 1 ; i <=5 ; i ++) {
//			
//			
//			for(int j = 1 ; j <= i ; j++) {
//				System.out.println();
//				for(int k = 5 ; k >= 1 ; k--) {
//					System.out.print(" ");
//				}System.out.print("*");
//				
//			}System.out.println();	
//		}
		
	}

}
