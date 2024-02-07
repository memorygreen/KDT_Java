package day05;

public class Ex08별찍기2 {

	public static void main(String[] args) {
		
		
		//쌤풀이
		for(int j = 1 ; j<=5 ; j++) {
			System.err.print("*");
		}
		System.out.println();
		
		for(int j = 1 ; j<=4 ; j++) {
			System.err.print("*");
		}
		System.out.println();
		
		for(int j = 1 ; j<=3 ; j++) {
			System.err.print("*");
		}
		System.out.println();
		
		for(int j = 1 ; j<=2 ; j++) {
			System.err.print("*");
		}
		System.out.println();
		
		for(int j = 1 ; j<=1 ; j++) {
			System.err.print("*");
		}
		System.out.println();
		
		//
		for(int i= 5 ; i>= 1 ; i--) {
			for(int j = 1 ; j <= i ; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("자영풀이"); 
		//자영 풀이(긴가민가함)
		for(int i = 5; i>=1; i--) {
			for(int j = 1; j <= i ; j++){
				System.out.print("*");
			}System.out.println();
		}
		
		
		// 자영풀이 차근차근 다시
		System.out.println("step1 : *직접 찍어보기");
		//step1
		System.out.print("*");
		System.out.print("*");
		System.out.print("*");
		System.out.print("*");
		System.out.print("*");
		System.out.println();

		System.out.print("*");
		System.out.print("*");
		System.out.print("*");
		System.out.print("*");
		System.out.println();

		System.out.print("*");
		System.out.print("*");
		System.out.print("*");
		System.out.println();

		System.out.print("*");
		System.out.print("*");
		System.out.println();

		System.out.print("*");
		System.out.println();
		
		//step2
		System.out.println("step2 : 반복문으로 풀기");
		for(int j=1;j<=5;j++) {
			System.out.print("*");
		}System.out.println();
		
		for(int j=1;j<=4;j++) {
			System.out.print("*");
		}System.out.println();
		
		for(int j=1;j<=3;j++) {
			System.out.print("*");
		}System.out.println();
		
		for(int j=1;j<=2;j++) {
			System.out.print("*");
		}System.out.println();
		
		for(int j=1;j<=1;j++) {
			System.out.print("*");
		}System.out.println();
		
		//step3
		System.out.println("step3 : 반복문 반복하기");
		for(int i = 5; i >=1 ; i--) {
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}System.out.println();
		}
		
//		System.out.println("증가식으로 풀어보기".. 무한반복됨); 
//		System.out.println("step3 : 반복문 반복하기");
//		for(int i = 1; (1+5) - i <= 5 ; i++) {
//			for(int j = 1 ; j <= i ; j++) {
//				System.out.print("*");
//			}System.out.println();
//		}
//		
//		System.out.println("이건뭐야");
//		//????
//		for(int j=5;j>=5;j--) {
//			System.out.print("*");
//		}System.out.println();
//			
//		System.out.println("이게뭐지");
//		for(int j = 1; j <= 5 ; j++){
//			System.out.print("*");
//		}System.out.println();
//	
		
	}

}
