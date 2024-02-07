package day02;

public class Ex00Float {

	public static void main(String[] args) {
		// float : 4byte
		// int : 4byte
		
//		int num = 7;
//		float num2 = num;
//		float num3 = 7.2f;
//		int num4 = num3; //에러
		
		
		// 프로그래밍 언어에서 실수부(소수점 이하)를 표현하는 방식
		// 1. 고정 소수점 방식
		// 정확하다, 그 외의 값은 근사
		//10 => 1010(2) (정수는 정확히 표현)
		//10.5 => 
		
		// 2. 부동 소수점 방식
		// 범위가 넓다(but 부정확)
		// 10.6 -> 106 * 10^-1 (106 = 가수부, 10^-1 = 소수부)
		//float -> 4byte
		//32bit
		//1bit -> 부호, 0이면 양수, 1이면 음수
		//8bit ->가수부
		//23bit->지수부
		
//		부동 소수점 방식 정확x
		double num1 = 1.1;
		double num2 = 2.2;
		System.out.println(num1 + num2); //3.3000000000000003

		
		
	}

}
