package day04;

import java.util.Scanner;

public class Ex04VM_self {

	public static void main(String[] args) {

		//자판기 만들기
		// 1. scanner 설치
		// 2. 투입금액(money) 변수만들기 ("투입 금액 : ")
		// 3. 메뉴&가격 보여주기(3줄로) 
		// 4. 메뉴 번호(menu) 입력하기
		// 5. 1->쌍화차, 2->닥터페퍼, 3->데자와, 이외는 "잘못 입력하셨습니다"
		// 6. 투입금액 > 가격 인 경우에만 해당 메뉴 출력, 투입금액 < 가격인 경우 "금액이 부족합니다" 출력
		// 7. 잔돈(change)변수 생성
		// 8. 잔돈 출력(잔돈 : nnn원)
		// 9. 잔돈에 해당하는 천원 개수(count_1000) 출력 (천원 : n장)
		// 10. 잔돈에 해당하는 오백원 개수(count_500) 출력 (오백원 : n개)
		// 11. 잔돈에 해당하는 백원 개수(count_100) 출력 (백원 : n개)
		
		//1.입력도구 준비
		Scanner sc = new Scanner(System.in);

		//2.투입금액 요청
		System.out.print("투입 금액 : "); //자영아 ln좀 빼자
		int money = sc.nextInt();

		
		//3.메뉴 보여주기
		System.out.println("=======메뉴========");
		System.out.println("[1]솔의눈  [2]아침햇살  [3]데자와");
		System.out.println("   2000원      1500    1000원");
		
		//4.메뉴 입력 요청
		System.out.print("메뉴를 선택해주세요([1]/[2]/[3]) : ");
		int menu = sc.nextInt();
		
		
		//7. 잔돈 변수 출력
		int change = money;
				
		
		//5.요청 메뉴 출력해주기
		//6.투입금액 vs 가격 비교하여 출력해주기(잔액 부족 시 : "금액이 부족합니다")
		if(menu == 1) {
			
			if(money >= 2000) {
				System.out.println("솔의눈");
				change = change - 2000; //(x) change -= 2000
			}else {
				System.out.println("금액이 부족합니다.");
			}
		}else if(menu==2) {
			
			if(money >= 1500) {
				System.out.println("아침햇살");
				change = change - 1500;//(x) change -= 1500
			}else {
				System.out.println("금액이 부족합니다.");
			}
		}else if(menu==3){
			
			if(money >= 1000) {
				System.out.println("데자와");
				change = change - 1000;//(x) change -= 1000
			}else {
				System.out.println("금액이 부족합니다.");
			}
		}else {
			System.out.println("잘못입력하셨습니다. 1~3 중 다시 입력해주세요");
		}
		
		//8.잔돈 알려주기
		System.out.println("잔돈 : " + change + "원");
		
		//9. 잔돈 : 천원 개수
		int count_1000 = change / 1000;
		System.out.println("천원 : " + count_1000 + "장");
		
		//10. 잔돈 : 오백원 개수
		int count_500 = change % 1000 / 500;
		System.out.println("오백원 : " + count_500 + "개");
		
		//11. 잔돈 : 백원 개수
		int count_100 = change % 500 / 100;
		System.out.println("백원 : " + count_100 + "개");
		
	}

}
