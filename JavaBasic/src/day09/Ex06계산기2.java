package day09;

import java.util.Scanner;

public class Ex06계산기2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in); // Scanner도 메소드다! 우리가 입력한 값을 매개변수로 받는다!

		System.out.print("첫번째 정수 입력 : ");
		int num1 = sc.nextInt();
		System.out.print("두번째 정수 입력 : ");
		int num2 = sc.nextInt();
		System.out.print("연산자 입력(+, -, *, /) : ");
		String op = sc.next();
		System.out.println("cal : " + cal(num1, num2, op));
		System.out.println("cal2 : " + cal2(num1, num2, op));
		System.out.println("cal3 : " + cal3(num1, num2, op));

	}

	// 쌤풀이1
	public static int cal(int num1, int num2, String op) {

		int result = 0; // 결과

		if (op.equals("+")) {
			// 더하기
			return num1 + num2;

		} else if (op.equals("-")) {
			// 빼기
			return num1 - num2;
		} else if (op.equals("*")) {
			// 곱하기
			return num1 * num2;

		} else {
			// 나누기
			return num1 / num2;
		}

	}

	// 쌤풀이2
	public static int cal2(int num1, int num2, String op) {

		int result = 0; // 결과

		if (op.equals("+")) {
			// 더하기
			result = num1 + num2;
			} else if (op.equals("-")) {
			// 빼기
			result = num1 - num2;
			} else if (op.equals("*")) {
			// 곱하기
			result = num1 * num2;
			} else {
			// 나누기
			result = num1 / num2;
			}

			return result;
		}

	// 자영 풀이(오류남) (아마 result에 담아서 return해서 그런듯?)
	public static int cal3(int num1, int num2, String op){
			
			if(op.equals("+")) {
				int result = num1 + num2;
				return result ;
			}else if (op.equals("-")) {
				int result = num1 - num2;
				return result ;
			}else if (op.equals("*")) {
				int result = num1 * num2;
				return result ;
			}else { // "/"
				int result = num1 / num2;
				return result ;
			}
			
//			}else {
//				System.out.println("잘못 입력");
			//(x) 자영 에러 난 이유 -> return 값을 안 써서!!!!!!
//			}
		}

//		자영 혼자 하는데 아닌듯	
//		public static int add(int a, int b) {
//			return a + b;
//		}

}