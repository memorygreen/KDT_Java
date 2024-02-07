package day03;

public class Ex04Opr {

	public static void main(String[] args) {
		
		//5. 논리 연산자
		// ! (Not)
		// && (And) : Shift + 7
		// || (or) : Shift + \ 
		
		// 1) ! (Not)
		// boolean 결과를 반대로 뒤집는다
		System.out.println(!true); //false
		System.out.println(!false); //true
		
		boolean isRainy = false;

		//isRainy에 true가 들어있다면
		//false를 대입
		//false가 들어있다면
		//true 대입
		
		isRainy = !isRainy;
		System.out.println(isRainy);
		
		// 2) && (And)
		// (피연산자) && (피연산자)

		// Q1. 지금 비가 오나요? false 
		// Q2. 오늘은 금요일입니다? false
		// Q3. 지금 비가 안 오나요? true
		// Q4. 오늘은 목요일입니다? true
		
		// true && true -> true
		// ex. 지금 비가 안옵니다. 그리고 오늘은 목요일 입니다
		
		// true && false -> false
		// ex. 지금 비가 안오고 오늘은 금요일 입니다
		
		// false && true -> false
		// ex. 지금 비가 오고 오늘은 목요일입니다.
		
		// false && false -> false 
		// ex. 지금 비가 오고 오늘은 금요일입니다.
		
		// && : 둘 다 true 여야만 결과가 true
		
		// 논리곱(논리 결과)
		// 1 && 1 -> 1(true)
		// 1 && 0 -> 0(false)
		// 0 && 1 -> 0(false)
		// 0 && 0 -> 0(false)
		
		// 3) || (Or)
		// true || true -> true
		// ex. 지금 비가 안오거나 오늘은 목요일입니다
		// ex. 오늘 메뉴는 돈가스 이거나 김밥입니다 ->돈가스 해당o
	
		// true || false -> true
		// ex. 지금 비가 안 오거나(혹은) 오늘은 금요일입니다
		
		// false || true -> true
		
		// false || false -> false
		
		// 둘 다 false 일 때만 결과가 false다
		
		// 논리합
		// 1 || 1 -> 2 (true) //양수는 다 true로 취급
		// 1 || 0 -> 1 (true)
		// 0 || 1 -> 1 (true)
		// 0 || 0 -> 0 (false)
		
		// !(NOT) -> boolean 뒤집기
		// &&(And) -> 둘 다 true일 때만 true
		// || (Or) -> 둘 다 false일 때만 false
	}

}
