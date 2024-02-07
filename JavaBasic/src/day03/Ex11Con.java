package day03;

import java.util.Scanner;

public class Ex11Con {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); //리팩토링1. 도구들은 맨 위에 있는게 좋다!

		// 과일 세트의 가격은 10000원
		final int FRUIT_SET = 10000; 
		// 사용자로부터 사려는 세트 개수를 입력받아
		System.out.print("사려는 과일 세트 개수 : "); 
		int count = sc.nextInt();
		
		// 총 금액을 계산하는 프로그램을 만들어주세요
		// 단, 11개 이상 구매 시 10% 할인
		// 5개 -> 50,000원
		// 8개 -> 80,000원
		// 12개 -> 120,000원 ->108,000원
		// 20개 -> 200,000원 ->180,000원
		
		// Refactorign : 코드의 결과는 동일하지만
		// 가독성을 높이거나 효율을 높이는 작업
		
		int price; //3. 2를 위해 (지역변수문제) 밖에서 선언
		double discount = 10 / 100.0; //5. 10% 
//		double discount = 10 * 1.0 / 100; //5. 10% 
//		double discount = 10 / 1.0 / 100; //5. 10% 
//		double discount = 10 / 1.0 / (double) 100; //5. 10% 
		if(count >= 11) {
			// 11이상
			//count가 12
			price = (int)(FRUIT_SET * count * (1 - discount));//4. int 제거(선언은 한번만) 
			//5. 0.9를 문제에 있는 값으로 표기 = 1-0.1
			
		}else{
			// 11미만
			price = FRUIT_SET * count; //4. int 제거(선언은 한번만)
		}
	
		System.out.println(price + "원"); //리팩토링 2. if, else 같은 구문 
		
	}

}
