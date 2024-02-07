package day04;

import java.util.Scanner;

public class Ex01Con {

	public static void main(String[] args) {
		
		//(어제 복습)
		// 대입 연산자 
		// = 우항(오른쪽)이 먼저 실행된다!

		//복합 대입 연산자
		// +=, -=, *=, /=, %=
		// num += 3; -> num = num + 3;
		
		// 증감 연산자
		// ++피연산자, --피연산자, 피연산자++, 피연산자--
		
		// 비교 연산자 : 결과 boolean타입
		// >, <, >=, <=, ==, !=
		
		// 논리 연산자
		// !(Not), &&(And), ||(Or)
		// ! -> true, false 결과 뒤집는다
		// && -> 둘 다 true일 때만 true
		// || -> 둘 다 false일 때만 false
		
		// 조건 연산자 : 조건식의 결과에 따라 실행되는 곳이 다름
		// (조건식) ? (실행문1) : (실행문2)
		
		// 조건문
		// 1. 단순 if문
		// if(조건식){
		// 실행문장;
		// }
		// 조건식의 결과가 참(true)이면 실행문장 실행!
		// 거짓(false)이면 그냥 빠져나옴
		
		
		// 2. if-else문
		// 참과 거짓에 따라 실행문장이 달라질 때 사용!
		// if(조건식){
		// 실행문장;
		// }else{
		// 실행문장;
		// ;
		// 조건식의 결과가 참(true)이면 -> if절 실행문장 실행
		// 결과가 거짓(false)이면 -> else절 실행문장 실행
		
		// 3.else-if절
		// if(조건식)
		
//		int money = 5000;
//		if(돈이 카페모카 금액보다 많거나 같다면) {
//			카페모카 마실거야
//		}
		
		final int PRICE_CAFE_MOCHA = 4000;
		final int PRICE_YUZA_TEA = 3000;
		final int PRICE_AMERICANO = 2000;
		
		// 3000을 상수값으로 바꿔주시고 (->PRICE_YUZA_TEA)
		// 만약, 3000원미만 2000원 이상이라면
		// 아메리카노 주문
		// 2000원 미만이라면
		// 물
		
		
		// 자영 : 테스트를 위해 정수입력
		Scanner sc = new Scanner(System.in);
		System.out.print("소지 금액 : "); //자영 : ln 지우자!
		int money = sc.nextInt();
		
//		int money = 5000;
		if(money >= PRICE_CAFE_MOCHA) {
			System.out.println("카페모카 주문");
		} else if(money >= PRICE_YUZA_TEA) {
			System.out.println("유자차 주문");
		} else if(money >= PRICE_AMERICANO) {
			System.out.println("아메리카노 주문");
		} else {
			System.out.println("물 마시자");
		}
		
		
	}

}
