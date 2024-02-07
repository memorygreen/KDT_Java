package day02;

public class Ex11Opr {

	public static void main(String[] args) {

		// 문자열과 더하기!!
		
		System.out.println(7 + 3); //10(o)
		System.out.println("7" + "3"); //73 (문자열7,문자열3)		
		System.out.println("A" + "3"); //A3 
		System.out.println(7 + "3"); //73 (숫자7->문자열7 자동 형 변환)
		
		System.out.println(7 + 3 + "7"); // 107(o)
		System.out.println(7 + "3" + 7); // 737(o)
		System.out.println("7" + 3 + 7); // 737(o)
		System.out.println("7" + (3 + 7)); // 710 (뒤에 있는 숫자 괄호로묶으면 먼저 계산!)
				
	}

}
