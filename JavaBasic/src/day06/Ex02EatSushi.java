package day06;

import java.util.Scanner;

public class Ex02EatSushi {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("선수 이름 입력 : ");
		String name = sc.next(); //띄어쓰기 없이 글자 입력받을 수 있음
		
		System.out.print("선수의 총 칼로리 입력 : ");
		int playerKal = sc.nextInt();
		
		System.out.print("스시 한접시 칼로리 입력 : ");
		int sushiKal = sc.nextInt();
		
		//입력 -> 박병관, 300, 30
		//결과 -> 박병관 선수는 총 10접시의 스시를 먹었습니다.
		//입력 -> 선영표, 100, 30
		//결과 -> 선영표 선수는 총 3접시의 스시를 먹었습니다.
		
		
		//선생님 풀이
//		int dish = 0;
//		while(playerKal >= sushiKal) {
//			playerKal = playerKal - sushiKal;
//			dish++;
//	
//		}System.out.println(name + "선수는 총 " + dish + "접시를 먹었습니다.");
//		
		// 자영 풀이
		int cnt = 0;
		while (playerKal > sushiKal) { //자영 >= 틀렷다!!!
			
			playerKal = playerKal - sushiKal;
			cnt++;
		}
		System.out.println(name + " 선수는 총 " + cnt + "접시의 스시를 먹었습니다.");
		
	}

}
