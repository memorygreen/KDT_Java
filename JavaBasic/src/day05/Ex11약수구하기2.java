package day05;

public class Ex11약수구하기2 {

	public static void main(String[] args) {

		//선생님 힌트
		
		//2의 약수 구하기
		System.out.print(2 + "의 약수 : ");
		for(int j = 1; j <= 2 ; j ++) {
			if(2 % j == 0) {
				System.out.print(j + " ");
			}
		}System.out.println();
		
		
		//3의 약수 구하기
		System.out.print(3 + "의 약수 : ");
		for(int j = 1; j <= 3 ; j ++) {
			if(3 % j == 0) {
				System.out.print(j + " ");
			}
		}System.out.println();
		
		//선생님 최종
		for(int i = 2; i<=30; i++) {		
			System.out.print(i + "의 약수 : ");
			for (int j = 1; j <= i ; j ++) {
				if(i % j == 0) {
					System.out.print(j + " ");
				}
			}
			System.out.println();
		}
		
		
		//자영 풀이
		for(int i=2 ; i <= 30; i++) {
			System.out.print(i + "의 약수 : ");
			for(int j = 1; j<=i; j++) {
				if(i % j == 0)
				System.out.print(i + " ");
				
			}System.out.println();
		}
		
	}

}
