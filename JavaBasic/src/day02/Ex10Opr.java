package day02;

public class Ex10Opr {

	public static void main(String[] args) {

		int num1 = 7;
		int num2 = 3;
		double num3 = 7.0;
		double num4 = 3.0;
		
		// 정수 (연산) 정수 -> 정수
		System.out.println(num1/num2); //2

		// 정수 (연산) 실수 -> 실수
		System.out.println(num1/num4); //2.0(x) => 2.33333
		
		// 실수 (연산) 실수 -> 실수
		System.out.println(num3/num4); //2.0(x) => 2.33333
		
	}

}
