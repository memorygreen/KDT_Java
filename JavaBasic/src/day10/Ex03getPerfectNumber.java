package day10;

public class Ex03getPerfectNumber {

	public static void main(String[] args) {

		int startValue = 2;
		int endValue = 1000;// 많지 않으니 고정
		System.out.println("2~1000까지의 완전수 : ");
		getPerfectNumber(startValue, endValue);

	}
	//쌤풀이( 왜 안나올까ㅠ)
	public static void getPerfectNumber(int startValue, int endValue) {
		
		for(int j = startValue ; j <= endValue ; j++) {
			int sum = 0;
			for (int i = 1; i < j; i++) { // 완전수는 자기 자신 제외하니까 등호표시(x), 부등호 < (o)
				if (j % i == 0) {
					sum += 1;
				}
			}
			if(sum == j)
			System.out.print(j + " ");
		}
		
//		int sum = 0;
//		//쌤풀이 1step ex. 6의 경우 (6 자리가 2~1000까지 변한다!)
//		for (int i = 1; i < 6; i++) { //완전수는 자기 자신 제외하니까 등호표시(x), 부등호 < (o)
//			if (6 % i == 0) {
//				sum += 1;
//			}
//		}
//		
//		if(sum == 6)
//			System.out.println(6);

	}


//	//쌤풀이(hint)
//		
//		for(int i = 1;i < 2 ; i++) {
//			int sum = 0;
//			if(2 % i == 0 ) {
//				sum += i;
//			}
//		}
//		
//		for(int i = 1;i < 3 ; i++) {
//			int sum = 0;
//			if(3 % i == 0 ) {
//				sum += i;
//			}
//		}
//		
//		if(sum == i) {
//			System.out.print(sum);
//		}
//		
	
	
	// 자영 풀이
	public static void getPerfectNumber2(int startValue, int endValue) {

		for (int i = startValue; i <= endValue; i++) {
			int sum = 0;
//			System.out.print(i + "의 약수 : ");//확인용
			for (int j = 1; j < i; j++) {
				// 약수 구하기
				if (i % j == 0) {
					sum = sum + j; // (x) i랑 j를 헷갈리지 말것!!
//				System.out.print(j + " ");//확인용
				}

			}
//			System.out.println();//확인용

			if (sum == i) {
				System.out.print(i + " ");
			}
		}

	}

}
