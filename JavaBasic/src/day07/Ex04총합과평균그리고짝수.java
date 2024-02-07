package day07;

public class Ex04총합과평균그리고짝수 {

	public static void main(String[] args) {

		//정수형 배열 만들기
		int[] array = {55, 57, 56, 12, 13, 9, 8, 11, 72, 99, 24, 11, 3 }; //자영 : 값도 알고 길이도 알때는 {}로 배열 생성
		
		// 문제
		// 콘솔창에 아래와 같이 결과가 나오게 해주세요
		// 총합 : 430
		// 평균 : 33.07692307...
		// 짝수개수 : 5
		
		
		//선생님 풀이
		int sum = 0;
		int even = 0;
		
		//0번째 인덱스
		// 합 구하기
//		sum += array[0];
		
		//짝수 판별
//		if (array[0] % 2 == 0) {
//			even++;
//		}
		
		//1번째 인덱스
//		sum += array[1];
//		if (array[1] % 2 == 0) {
//			even++;
//		}
		
		
		//2번째 인덱스
//		sum += array[2];
//		if (array[2] % 2 == 0) {
//			even++;
//		}
		
		//
		for (int i = 0 ; i < array.length ; i++) {//배열의 마지막 인덱스 = 길이-1 //'<=' 길이랑 같은만큼 돌면 에러난다!!!
		
			sum += array[i];
			if (array[i] % 2 == 0) {
				even++;
			}
		}
		System.out.println("총합 : " + sum);
		System.out.println("평균 : " + sum / (double)array.length); //자영 : 개수 대신 배열의 길이로!!
		System.out.println("짝수 : " + even);
		
		
		//자영 풀이
//		int sum = 0 ;
//		int cnt = 0;
//		int cnt_even = 0;
//		for(int i = 0 ; i < array.length ; i++) { //'<=' 에러난다!
//			sum = sum +array[i];
//			cnt++;
////			System.out.println("합계 : " + sum);
////			System.out.println("개수 : " + cnt);
//			if (array[i] % 2 == 0) {
//				cnt_even++;
//			}
//		}
//		System.out.println("총합 : " + sum);
//		System.out.println("평균 : " + sum *1.0 / cnt);
//		System.out.println("짝수개수 : " + cnt_even);
	}

}
