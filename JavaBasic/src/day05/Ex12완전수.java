package day05;

public class Ex12완전수 {

	public static void main(String[] args) {
		// 힌트
		// 1STEP - 6을 기준으로 약수 구하는 코드 작성
		// 2STEP - 6을 제외한 약수의 총합 구하기
		// 3STEP - 약수의 총합과 6을 비교해서 동일하면 해당 수 출력
		// 4STEP - 1~3STEP 코드를 1000까지 반복 작성
		// 5STEP - 패턴을 찾아 반복문으로 처리

		// 쌤 풀이
		// 1STEP - 6을 기준으로 약수 구하는 코드 작성
//		for(int j = 1 ; j <= 6 ; j++) { //j가 6의 약수!
//			if(6 % j == 0) {
//				System.out.print(j + " ");
//			}
//		}System.out.println();

		// 2STEP - 6을 제외한 약수의 총합 구하기

		// 약수의 총합을 저장할 변수
//		int sum = 0;
//		
//		for(int j = 1 ; j < 6 ; j++) { //6 자기 자신을 제외한 약수의 총합을 구해야하니까!!
//			if(6 % j == 0) {
//				sum = sum + j;//sum += j;
//			}
//		}
		

		// 3STEP - 약수의 총합과 6을 비교해서 동일하면 해당 수 출력

//		if(sum == 6) {
//			System.out.println(6);
//		}

		
		//쌤 풀이 이어서
		
		int sum = 0;
		for(int i = 1 ; i<=1000 ; i++) {
			sum = 0;
			for (int j = 1; j < i; j++) { 
				if (i % j == 0) {
					sum = sum + j;// sum += j;
				}
			}
			if (sum == i) {
				System.out.println(i);
			}			
			
		}

		
		// 자영 힌트 듣고 다시 풀어보기(step4부터~)

//		int sum = 0;
//		for (int i = 1; i <= 1000; i++) {
//			for (int j = 1; j < i; j++) {
//				if (i % j == 0) {
//					
//					sum = sum + j;// sum += j;
//				}
//			}
//			System.out.println(sum);
//
//			if (sum == i) {
//				System.out.println(i); //6 , 28 , 496
//				
//			}sum = 0;
//
//		}

		// 자영 하는 중
		// 1STEP - 6을 기준으로 약수 구하는 코드 작성
		// 2STEP - 6을 제외한 약수의 총합 구하기
//		int sum = 0;
//
//	
//		for(int j = 1 ; j <= 6 ; j++) {
//			if(6 % j == 0 ) {
//				sum = sum + j;
//				System.out.print(j + " ");
//			}
//		}System.out.println("합계 : " + (sum-6));
//		
//
//		// 3STEP - 약수의 총합과 6을 비교해서 동일하면 해당 수 출력
//
//		for(int i = 1 ; i <= 6; i ++) {
//			for(int j = 1 ; j <= i ; j++) {
//				if(i % j == 0 ) {
//					
//					sum = sum + j;
//					System.out.print(j + " ");
//				}
//			} System.out.println(i + "의 약수 합계 : " + (sum-i));
//			if((sum-i) == i) {
//				System.out.print(i);
//			}
//			
//		}

		// 4STEP - 1~3STEP 코드를 1000까지 반복 작성
		// 5STEP - 패턴을 찾아 반복문으로 처리

		// 자영 풀이(시도중)
//		for (int i = 1;i<=1000 ; i++) {
//		
//			System.out.print(i + "의 약수 : ");
//			for (int j = 1;j <= i;j++) {
//				
//				int sum = 0;
//				sum = sum + j;
//				if(i % j == 0 ) {
//					System.out.print(j + " ");
//				}
//				if (sum == j) {
//					System.out.println(j + " 자기자신 제외 약수의 합 : " + sum); 
//				}
//			}System.out.println();
//			
//		}

	}

}
