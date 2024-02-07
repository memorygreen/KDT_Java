package day06;

import java.util.Scanner;

public class Ex07숫자놀이 {

	public static void main(String[] args) {

		// 쌤풀이
		Scanner sc = new Scanner(System.in);

		int num = 0; // {}밖에서도 쓰기 위해서 {} 밖에서 선언
		int sum = 0; //총합을 저장할 변수 선언
		int cnt = 0;
		
		do {
			System.out.print("숫자를 입력하세요 >>");
			num = sc.nextInt();
			sum += num;//sum = sum + num 
			cnt++;
		} while (num <= 100);
		
		sum -= num;
		cnt--; //cnt를 -1부터 시작하는 방법도 있다!
		
		System.out.println(sum);
//		System.out.println(sum * 1.0/ cnt);//형변환 sol1
		System.out.println((double)sum / cnt);//형변환 sol2
		
		
		// 자영 풀이
//		Scanner sc = new Scanner(System.in);

//		int num;
//		int sum = 0;
//		int cnt = 0;
//		do {
//			System.out.println("숫자를 입력하세요 ");
//			num = sc.nextInt();
//			sum = sum + num;
//			cnt++;
//		} while (num <= 100);
//		System.out.println("합계 : " + (sum - num));
//		System.out.println("평균 : " + (sum - num) / (double) --cnt);

		
		
	}

}
