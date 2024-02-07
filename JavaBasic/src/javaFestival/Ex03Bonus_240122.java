package javaFestival;

import java.util.Scanner;

public class Ex03Bonus_240122 {

	public static void main(String[] args) {
		// 보너스3번(2024.01.22. 17:05~17:12)
	Scanner sc = new Scanner(System.in);
	
	System.out.print("첫번째 정수 입력 : ");
	int num1 = sc.nextInt();
	System.out.print("두번째 정수 입력 : ");
	int num2 = sc.nextInt();
	char op ='/';
		
	
	System.out.println(cal(num1, num2, op));	
		
	}
	public static int cal(int num1, int num2, char op) {
		
		if(op =='+') {
			return num1 + num2;
		}else if(op == '-') {
			return num1 - num2;
		}else if(op == '*') {
			return num1 * num2;
		}else if(op == '/') {
			return num1 / num2;
		}
		
		return 0;
		
	}

}
