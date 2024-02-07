package day02;

import java.util.Scanner; //미리 만들어놓은 클래스 불러와야함! //자동완성 가능

public class Ex06Input {

	public static void main(String[] args) {

		// 입력
		// Java에서 입력 받는 방법 중 Scanner 사용
		// Scanner -> 레퍼런스 타입
		
		// 기본 데이터 타입
		// 키워드 변수명 = 값(value); //call by value
		
		// 레퍼런스 데이터 타입
		// 타입이름 변수명 = new 타입이름(); //call by reference (나중에 배열파트에서 다룸!!_ 
		
		// 콘솔창으로부터 입력 준비 끝
		Scanner sc = new Scanner(System.in); //Scanner 약어 sc 
		//System.in : console창으로부터 입력받음
		
		final int PRICE = 500;
		
		System.out.print("사려는 붕어빵의 개수 : "); //UI(User Interface)
		int count = sc.nextInt(); //nextInt : sc안에 많은 기능 중, 다음에 오는 정수를 받는 기능
		System.out.println(count * PRICE);
		
	
	}

}
