package javaFestival;

import java.util.Iterator;
import java.util.Random;

public class Ex18_240122 {

	public static void main(String[] args) {
		// 18번 (2024.01.22. 17:21~17:28 혼자 고민 실패!)

		Random ran = new Random();
		int[] arr = new int[6];

		// 6개 입력

		// 이중 for문 써야한다!! (2024.01.22. 17:28~17:33)
		for (int i = 0; i < arr.length; i++) {
			arr[i] = ran.nextInt(45) + 1;
			for (int j = 0; j < i; j++) {
				if (arr[i] == arr[j]) {
					i--;
				}
			}
		}
		
		
		// 출력
		for (int i = 0; i < arr.length; i++) {
			System.out.println("행운의 숫자 : " + arr[i]);
		}

	}

}
