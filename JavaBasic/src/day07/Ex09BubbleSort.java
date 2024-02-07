package day07;

public class Ex09BubbleSort {

	public static void main(String[] args) {

		int[] array = { 9, 5, 1, 6, 7 };

		// 버블정렬 시작
		// 쌤풀이
		// 1STEP
//		if(array[0] > array[1]) {
//			int temp = array[0];
//			array[0] = array[1];
//			array[1] = temp;
//		}
//		
//		if(array[1] > array[2]) {
//			int temp = array[1];
//			array[1] = array[2];
//			array[2] = temp;
//		}
//		
//		
//		if(array[2] > array[3]) {
//			int temp = array[2];
//			array[2] = array[3];
//			array[3] = temp;
//		}
//		
//		if(array[3] > array[4]) {
//			int temp = array[3];
//			array[3] = array[4];
//			array[4] = temp;
//		}

//		//1STEP =>for문
//		for(int j = 0 ; j < array.length - 1  ; j++) { // < array.length는 에러난다!
//			if(array[j] > array[j + 1]) {
//				int temp = array[j];
//				array[j] = array[j + 1];
//				array[j + 1] = temp;
//			}
//		}
//		
////		
////		STEP 1 : 0,1
////		STEP 2 : 1,2
////		STEP 3  : 2,3
////		STEP 4  : 3,4
//		
//		
//		//2STEP
//		for(int j = 0 ; j < array.length - 2  ; j++) { // 어차피 1STEP 우측 끝은 정렬 돼있다! 인덱스 3,4는 비교 안 해도 돼
//			if(array[j] > array[j + 1]) {
//				int temp = array[j];
//				array[j] = array[j + 1];
//				array[j + 1] = temp;
//			}
//		}
//
//		
//		//3STEP
//		for(int j = 0 ; j < array.length - 3  ; j++) { // 어차피 2STEP 우측 끝은 정렬 돼있다! 인덱스 2,3 & 3,4는 비교 안 해도 돼
//			if(array[j] > array[j + 1]) {
//				int temp = array[j];
//				array[j] = array[j + 1];
//				array[j + 1] = temp;
//			}
//		}
//		
//		//4STEP
//		for(int j = 0 ; j < array.length - 4  ; j++) { 
//			if(array[j] > array[j + 1]) {
//				int temp = array[j];
//				array[j] = array[j + 1];
//				array[j + 1] = temp;
//			}
//		}

		// 1~4 STEP 패턴 존재! =>for문으로 감싸기
		for (int i = 1; i < array.length ; i++ ) {
			for(int j = 0 ; j < array.length - i  ; j++) { //array.length - 1 이면 정렬은 되지만 비효율적임!! 다음 회전에 불필요한 정렬까지 한다!!!//배열 길이 길수록 불필요한 비교 계속 하게된다!
				if(array[j] > array[j + 1]) {
					int temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;
				}
			}
		}

		// if 내림차순으로 하고 싶다면?
//		for (int i = 1; i < array.length; i++) {
//			for (int j = 0; j < array.length - i; j++) {
//				if (array[j] < array[j + 1]) { // 부등호만 반대로 하면 내림차순된다!!
//					int temp = array[j];
//					array[j] = array[j + 1];
//					array[j + 1] = temp;
//				}
//			}
//		}
		// 자영 시도중
//		int tmp = 0;

//		//0번 vs 1번
//		if(array[0] > array[1]) {
//			tmp = array[1];
//			array[1] = array[0];
//			array[0] = tmp;
//		}			
//		System.out.println(array[0] + " " + array[1]);
//		
//		//1번 vs 2번
//		if(array[1] > array[2]) {
//			tmp = array[2];
//			array[2] = array[1];
//			array[1] = tmp;
//		}	
//		System.out.println(array[1] + " " + array[2]);
//
//		//2번 vs 3번
//		if(array[2] > array[3]) {
//			tmp = array[3];
//			array[3] = array[2];
//			array[2] = tmp;
//		}	
//		System.out.println(array[1] + " " + array[2]);
//
//		//3번 vs 4번
//		if(array[3] > array[4]) {
//			tmp = array[4];
//			array[4] = array[3];
//			array[3] = tmp;
//		}	
//		System.out.println(array[4] + " " + array[3]);

		// 자영 시도중
//		for(int i = 0 ; i < array.length - 1 ; i++) {
//			if(array[i] > array[i+1]) {
//				tmp = array[i+1];
//				array[i+1] = array[i];
//				array[i] = tmp;
//			}
//			System.out.println(i + " vs " + (i+1) + " : " + array[i] + " " + array[i+1]);
//		}

//		for(int i = 0 ; i < array.length - 1 ; i++) {
//			if(array[i] > array[i+1]) {
//				tmp = array[i+1];
//				array[i+1] = array[i];
//				array[i] = tmp;
//			}
//			System.out.println(i + " vs " + (i+1) + " : " + array[i] + " " + array[i+1]);
//		}

		// 현빈님 힌트로 다시 한 번 도전!!!!
//		int tmp = 0;
//		for(int i = array.length ; i > 0 ; i--) {
//			
//			for(int j = 0 ; j < array.length - 1 ; j++) {
//				if(array[j] > array[j+1]) {
//					tmp = array[j+1];
//					array[j+1] = array[j];
//					array[j] = tmp;
//				}
//			}
//		}
//		
//		
		// 버블정렬 종료
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
	}


}
