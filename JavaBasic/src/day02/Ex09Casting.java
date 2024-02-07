package day02;

public class Ex09Casting {

	public static void main(String[] args) {

		// 자료 형 변환 (Data type Casting)
		int weight = 78;
		
		// 78.0으로 출력하고 싶다
		// 정수 -> 실수로 변환
		
		// 1) 묵시적 형 변환(Implicit Type Casting)
		double cvt_weight = weight; //(double) 안서도됨! 작은범위->큰범위
		System.out.println(cvt_weight); //78.0

		
		// 2) 명시적 형 변환(Explicit Type Casting)
		final double PI = 3.141592;
//		final int CVT_PI = PI;//에러
		final int CVT_PI = (int)PI;//큰범위->작은 범위 //데이터 손실 감안하고 변환하겠다
		System.out.println(CVT_PI); //3
		
	}

}
