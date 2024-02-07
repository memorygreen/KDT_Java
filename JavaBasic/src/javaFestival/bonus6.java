package javaFestival;

public class bonus6 {

	public static void main(String[] args) {
		// Java Festival 보너스 6번 (30분/60점)
		// 2개의 정수 base, n을 받아 base의 n제곱 만큼 값을 반환하는 powerN() 메소드 작성
		
		int base = 2;
		int n = 3;
		int result = powerN(base, n);
		System.out.println("결과확인 : " + result);
		
	}

	public static int powerN(int base, int n) {
		int num = 1;
		for(int i = 0 ; i < n ; i++) {
			num = num * base;
			
		}
		return num;
	}

}
