package day04;

import java.util.Scanner;

public class self_study {

	public static void main(String[] args) {


		//구구단 2단 만들기
		for(int i=1 ; i<=9 ; i++) {
			System.out.println("2 * " + i + " = " + 2 * i + " ");
		}System.out.println();
		
		//printf사용하기
		
		for(int i = 1 ; i<=9;i++) {
//			System.out.printf("%d * %d = %d%n", 2, i, 2*i);//(x) 자영 : 맨 앞 2는 2로 써도 됐었다!
			System.out.printf("2 x %d = %d%n", i, 2*i);
		}
		
	}
}

