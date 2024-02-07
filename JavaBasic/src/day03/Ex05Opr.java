package day03;

public class Ex05Opr {

	public static void main(String[] args) {
		
		// 논리 연산자 연습
		
		System.out.println(3 > 2 && 10 < 20);//true
		System.out.println(3 > 2 && 10 > 20);//false
		System.out.println(3 < 2 && 10 < 20);//false
		System.out.println(3 < 2 && 10 > 20);//false
		
		System.out.println(3 > 2 || 10 < 20);//true
		System.out.println(3 > 2 || 10 > 20);//true
		System.out.println(3 < 2 || 10 < 20);//true
		System.out.println(3 < 2 || 10 > 20);//false
		
	}

}
