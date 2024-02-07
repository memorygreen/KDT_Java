package day04;

import java.util.Scanner;

public class Ex04VM {

	public static void main(String[] args) {

		// 자판기 만들자
		Scanner sc = new Scanner(System.in);
		System.out.print("투입 금액 : ");//(x)자영아 ln빼라
		int money = sc.nextInt();
		System.out.println("=======메뉴=======");
		System.out.println("[1]쌍화차 [2]Dr.Pepper [3]데자와" );
		System.out.println("  2000원     1500원     1000원");
		System.out.print("메뉴를 선택하세요 : ");//(x)자영아 ln빼라22
		int menu = sc.nextInt();
		
		int change = money; //처음 잔돈==투입금액
		
		
		if(menu == 1) {
			
			if(money >= 2000) {
				System.out.println("쌍화차");
//				change = change - 2000;
				change -= 2000; //복합대입연산자로 바꾸기!
			}else {
				System.out.println("금액이 부족합니다"); //금액 부족하면 잔돈 계산 안 해도 됨
			}
			
		}else if(menu ==2) {
			if(money >= 1500) {
				System.out.println("Dr.Pepper");
				change -= 1500;
			}else{
				System.out.println("금액이 부족합니다");//(x)자영틀림 : esle 안에 넣어야한다
			}
		}else if(menu ==3) {
			if(money >= 1000) {
				System.out.println("데자와");
				change -= 1000;
			}else {
				System.out.println("금액이 부족합니다");
			}
		}else {
			System.out.println("잘못 입력하셨습니다"); //(x)자영틀:else는 1-3 이외경우!
		}
		
		System.out.println("잔돈 : " + change + "원"); //(x)자영틀 : 잔돈은 if문 밖에 빼자!!!(공통으로 나오니까)
		
		// 만약, 잔돈이 8000원이라면
		// 천원 : 8장
		int count_1000 = change / 1000;
		System.out.println("천원 : " + count_1000 + "장");
		
		int count_500 = (change % 1000) / 500; //(x) 자영 시간부족(500으로 나누는 건 생각했는데 1000원으로 나눈 나머지인걸 생각못함!!!!)
		System.out.println("오백원 : " + count_500 + "개");
		
//		int count_100 = change % 1000 % 500 / 100; //(x) 자영 생각못함(알고리즘 중!! 수학적 테크닉!!)
		int count_100 = change % 500 / 100; //(x)=>줄일수있다! ex. 8700원을 500으로 나눈 묶음으로 처리 17개, 나머지 200원을 100으로 나눠
		System.out.println("백원 : " + count_100 + "개");
		
		
	}

}
