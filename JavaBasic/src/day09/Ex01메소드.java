package day09;

public class Ex01메소드 {

	public static void main(String[] args) {
		// (자영:)메소드가 필요한 이유?
		System.out.println(5 + 10);
		System.out.println(3 + 4);
		System.out.println(11 + 7);
		System.out.println(8 + 14);
		
		// 메소드 호출 //자영 : main 메소드 안에서 호출해야 실행 가능
		// 메소드이름(매개변수)
		System.out.println(sum(5, 10)); //만들어놓은 메소드 있으면 메소드명이 기울임체로 변함
		System.out.println(sum(3, 4));
		System.out.println(sum(11, 7));
		System.out.println(sum(8, 14));
		
	}
	
	// 메소드 구조
	// 1. 접근제한자 - public(내/외부에서 접근 가능)
	// 2. static - 저장공간
	// 3. 리턴타입 (리턴값이 없는 경우 void 키워드 사용)
	// 4. 메소드이름(매개변수 나열)
	// 5. return 키워드 -> 반환값 
	
	// 자영:sum 메소드 만들기 (매개변수o 리턴값o 경우)
	public static int sum(int a, int b) {
		int result = a + b + 2;
		return result;
	}
	
	

}
