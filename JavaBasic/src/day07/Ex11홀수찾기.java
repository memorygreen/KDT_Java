package day07;

public class Ex11홀수찾기 {

	public static void main(String[] args) {

		int[] array = { 1, 9, 6, 8, 12, 15, 16, 18, 22, 27, 31, 35, 40 };

		// 문제
		// 홀수의 개수를 찾아 출력문으로 알려주세요
		// 실행결과) 홀수 개수 : 6
		// for(:){}
		// 쌤풀이
		int cnt = 0; //홀수 개수를 체크할 변수
		
		for(int num : array) {
			if(num % 2 == 1 ) {
				cnt++;
			}
		}
		
		System.out.println("홀수 개수 : " + cnt);
		
		
		//자영 풀이
//		int cnt_odd = 0;
//		for (int odd : array) {
//
//			if (odd % 2 == 1) {
////				System.out.println(odd);
//				cnt_odd++;
//			}
//		}
//		System.out.println("홀수 개수 : " + cnt_odd);

	}

}
